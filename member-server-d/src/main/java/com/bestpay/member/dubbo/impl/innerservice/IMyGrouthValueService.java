package com.bestpay.member.dubbo.impl.innerservice;

import com.bestpay.member.dto.GrowValueDto;
import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.util.ResultInfo;
import com.bestpay.member.vo.QueryGrowthDetailVo;
import com.bestpay.member.vo.TaskCompleteVo;
import com.bestpay.member.vo.ToCompleteTaskVo;

/**
 * @Author: WDL
 * @Description:
 * @Date: Created in 16:33 2018/12/27
 */
public interface IMyGrouthValueService {
    GrowValueDto queryMyGrowthValue(QueryGrowthDetailVo vo) throws Exception;


    public ResultInfo queryMytaskProcess(QueryGrowthDetailVo vo) throws Exception;

    /**
     * @param taskType     任务类型(3 分享,4 活动,1 购买,2,签到)
     * @param activityType 子任务类型(分享,购买,签到是(null),活动是活动类型(1 智能保险测评,2 免费领取重疾险,3 健康档案))
     * @return
     */
    public ResultInfo completePurchaseTask(TaskCompleteVo vo) throws BusiException;

    ResultInfo toCompleteTask(ToCompleteTaskVo vo) throws Exception;
}
