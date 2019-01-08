package com.bestpay.member.api;

import com.bestpay.member.po.PolicyCumAmountTrans;
import com.bestpay.member.util.ResultInfo;

/**
 * 
 * @author JingjingMa 2018-12-07
 * 用户成长值交易
 */
public interface IPolicyCumAmountTransService {
	
	
	/**
	 * 记录保费交易明细
	 * （1. 记录保费交易数据
	 *  2. 更新客户总保费）
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	ResultInfo savePolicyCumAmountTrans(PolicyCumAmountTrans vo) throws Exception;


}
