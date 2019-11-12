package com.chinatobacco.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatobacco.pojo.Ent;
import com.chinatobacco.service.EntService;

@Controller
@RequestMapping("/ent")
public class EntController {
	Logger logger = Logger.getLogger(EntController.class);
	@Autowired
	private EntService entService;

	@RequestMapping("/list")
	public String list(Model model) {
		List<Ent> list = entService.selectAll();
		model.addAttribute("list", list);
		return "showent";
	}
	//运用json
	@RequestMapping(value=("/list1"), produces="text/html;charset=utf-8;")
	public @ResponseBody String list1() {
		JSONObject json = new JSONObject();
		List<Ent> list = entService.selectAll();
		json.put("list", list);
		System.err.println(json);
		return json.toString();
	}

	@RequestMapping("/toadd")
	public String toadd() {
		return "addent";
	}

	@RequestMapping(value = "/add")
	public String add(Ent ent) {
		boolean flag = entService.add(ent);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}

	@RequestMapping("/delete")
	public String delete(int entid) {
		boolean flag = entService.delete(entid);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}

	@RequestMapping("/toupdate")
	public String toupdate(String entid,String entname,Model model) {
		model.addAttribute("entid", entid);
		model.addAttribute("entname", entname);
		return "updateent";
	}

	@RequestMapping("/update")
	public String update(Ent ent) {
		System.out.println(ent);
		System.out.println(ent.getEntid());
		System.out.println(ent.getEntname());
		boolean flag = entService.update(ent);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}
}
