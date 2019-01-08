package com.bestpay.member.mapper;

import com.bestpay.member.dto.TaskDetailDto;
import com.bestpay.member.dto.TaskDto;
import com.bestpay.member.dto.TaskParameterDto;
import com.bestpay.member.po.Task;
import com.bestpay.member.vo.QueryCompleteTaskCountVo;
import com.bestpay.member.vo.QueryGrowthDetailVo;
import com.bestpay.member.vo.ToCompleteTaskVo;

import java.util.List;
import java.util.Map;

public interface TaskMapper {
    /**
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer insuranceCrmTaskId);

    /**
     * @mbggenerated 2018-11-26
     */
    int insert(Task record);


    /**
     * @mbggenerated 2018-11-26
     */
    Task selectByPrimaryKey(Integer insuranceCrmTaskId);

    /**
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(Task record);

    /**
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(Task record);

    /**
     * 查询用户已经完成的任务数量
     * @return
     */
    int queryCompletedTaskCount(QueryGrowthDetailVo vo);
    /**
     * 查询所有任务
     * @return
     */
    int queryAllTaskCount();

    /**
     *查询购买保险的任务列表
     */
    List<TaskDetailDto> queryBuyInsuranceTask();

    /**
     * 查询当天的任务数量（根据taskid  userNo）
     * @param vo
     * @return
     */
    int  queryDaliCount(QueryCompleteTaskCountVo vo);
    /**
     * 查询本月的任务数量（根据taskid  userNo）
     * @param vo
     * @return
     */
    int  queryMonthlyCount(QueryCompleteTaskCountVo vo);
    /**
     * 查询截止当前的所有数量（根据taskid  userNo）
     * @param vo
     * @return
     */
    int  queryAllCount(QueryCompleteTaskCountVo vo);
    /**
     * 插入用户任务表
     * @param vo
     * @return
     */
    int toCompleteTask(ToCompleteTaskVo vo);

    /**
     * 查询用户中心 签到 分享 各一条记录
     * @return
     */
    List<TaskDto> selectMemberCenterTaskDtosByUserNo();

    /**
     * 根据任务类型查询任务
     * @param actType
     * @return
     */
//    List<Task> queryForActType( Integer actType);
    
    /**
     * 查询任务参数Integer actType,Integer busiId
     * @return
     */
    List<TaskParameterDto> queryForActType(Map<String, Object> map);
    
    /**
     * 首单查询 Integer policyType,String userNo
     * @return
     */
    int queryPolicyCnt(Map<String, Object> map);
    
    /**
     * 保单数量查询
     * @param userNo
     * @return
     */
    int queryPolicyCnt2(String userNo);
    
    /**
     * 保费查询
     * @param userNo
     * @return
     */
    Double queryPolicySum(String userNo);
    
    /**
     * 成长值查询
     * @param userNo
     * @return
     */
    Double queryGrowthValue(String userNo);
    
    /**
     * 用户成长值比率查询
     * @param userNo
     * @return
     */
    Double queryUserRate(String userNo);
}