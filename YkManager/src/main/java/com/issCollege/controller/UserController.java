package com.issCollege.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class UserController {

	@RequestMapping("/user")
	
	public String user() {
		return "user is exsist haha wawa!" ;
	}
}
