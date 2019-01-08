package com.bestpay.member.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bestpay.member.api.ICommonApi;
import com.bestpay.member.dubbo.impl.innerservice.ICommonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by WDL on 2018/11/28.
 */
@Service(version = "1.0.0")
public class CommonDubboApiImpl implements ICommonApi {

    @Autowired
    private ICommonService commonService;

    @Override
    public String getTimeStamp() {
        return this.commonService.getTimeStamp();
    }


    /*@Autowired
    private GrowthValueMapper growthValueMapper;

    @Override
    public String getTimeStamp() {
        //生成1000-9999的随机数
        int randomNum = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
        String result = growthValueMapper.getTimeStamp() + String.valueOf(randomNum);
        System.out.println("===============================>" + result);
        return result;
    }*/
}