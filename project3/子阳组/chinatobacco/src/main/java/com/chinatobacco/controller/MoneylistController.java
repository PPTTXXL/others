package com.chinatobacco.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinatobacco.pojo.Moneylist;
import com.chinatobacco.service.MoneylistService;

@Controller
@RequestMapping("moneylist")
public class MoneylistController {

	@Autowired
	private MoneylistService moneylistService;

	@RequestMapping("list")
	public String list(Model model) {
		List<Moneylist> list = moneylistService.selectAll();
		for (Moneylist m : list) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd,hh:mm:ss");
			String date = dateFormat.format(m.getDate());
			m.setSdate(date);

		}

		model.addAttribute("list", list);
		return "showmoneylist";

	}
}
