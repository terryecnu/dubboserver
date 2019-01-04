package org.spring.springboot.innerServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.dubbo.CityDubboService;
import org.spring.springboot.innerService.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import ry.basic.mapper.CourseMapper;
import ry.basic.model.Course;

@Service
public class DemoServiceImpl implements DemoService {

	private Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
	@Autowired
	private CourseMapper courseMapper;
	@Transactional(propagation =Propagation.REQUIRED,
	rollbackFor=RuntimeException.class)
	public void testMybatis() {
		//getData();
		getByid();
		testInsert();
		testInsert();
		//testUpdate();
	}
	
	public void testInsert() {
		Course c = new Course();
		c.setCid("16");
		c.setCname("gggg");
		c.setTid("5");
		this.courseMapper.insert(c);
	}
	
	public void testUpdate() {
		Course c = new Course();
		c.setCid("14");
		c.setCname("gggg");
		c.setTid("8");
		this.courseMapper.updateByPrimaryKey(c);
	}
	
	public void getData() {
		try {
			List lists = new ArrayList<String>();
			lists.add("03");
			lists.add("02");
			List<Course> courses = this.courseMapper.queryList(lists);
			for (int i = 0; i < courses.size(); i++) {
				logger.info(" course: " + courses.get(i).getCid() + "name" + courses.get(i).getCname());
			}

		} catch (Exception e) {
          
			logger.info(e.getMessage());
		}
	}
	
	
	public void getByid() {
		
		try {
			List<Course> courses = this.courseMapper.selectList();
			for(int i = 0; i < courses.size(); i++){
				logger.info(" course: " + courses.get(i).getCid() + "name" + courses.get(i).getCname());
			}

		} catch (Exception e) {
           e.printStackTrace();
			//logger.info(e.getMessage());
		}
		
		
		
		
	}
	
	
    public void insertData() {
		
		try {
			List<Course> courses = this.courseMapper.selectList();
			for(int i = 0; i < courses.size(); i++){
				logger.info(" course: " + courses.get(i).getCid() + "name" + courses.get(i).getCname());
			}

		} catch (Exception e) {
           e.printStackTrace();
			//logger.info(e.getMessage());
		}
		
		
		
		
	}

}
