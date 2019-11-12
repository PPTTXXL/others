package com.chinatobacco.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatobacco.pojo.Collect;
import com.chinatobacco.pojo.Store;
import com.chinatobacco.service.CollectService;

@Controller
@RequestMapping("collect")
public class CollectController {
	@Autowired
	private CollectService collectService;

	@RequestMapping("mycollect")
	public String mycollect(HttpSession session, Model model) {
		Object obj = session.getAttribute("current_store");
		Store store = (Store) obj;
		List<Collect> list = null;
		list = collectService.selectByStoreid(store.getStoreid());
		System.out.println(list);
		model.addAttribute("list", list);
		return "showcollect";
	}

	@RequestMapping("add")
	public String add(int comid, HttpSession session) {
		System.out.println("进入到收藏add");
		Object obj = session.getAttribute("current_store");
		Store store = (Store) obj;
		Collect c = collectService.selectOneByStoreid(store.getStoreid(), comid);
		if (c == null) {
			Collect collect = new Collect();
			collect.setColldate(new Date());
			collect.setComid(comid);
			collect.setStoreid(store.getStoreid());
			collectService.add(collect);
			return "redirect:/collect/mycollect.do";
		} else {
			return "redirect:/collect/mycollect.do";

		}

	}
}
