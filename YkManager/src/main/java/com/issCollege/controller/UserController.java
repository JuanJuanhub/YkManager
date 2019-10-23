package com.issCollege.controller;

import com.issCollege.dao.SampleAndUserDao;
import com.issCollege.dao.SampleDAO;
import com.issCollege.po.Sample;
import com.issCollege.po.SampleAndUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@ResponseBody
@Controller
public class UserController {

	@Autowired
	SampleDAO sampleDAO;

	@RequestMapping("/user")
	
	public String user() {

		return "user is exsist haha wawa!" ;
	}

	@RequestMapping("/select")
	public Sample select(Sample sample){

		Sample sp = sampleDAO.selectByPrimaryKey((long) 2);
		System.out.println("执行了");
		return sp;


	}

	@RequestMapping("/insert")
	public void insert(Sample sample){

		sample.setItemName((long) 1);
		sample.setSampleState("1");
		sample.setSampleCount((long) 1);
		sample.setReportnum("123");
		sample.setSampleNum("1");
		sample.setRockType((long) 2);
		sample.setStandardsampleName((long) 2);
		sample.setProjectName("sdf");
//		sample.setSampletbId((long) 2);
		sample.setSampleType((long) 2);
		sample.setSampletestId(2);
		sample.setSampleCreated(new Date());
		sample.setUserId((long) 3);

		sampleDAO.insert(sample);
	}
	@Autowired
	SampleAndUserDao sampleAndUserDao;

	@RequestMapping("/test")
	public SampleAndUser sampleAndUser(){
		SampleAndUser user =sampleAndUserDao.getSampAndUser((long) 1);
		System.out.println(user);
		return user;
	}

}
