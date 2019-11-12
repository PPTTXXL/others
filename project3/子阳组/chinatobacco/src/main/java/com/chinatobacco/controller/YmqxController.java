package com.chinatobacco.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinatobacco.service.UserService;

@Controller
@RequestMapping("ymqx")
public class YmqxController {
	@Resource
	private UserService userService;

	// 判断id是否存在
	@RequestMapping("/name")
	public String name(HttpServletRequest re) {
		String name = re.getParameter("uname");
		
		return "";
	}
}
