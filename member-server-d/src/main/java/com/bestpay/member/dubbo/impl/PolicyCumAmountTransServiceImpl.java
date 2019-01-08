package com.bestpay.member.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bestpay.member.api.IPolicyCumAmountTransService;
import com.bestpay.member.constant.MemberConstant;
import com.bestpay.member.po.Customer;
import com.bestpay.member.po.PolicyCumAmountTrans;
import com.bestpay.member.util.AssertUtil;
import com.bestpay.member.util.ResultInfo;
import com.bestpay.member.mapper.CustomerMapper;
import com.bestpay.member.mapper.PolicyCumAmountTransMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by HYP on 2018/11/27.
 */
@Service(version = "1.0.0")
public class PolicyCumAmountTransServiceImpl implements IPolicyCumAmountTransService{
    private static final String TAG = "PolicyCumAmountTransServiceImpl";

    @Autowired
    private PolicyCumAmountTransMapper policyCumAmountTransMapper;

    @Autowired
    private CustomerMapper customerMapper;
    
    
	@Override
	public ResultInfo savePolicyCumAmountTrans(PolicyCumAmountTrans vo)
			throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		
		//逻辑检验 ？？？（待补充）
		
		//保存数据
		int cnt = policyCumAmountTransMapper.insertSelective(vo);
		//校验是否操作数据库成功
		AssertUtil.isTrue(cnt<1, MemberConstant.BUSI_FAILD_CODE,MemberConstant.USER_NOT_EXITS);
		
		Double sumPolicyAmount = policyCumAmountTransMapper.querySumPolicyAmount(vo.getUserId());
		if(null!=sumPolicyAmount){
			Customer customer = customerMapper.selectByUserNo(vo.getUserId());
			if(null!=customer){
				Customer record = new Customer();
				record.setCrmId(customer.getCrmId());
				record.setAcctAmount(sumPolicyAmount);
				customerMapper.updateByPrimaryKeySelective(record);
			}
			
		}
					
		//返回状态码
		return resultInfo;
	}
    
}