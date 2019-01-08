package com.bestpay.member.api;

import com.bestpay.member.dto.GrowValueDto;
import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.util.ResultInfo;
import com.bestpay.member.vo.QueryGrowthDetailVo;
import com.bestpay.member.vo.TaskCompleteVo;
import com.bestpay.member.vo.ToCompleteTaskVo;

/**
 * Created by WDL on 2018/11/27.
 */
public interface IMyGrouthValueApi {
    GrowValueDto queryMyGrowthValue(QueryGrowthDetailVo vo) throws Exception;


    public ResultInfo queryMytaskProcess(QueryGrowthDetailVo vo) throws Exception;


    ResultInfo toCompleteTask(ToCompleteTaskVo vo) throws Exception;
	/**
	 * @param taskType     任务类型(3 分享,4 活动)
	 * @param activityType 子任务类型(分享是分享类型,活动是活动类型)
	 * 
	 * @return
	 */
	ResultInfo completePurchaseTask(TaskCompleteVo vo) throws BusiException;

}
