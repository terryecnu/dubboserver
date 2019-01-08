package com.bestpay.member.dubbo.impl.innerservice.impl;

import com.bestpay.member.dubbo.impl.innerservice.ICommonService;
import com.bestpay.member.mapper.GrowthValueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 16:26 2018/12/27
 */
@Service
public class CommonServiceImpl implements ICommonService {
    private static final String TAG = "CommonService";

    @Autowired
    private GrowthValueMapper growthValueMapper;

    @Override
    public String getTimeStamp() {
        //生成1000-9999的随机数
        int randomNum = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
        String result = growthValueMapper.getTimeStamp() + String.valueOf(randomNum);
        System.out.println("===============================>" + result);
        return result;
    }
}  