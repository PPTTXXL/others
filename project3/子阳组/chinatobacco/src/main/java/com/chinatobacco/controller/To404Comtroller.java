package com.chinatobacco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class To404Comtroller {
	@RequestMapping("404")
	public String to404() {
		return "404";
	}
}
