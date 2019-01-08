package com.bestpay.member.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bestpay.member.api.IMyGrouthValueApi;
import com.bestpay.member.dto.GrowValueDto;
import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.util.ResultInfo;
import com.bestpay.member.vo.QueryGrowthDetailVo;
import com.bestpay.member.vo.TaskCompleteVo;
import com.bestpay.member.vo.ToCompleteTaskVo;
import com.bestpay.member.dubbo.impl.innerservice.IMyGrouthValueService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by WDL on 2018/11/27.
 */
@Service(version = "1.0.0")
public class MyGrouthValueDubboApiImpl implements IMyGrouthValueApi {

    @Autowired
    private IMyGrouthValueService myGrouthValueService;

    @Override
    public GrowValueDto queryMyGrowthValue(QueryGrowthDetailVo vo) throws Exception {
        return this.myGrouthValueService.queryMyGrowthValue(vo);
    }

    @Override
    public ResultInfo queryMytaskProcess(QueryGrowthDetailVo vo) throws Exception {
        return this.myGrouthValueService.queryMytaskProcess(vo);
    }

    @Override
    public ResultInfo toCompleteTask(ToCompleteTaskVo vo) throws Exception {
        return this.myGrouthValueService.toCompleteTask(vo);
    }

    @Override
    public ResultInfo completePurchaseTask(TaskCompleteVo vo) throws BusiException {
        return this.myGrouthValueService.completePurchaseTask(vo);
    }
    /*private static final String TAG = "MyGrouthValueServiceImpl";
    @Autowired
    private GrowthValueMapper growthValueMapper;
    @Autowired
    private GrowthValueTransMapper growthValueTransMapper;
    @Autowired
    private TaskMapper taskMapper;
    @Autowired
    private IcommonService icommonService;



    public GrowValueDto queryMyGrowthValue(QueryGrowthDetailVo vo) throws Exception {
        //查询基本成长值信息
        GrowValueDto growValueDto = growthValueMapper.queryMyGrowthValue(vo);
        Integer maxCurrentGrowthValue = growValueDto.getMaxGrowValue();
        //查询下级会员等级
        GrowValueDto nextDtoValue = growthValueMapper.queryNextRankInfo(maxCurrentGrowthValue);
        //当前等级的成长值
        Double currentGrowthValue = growValueDto.getGrowthValue();
        //下级会员等级所需的最少成长值
        Integer nextMinValue = nextDtoValue.getMinGrowValue();
        //获取差值
        Double differentValue = 0.0;
        if (!nextDtoValue.equals(null) && !currentGrowthValue.equals(null)) {
            differentValue = nextMinValue - currentGrowthValue;
        }
        growValueDto.setDifferentValu(differentValue);
        growValueDto.setNextQualGrowthValue(nextDtoValue.getMinGrowValue());
        growValueDto.setNextQualName(nextDtoValue.getCurrentQualName());
        growValueDto.setNextQualFlag(nextDtoValue.getQuanlFlag());
        growValueDto.setNextQualImg(nextDtoValue.getQuanlImg());
        //查询成长记录
        List<GrowthDetail> growthDetails = growthValueTransMapper.queryGrowthDetailList(vo);
        growValueDto.setListDetail(growthDetails);
        return growValueDto;
    }

    *//**
     * 查询成长社
     *
     * @param
     * @return
     *//*
    @Override
    public ResultInfo queryMytaskProcess(QueryGrowthDetailVo vo) throws Exception {
        //查询我的成长值
        ResultInfo info = new ResultInfo();
        Map<String, Object> map = new HashMap<String, Object>();
        GrowValueDto growValueDto = growthValueMapper.queryMyGrowthValue(vo);
        Double growthValue = growValueDto.getGrowthValue();
        map.put("growthValue", growthValue);
        //根据用户id（userNo）已经完成任务
        int completedTaskCount = taskMapper.queryCompletedTaskCount(vo);
        //查询后台配置的所有任务
        int allTaskCount = taskMapper.queryAllTaskCount();
        //计算出未完成的任务
        int unCompletedTaskCount = allTaskCount - completedTaskCount;
        map.put("completedTaskCount", completedTaskCount);
        map.put("unCompletedTaskCount", unCompletedTaskCount);
        //购买保险
        List<TaskDetailDto> buyInsuranceTask = new ArrayList<TaskDetailDto>();
        //日常活跃
        List<TaskDetailDto> daliActiveTask = new ArrayList<TaskDetailDto>();
        //其他活动
        List<TaskDetailDto> otherActiveTask = new ArrayList<TaskDetailDto>();
        List<TaskDetailDto> allTaskList = taskMapper.queryBuyInsuranceTask();
        //声明一个查询任务完成数量的vo对象
        QueryCompleteTaskCountVo taskCountVo = new QueryCompleteTaskCountVo();
        taskCountVo.setUserNo(vo.getUserNo());

        for (TaskDetailDto ll : allTaskList) {
            taskCountVo.setTaskId(ll.getTaskId());
            //根据taskId和userNo查询所有截止目前的所有数量
            int allCount = taskMapper.queryAllCount(taskCountVo);
            int monthCount = taskMapper.queryMonthlyCount(taskCountVo);
            int daliCount = daliCount = taskMapper.queryDaliCount(taskCountVo);
            *//**
             * 判断是否完成该任务
     *//*
            //如果所有次数已经满足则为true
            if (ll.getMaxNum() <= allCount && allCount != 0) {
                ll.setFinished(true);
                //根据taskId和userNo查询本月的所有数量
            } else if (ll.getMonthNum() <= monthCount && monthCount != 0) {
                ll.setFinished(true);
                //根据taskId和userNo查询当天数量
            } else if (ll.getDayNum() <= daliCount && daliCount != 0) {
                ll.setFinished(true);
            } else {

            }
            //如果为购买保险
            if (ll.getTaskType() == 1) {
                buyInsuranceTask.add(ll);
            }
            //如果为日常活动参与
            else if (ll.getTaskType() == 2) {
                daliActiveTask.add(ll);
            }
            //日常活动参与
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

    *//**
     * 去完成操作
     *
     * @param vo
     * @return
     * @throws Exception
     *//*

    @Override
    public ResultInfo toCompleteTask(ToCompleteTaskVo vo) throws Exception {
        ResultInfo info = new ResultInfo();
        boolean flag = false;
        int custTaskType = vo.getCustTaskType();
        System.out.println("----------------------------->1111");
        if (custTaskType != 1) {
            //外部接口返回状态
            // 》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》
            flag = true;
        }
        if (flag || (custTaskType == 1)) {
            //插入用户记录表信息
            int result = taskMapper.toCompleteTask(vo);
            System.out.println("----------------------------->2222"+result);
            if (result > 0) {
                if (!vo.getTaskId().equals(null)) {
                    //根据taskId查询对应的成长值
                    Double growthValue = growthValueMapper.queryGrowthValueById(vo.getTaskId());
                    //根据用户信息查询做任务前的成长值
                    QueryGrowthDetailVo queryGrowthDetailVo = new QueryGrowthDetailVo();
                    queryGrowthDetailVo.setUserNo(vo.getUserNo());
                    //更新用户表的成长值
                    int resultNum = growthValueMapper.updateGrowthValue(vo.getUserNo(), growthValue);
                    GrowValueDto growValueDto = growthValueMapper.queryMyGrowthValue(queryGrowthDetailVo);
                    Double upateBeforeGrowthValue = growValueDto.getGrowthValue();
                    if (resultNum > 0) {
                        //更新账户的成长值与用户成长值一致
                        int resultAcct = growthValueMapper.updateAcctGrowthValue(vo.getUserNo());
                        //查询任务详情
                        GrowthTransVo transVo = new GrowthTransVo();
                        //获取交易编号
                        String timeStamp = growthValueMapper.getTimeStamp();
                        transVo.setAcctTransNo(timeStamp);
                        if (!vo.getTaskId().equals(null)) {
                            //1--有效期  2---做任务
                            transVo.setBpCode(2);
                            transVo.setBusiId(String.valueOf(vo.getTaskId()));
                            //交易类型为收入1--收入  0---支出
                            transVo.setTransType(1);
                        } else {
                            transVo.setBpCode(1);
                            transVo.setTransType(0);
                        }
                        transVo.setThisAcctAmount(upateBeforeGrowthValue);
                        transVo.setTransGrowthValue(growthValue);
                        transVo.setUserNo(vo.getUserNo());
                        //插入成長值交易记录表
                        int resultRecord = growthValueTransMapper.insertGrowthRecord(transVo);
                        //测试事物---------------------------------------------------------------------------------
                    //   int i = 1 / 0;
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
    }*/
}