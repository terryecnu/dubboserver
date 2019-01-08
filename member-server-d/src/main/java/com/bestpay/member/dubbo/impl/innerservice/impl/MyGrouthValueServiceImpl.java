package com.bestpay.member.dubbo.impl.innerservice.impl;

import com.bestpay.member.constant.MemberConstant;
import com.bestpay.member.dto.GrowValueDto;
import com.bestpay.member.dto.GrowthDetail;
import com.bestpay.member.dto.TaskDetailDto;
import com.bestpay.member.dto.TaskParameterDto;
import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.po.Customer;
import com.bestpay.member.po.MemberRank;
import com.bestpay.member.po.Right;
import com.bestpay.member.po.RightValue;
import com.bestpay.member.util.AssertUtil;
import com.bestpay.member.util.ResultInfo;
import com.bestpay.member.vo.*;
import com.bestpay.member.dubbo.impl.innerservice.IMyGrouthValueService;
import com.bestpay.member.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by WDL on 2018/11/27.
 */
@Service
public class MyGrouthValueServiceImpl implements IMyGrouthValueService {
	private static final String TAG = "MyGrouthValueServiceImpl";
	@Autowired
	private GrowthValueMapper growthValueMapper;
	@Autowired
	private GrowthValueTransMapper growthValueTransMapper;
	@Autowired
	private TaskMapper taskMapper;

	@Autowired
	private CustomerMapper customerMapper;
	@Autowired
	private MemberRankMapper rankMapper;

	@Autowired
	private RightValueMapper rightValueMapper;
	@Autowired
	private RightMapper rightMapper;

	private Logger logger = Logger.getLogger("MyGrouthValueServiceImpl");

    @Override
    public GrowValueDto queryMyGrowthValue(QueryGrowthDetailVo vo) throws Exception {
		// 查询基本成长值信息
		GrowValueDto growValueDto = growthValueMapper.queryMyGrowthValue(vo);
		Integer maxCurrentGrowthValue = null;
		if(growValueDto != null){
			maxCurrentGrowthValue = growValueDto.getMaxGrowValue();
		}

		// 查询下级会员等级
		GrowValueDto nextDtoValue = growthValueMapper.queryNextRankInfo(maxCurrentGrowthValue);
		Double currentGrowthValue = null;
		if(nextDtoValue != null){
			 currentGrowthValue = growValueDto.getGrowthValue();
		}
		// 当前等级的成长值
        Double differentValue = 0.0;
        //距下一等级最小成长值
        int nextMinValue = 0;
        String nextQualName = "";
        String nextQualFlag = "";
        String nextQualImg = "";
        if (nextDtoValue != null) {
            // 下级会员等级所需的最少成长值
            nextMinValue = nextDtoValue.getMinGrowValue();
            nextQualName = nextDtoValue.getNextQualName();
            nextQualFlag = nextDtoValue.getQuanlFlag();
            nextQualImg = nextDtoValue.getQuanlImg();
            // 获取差值
            if (!nextDtoValue.equals(null) && !currentGrowthValue.equals(null)) {
                differentValue = nextMinValue - currentGrowthValue;
            }
        } else {
            if(growValueDto != null){
                nextMinValue = growValueDto.getMaxGrowValue();
               // nextQualName = "顶级";
				// differentValue = nextMinValue - currentGrowthValue;
            }
        }

		if(growValueDto != null) {
			growValueDto.setDifferentValu(differentValue);
			growValueDto.setNextQualGrowthValue(nextMinValue);
			growValueDto.setNextQualName(nextQualName);
			growValueDto.setNextQualFlag(nextQualFlag);
			growValueDto.setNextQualImg(nextQualImg);
			// 查询成长记录
			List<GrowthDetail> growthDetails = growthValueTransMapper.queryGrowthDetailList(vo);
			growValueDto.setListDetail(growthDetails);
		}

		return growValueDto;
	}

	/**
	 * 查询成长社
	 *
	 * @param
	 * @return
	 */
	@Override
	public ResultInfo queryMytaskProcess(QueryGrowthDetailVo vo) throws Exception {
		// 查询我的成长值
		ResultInfo info = new ResultInfo();
		Map<String, Object> map = new HashMap<String, Object>();
		GrowValueDto growValueDto = growthValueMapper.queryMyGrowthValue(vo);
		Double growthValue = null;
		if(growValueDto != null){
			 growthValue = growValueDto.getGrowthValue();
		}

		map.put("growthValue", growthValue);
		// 根据用户id（userNo）已经完成任务
		int completedTaskCount = taskMapper.queryCompletedTaskCount(vo);
		// 查询后台配置的所有任务
		int allTaskCount = taskMapper.queryAllTaskCount();
		// 计算出未完成的任务
		int unCompletedTaskCount = allTaskCount - completedTaskCount;
		map.put("completedTaskCount", completedTaskCount);
		map.put("unCompletedTaskCount", unCompletedTaskCount);
		// 购买保险
		List<TaskDetailDto> buyInsuranceTask = new ArrayList<TaskDetailDto>();
		// 日常活跃
		List<TaskDetailDto> daliActiveTask = new ArrayList<TaskDetailDto>();
		// 其他活动
		List<TaskDetailDto> otherActiveTask = new ArrayList<TaskDetailDto>();
		List<TaskDetailDto> allTaskList = taskMapper.queryBuyInsuranceTask();
		// 声明一个查询任务完成数量的vo对象
		QueryCompleteTaskCountVo taskCountVo = new QueryCompleteTaskCountVo();
		taskCountVo.setUserNo(vo.getUserNo());

		for (TaskDetailDto ll : allTaskList) {
			taskCountVo.setTaskId(ll.getTaskId());
			// 根据taskId和userNo查询所有截止目前的所有数量
			int allCount = taskMapper.queryAllCount(taskCountVo);
			int monthCount = taskMapper.queryMonthlyCount(taskCountVo);
			int daliCount  = taskMapper.queryDaliCount(taskCountVo);
			/**
			 * 判断是否完成该任务
			 */
			// 如果所有次数已经满足则为true
			if (ll.getMaxNum() <= allCount && ll.getMaxNum() != 0) {
				ll.setFinished(true);
				// 根据taskId和userNo查询本月的所有数量
			} else if (ll.getMonthNum() <= monthCount && ll.getMonthNum() != 0) {
				ll.setFinished(true);
				// 根据taskId和userNo查询当天数量
			} else if (ll.getDayNum() <= daliCount && ll.getDayNum() != 0) {
				ll.setFinished(true);
			} else {

			}
			// 如果为购买保险
			if (ll.getTaskType() == 1) {
				buyInsuranceTask.add(ll);
			}
			// 如果为日常活动参与
			else if (ll.getTaskType() == 2) {
				daliActiveTask.add(ll);
			}
			// 日常活动参与
			else if (ll.getTaskType() == 3) {
				otherActiveTask.add(ll);
			} else {

			}
		}
		map.put("buyInsuranceTask", buyInsuranceTask);
		map.put("daliActiveTask", daliActiveTask);
		map.put("otherActiveTask", otherActiveTask);
		info.setData(map);
		return info;
	}

	/**
	 * 购买保单任务取消(本系统暂不支持退保)
	 * 
	 * @return
	 */
	private ResultInfo cancelPurchaseTask() {

		return ResultInfo.ERROR();
	}

	/**
     * @param taskType     任务类型(3 分享,4 活动,1 购买,2,签到)
     * @param activityType 子任务类型(分享,购买,签到是(null),活动是活动类型(1 智能保险测评,2 免费领取重疾险,3 健康档案))
	 * 
	 * @return
	 */
    @Transactional
    @Override
    public ResultInfo completePurchaseTask(TaskCompleteVo vo) throws BusiException {
        Integer taskType = vo.getTaskType();
        Integer activityType = vo.getActivityType();
        String userNo = vo.getUserNo();
        //判断用户是否已经存在
        AssertUtil.isTrue(customerMapper.isUserExists(userNo) < 1,
                MemberConstant.BUSI_FAILD_CODE, MemberConstant.USER_NOT_EXITS);
        // (1)找到该类型的任务列表
		// (1.1) 请求参数
		Map<String, Object> queryTaskSetting = new HashMap<String, Object>();
		queryTaskSetting.put("taskType", taskType);
		queryTaskSetting.put("activityType", activityType);
		// (1.2) 查询
		List<TaskParameterDto> tasks = taskMapper.queryForActType(queryTaskSetting);
		if (tasks == null || tasks.isEmpty()) {
			return ResultInfo.ERROR();
		}

		boolean isChanage = false;// 成长值是否有变更Flag

		// (2)循环任务列表
		for (TaskParameterDto _taskP : tasks) {
			logger.info(String.format("任务类型[%s],任务id[%s],max[%s],month[%s],day[%s],任务成长值[%s],限制保单类型[%s],保单数[%s],保费[%s]",_taskP.getPurchasePolicyType(),_taskP.getTaskId(),_taskP.getMaxNumber(),_taskP.getMonthNumber(),_taskP.getDayNumber(),_taskP.getValue(),_taskP.getInsuranceType(),_taskP.getInsuranceNumber(), _taskP.getPremium()));
			// (2.1) 判断任务是否已经完成过了
			if (!checkCompleteTask(userNo, _taskP)) {
				logger.info(String.format("未通过校验，该任务不能完成[%s]",_taskP.getTaskId()));
				continue;
			}

			// (2.2) 任务能否完成逻辑校验
			boolean _isComplete = false;// 是否能完成任务Flag
			if (taskType == 1) { // 保单
				// (一)进行保单逻辑判断
				int _purchasePolicyType = _taskP.getPurchasePolicyType();
				
				if (_purchasePolicyType == 1) { // (一.一) 首单判断

					// >1 获取用户的该类型的保单数参数
					Map<String, Object> _queryPurchasePolicySetting = new HashMap<String, Object>();
					Integer insuranceType = _taskP.getInsuranceType();//限制保单类型
					if(insuranceType!=1) {//1 为全部
						//1 全部、2 健康、3 财产、4 意外、5 趣味
						_queryPurchasePolicySetting.put("insuranceType", insuranceType);
					}
					_queryPurchasePolicySetting.put("userNo", userNo);
					logger.info(String.format("用户首单查询参数{%S}", _queryPurchasePolicySetting));

					// >2 用户的该类型的保单数 (数量查询逻辑是有问题的，限制保单类型是对的)
					int _cnt1 = taskMapper.queryPolicyCnt(_queryPurchasePolicySetting);
					logger.info(String.format("用户该种保单数量%s，任务要求保单数1", _cnt1));

					// >3 判断是否大于0
					_isComplete = _cnt1 > 0;
				} else if (_purchasePolicyType == 2) {// (一.二) 累计保单数判断

					// >1 查询用户累计保单
					int _cnt2 = taskMapper.queryPolicyCnt2(userNo);
					logger.info(String.format("用户累计保单数%s，任务要求保单数%s", _cnt2, _taskP.getInsuranceNumber()));

					// >2判断用户保单数是否到达任务要求的数量
					_isComplete = _cnt2 >= _taskP.getInsuranceNumber();
				} else if (_purchasePolicyType == 3) {// (一.三) 累计保费判断

					// >1查询用户的累计保费
					Double _cnt3 = taskMapper.queryPolicySum(userNo);
					logger.info(String.format("用户累计保费%s，任务要求保费%s", _cnt3, _taskP.getPremium()));

					// >2判断用户的累计保费是否到达任务要求
					_isComplete = _cnt3 >= _taskP.getPremium();
				}
			} else {// 非保单
				// (二) 非保单则直接完成
				_isComplete = true;
			}
			// (2.3) 逻辑校验通过 完成任务
			logger.info(String.format("是否可以完成任务[%s]", _isComplete));
			if (_isComplete) {
				// >1 完成任务
				completeTask(userNo, _taskP);
				// >2 修改Flag
				isChanage = true;
			}

		}
		// (3)用户成长值有变更 需要进行等级提升逻辑
		logger.info(String.format("用户成长值变更[%s]", isChanage));
		if (isChanage) {
			userRankchange(userNo);
		}
		return ResultInfo.OK();

	}

	/**
	 * 完成任务
	 * 
	 * @param userNo
	 * @param taskParameterDto
	 */
	private void completeTask(String userNo, TaskParameterDto taskParameterDto) {
		// 添加完成记录
		ToCompleteTaskVo tvo = new ToCompleteTaskVo();
		tvo.setTaskId(taskParameterDto.getTaskId());
		tvo.setUserNo(userNo);
		tvo.setCustTaskType(taskParameterDto.getTaskActType());
		logger.info(String.format("添加完成记录%s", tvo));

		int completeTask = taskMapper.toCompleteTask(tvo);
		logger.info(String.format("添加完成记录结果%s", completeTask));

		// 添加成长值
		Integer growthValue = taskParameterDto.getValue();
		// 用户成长值比率
		Double growthRate = taskMapper.queryUserRate(userNo);
		double taskGrowthValue = growthValue.intValue() * (growthRate==null||growthRate==0? 1:growthRate.doubleValue());
		logger.info(String.format("任务成长值为%s,用户成长值比率为%s,计算结果为%s", growthValue, growthRate,taskGrowthValue));

		int updateGrowthValue = growthValueMapper.updateGrowthValue(userNo, taskGrowthValue);// 更新用户表的成长值
		logger.info(String.format("更新用户表的成长值结果[%s]", updateGrowthValue));

		int updateAcctGrowthValue = growthValueMapper.updateAcctGrowthValue(userNo);// 更新账户的成长值与用户成长值一致
		logger.info(String.format("更新账户的成长值与用户成长值一致结果[%s]", updateAcctGrowthValue));

		GrowthTransVo transVo = new GrowthTransVo();// 查询任务详情
		String timeStamp = growthValueMapper.getTimeStamp();// 获取交易编号
		logger.info(String.format("交易编号[%s]", timeStamp));
		transVo.setAcctTransNo(timeStamp);
		transVo.setBpCode(2); // 1--有效期 2---做任务
		transVo.setBusiId(String.valueOf(taskParameterDto.getTaskId()));
		transVo.setTransType(1);// 交易类型为收入1--收入 0---支出

		// 获取更新之后的成长值
		Double queryGrowthValue = taskMapper.queryGrowthValue(userNo);
        logger.info(String.format("获取更新之后的成长值[%s]", queryGrowthValue));

		transVo.setThisAcctAmount(queryGrowthValue);
		transVo.setTransGrowthValue(growthRate);
		transVo.setUserNo(userNo);
        String transContext = String.format("完成任务,加成长值%s", taskGrowthValue);
        transVo.setTransContext(transContext);
        logger.info(String.format("插入成長值交易记录[%s]", transVo));
        // 插入成長值交易记录表
		int insertGrowthRecord = growthValueTransMapper.insertGrowthRecord(transVo);
		logger.info(String.format("插入成長值交易记录结果[%s]", insertGrowthRecord));
	}

	/**
	 * 任务是否已经被完成
	 * 
	 * @param taskId
	 * @return
	 */
	public boolean checkCompleteTask(String userNo, TaskParameterDto taskParameterDto) {
		Assert.notNull(taskParameterDto, "错误[NTPD]");
		Assert.notNull(userNo, "错误[NUN]");
		int taskId = taskParameterDto.getTaskId();
		// 根据三要素来找完成记录
		QueryCompleteTaskCountVo tvo = new QueryCompleteTaskCountVo();
		tvo.setTaskId(taskId);
		tvo.setUserNo(userNo);

		int maxCnt = taskParameterDto.getMaxNumber(); // 最多能完成多少次
		int userMaxCnt = taskMapper.queryAllCount(tvo);// 用户该任务完成的总量
		logger.info(String.format("任务总共可以完成[%s],用户累计完成[%s]", maxCnt, userMaxCnt));
		// Assert.isTrue(maxCnt == 0 || maxCnt > userMaxCnt, "该任务已经完成过了");
		if (!(maxCnt == 0 || maxCnt > userMaxCnt)) {
			return false;
		}

		int maxMonth = taskParameterDto.getMonthNumber();// 每月最多能完成多少次
		int userMaxMonth = taskMapper.queryMonthlyCount(tvo);// 用户当月能完成了多少次
		logger.info(String.format("任务当月可完成[%s]用户当月已完成[%s]", maxMonth, userMaxMonth));
		// Assert.isTrue(maxMonth == 0 || maxMonth > userMaxMonth, "该任务本月不能再完成了");
		if (!(maxMonth == 0 || maxMonth > userMaxMonth)) {
			return false;
		}

		int maxDay = taskParameterDto.getDayNumber(); // 每天最多能完成多少次
		int userMaxDy = taskMapper.queryDaliCount(tvo); // 用户当天完成了多少次
		logger.info(String.format("任务当天可完成:[%s],用户当天完成:[%s]", maxDay, userMaxDy));
		// Assert.isTrue(maxDay == 0 || maxDay > userMaxDy, "该任务当天不能再完成了");
		if (!(maxDay == 0 || maxDay > userMaxDy)) {
			return false;
		}
		// 都可以则通过
		return true;
	}

	/**
	 * 去完成操作
	 *
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public ResultInfo toCompleteTask(ToCompleteTaskVo vo) throws Exception {
		ResultInfo info = new ResultInfo();
		boolean flag = false;
		int custTaskType = vo.getCustTaskType();
		System.out.println("----------------------------->1111");
		if (custTaskType != 1) {
			// 外部接口返回状态
			// 》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》
			flag = true;
		}
		if (flag || (custTaskType == 1)) {
			// 插入用户记录表信息
			int result = taskMapper.toCompleteTask(vo);
			System.out.println("----------------------------->2222" + result);
			if (result > 0) {
				if (!vo.getTaskId().equals(null)) {
					// 根据taskId查询对应的成长值
					Double growthValue = growthValueMapper.queryGrowthValueById(vo.getTaskId());
					// 根据用户信息查询做任务前的成长值
					QueryGrowthDetailVo queryGrowthDetailVo = new QueryGrowthDetailVo();
					queryGrowthDetailVo.setUserNo(vo.getUserNo());
					// 更新用户表的成长值
					int resultNum = growthValueMapper.updateGrowthValue(vo.getUserNo(), growthValue);
					GrowValueDto growValueDto = growthValueMapper.queryMyGrowthValue(queryGrowthDetailVo);
					Double upateBeforeGrowthValue = growValueDto.getGrowthValue();
					if (resultNum > 0) {
						// 更新账户的成长值与用户成长值一致
						int resultAcct = growthValueMapper.updateAcctGrowthValue(vo.getUserNo());
						// 查询任务详情
						GrowthTransVo transVo = new GrowthTransVo();
						// 获取交易编号
						String timeStamp = growthValueMapper.getTimeStamp();
						transVo.setAcctTransNo(timeStamp);
						if (!vo.getTaskId().equals(null)) {
							// 1--有效期 2---做任务
							transVo.setBpCode(2);
							transVo.setBusiId(String.valueOf(vo.getTaskId()));
							// 交易类型为收入1--收入 0---支出
							transVo.setTransType(1);
						} else {
							transVo.setBpCode(1);
							transVo.setTransType(0);
						}
						transVo.setThisAcctAmount(upateBeforeGrowthValue);
						transVo.setTransGrowthValue(growthValue);
						transVo.setUserNo(vo.getUserNo());
						// 插入成長值交易记录表
						int resultRecord = growthValueTransMapper.insertGrowthRecord(transVo);
						// 测试事物---------------------------------------------------------------------------------
						// int i = 1 / 0;
					}
				} else {
					info.setCode(MemberConstant.BUSI_FAILD_CODE);
					info.setMsg(MemberConstant.BUSI_FALID_MSG);
				}
				info.setCode(MemberConstant.BUSI_SUCCESS_CODE);
				info.setMsg(MemberConstant.BUSI_SUCESS_MSG);
			} else {
				info.setCode(MemberConstant.BUSI_FAILD_CODE);
				info.setMsg(MemberConstant.BUSI_FALID_MSG);
			}
		}
		return info;
	}

	/**
	 * 用户等级变更
	 * 
	 * @param userNo
	 * @param currentGrouthValue 用户当前成长值，有则传
	 * @return
	 */
	public ResultInfo userRankchange(String userNo) {
		logger.info(String.format("用户的编号为%s", "a"));
		Assert.hasLength(userNo, "userNo 不能为空");
		// 用户当前成长值
		Double currentGrouthValue = null;
		// 用户当前等级
		Integer currentIdRank = null;
		// 用户id
		Integer customerId = null;
		try {
			Customer _user = customerMapper.selectByUserNo(userNo);
			currentGrouthValue = _user.getGrowthValue();
			currentIdRank = _user.getIdRank();
			customerId = _user.getCrmId();
		} catch (Exception e) {
			logger.info(String.format("获取用户信息出错%s", e.getMessage()));
			logger.log(Level.INFO, "获取用户信息出错", e);
		}

		logger.info(String.format("用户id为%s", customerId));
		Assert.notNull(customerId, "未取到用户");

		logger.info(String.format("用户当前成长值为%s", currentGrouthValue));
		Assert.notNull(currentGrouthValue, "未取到用户成长值");

		logger.info(String.format("用户id为%s", customerId));
		Assert.notNull(customerId, "未取到用户");

		logger.info(String.format("用户当前等级为%s", currentIdRank));
		Assert.notNull(currentGrouthValue, "未取到用户等级");

		// 根据等级找当前等级项的最低值
		Double currentRankMinValue = null;// 当前等级的最低值
		try {
			MemberRank _selectByPrimaryKey = rankMapper.selectByPrimaryKey(currentIdRank);
			currentRankMinValue = _selectByPrimaryKey.getGrowthValueMin();
		} catch (Exception e) {
			// TODO: handle exception
			// e.printStackTrace();
			logger.info(String.format("获取等级信息出错%s", e.getMessage()));
			logger.log(Level.INFO, "获取等级信息出错", e);
		}

		logger.info(String.format("用户当前等级的最低成长值为%s", currentRankMinValue));
		Assert.notNull(currentRankMinValue, "未取到等级最低成长值");

		logger.info(String.format("currentGrouthValue<currentRankMinValue:%s", currentGrouthValue < currentRankMinValue));

		if (currentGrouthValue < currentRankMinValue) {
			HashMap<String, Object> _map = new HashMap<String, Object>();
			_map.put("minValue1", currentRankMinValue);
			_map.put("minValue2", currentGrouthValue);
			// 一定降级,无可降就抹掉用户等级，可能存在多次降级
			List<MemberRank> _selectDownRank = rankMapper.selectDownRank(_map);
			logger.info(_selectDownRank.toString());
			if (_selectDownRank == null || _selectDownRank.isEmpty()) {
				logger.info(String.format("%s无可降级区间,需要抹掉等级", userNo));
				userRankChange2(customerId, userNo, false, null);
			} else {
				for (MemberRank _memberRank : _selectDownRank) {
					logger.info(String.format("%s降级为%s,等级id为%s", userNo, _memberRank.getRankName(),
							_memberRank.getMemberRankId()));
					userRankChange2(customerId, userNo, false, _memberRank.getMemberRankId().intValue());
				}
			}
		} else {
			// 可以升级,要去查是否有符合的等级项,可能存在跳级
			HashMap<String, Object> _map = new HashMap<String, Object>();
			_map.put("minValue1", currentGrouthValue);
			_map.put("minValue2", currentRankMinValue);
			//现在降级是直接降到成长值对应等级，不做跳级
			List<MemberRank> _selectUpRank = rankMapper.selectUpRank(_map);
			logger.info(_selectUpRank.toString());

			if (_selectUpRank == null || _selectUpRank.isEmpty()) {
				logger.info(String.format("%s无升级", userNo));
			} else {
				for (MemberRank _memberRank : _selectUpRank) {
					logger.info(String.format("%s升级为%s,等级id为%s", userNo, _memberRank.getRankName(),
							_memberRank.getMemberRankId()));
					userRankChange2(customerId, userNo, true, _memberRank.getMemberRankId().intValue());
				}
			}
		}
		return ResultInfo.OK();
	}

	/**
	 * 用户等级变更-等级变更,外部交互
	 * 
	 * @param userNo
	 * @param rankId 等级id
	 * @param isUp   是否升级
	 * @return
	 */
	public void userRankChange2(Integer customerId, String userNo, Boolean isUp, Integer rankId) {
		// 修改等级
		Customer customerDto = new Customer();
		customerDto.setUserNo(userNo);
		customerDto.setIdRank(rankId);
		customerDto.setCrmId(customerId);
		customerDto.setIdRankAt(new Date());
		int upCnt = customerMapper.updateByPrimaryKeySelective(customerDto);
		logger.info(String.format("%s用户修改等级为%s的结果为%s", userNo, rankId, upCnt));
		Assert.isTrue(upCnt > 0, "用户等级修改失败");

		// 查询等级权益 降级是否需要推送权益 可以通过isUp来进行判断
		List<Right> selectByRankId = rightMapper.selectByRankId(rankId);
		logger.info(String.format("%s等级的权益项有%s", rankId, selectByRankId));

		for (Right _right : selectByRankId) {
			// 查询此权益项下的配置
			List<RightValue> selectByRightId = rightValueMapper.selectByRightId(_right.getInsuranceCrmRightId());

			// 推送权益（参数：活动号,渠道编号,手机号,翼支付账户）

		}
	}

}