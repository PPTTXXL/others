package com.chinatobacco.controller;

import java.util.List;

import javax.xml.ws.soap.Addressing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinatobacco.pojo.Account;
import com.chinatobacco.service.AccountService;

@Controller
@RequestMapping("account")
public class AccountController {
	@Autowired
	private AccountService accountService;

	@RequestMapping("list")
	public String list(Model model) {
		List<Account> list = accountService.selectAll();
		model.addAttribute("list", list);
		return "showaccount";
	}
}
