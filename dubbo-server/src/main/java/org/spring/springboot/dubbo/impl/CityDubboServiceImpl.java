package org.spring.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;

import ry.basic.mapper.CourseMapper;
import ry.basic.model.Course;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboService;
import org.spring.springboot.innerService.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by bysocket on 28/02/2017.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {
	private Logger logger = LoggerFactory.getLogger(CityDubboService.class);
	
	@Autowired
	private DemoService demoService;
	//private CourseMapper courseMapper;
	

	public City findCityByName(String cityName) {
		//getData();
		this.demoService.testMybatis();
		
		return new City(1L, 2L, "上海", "是我的故乡");
	}

	
}
