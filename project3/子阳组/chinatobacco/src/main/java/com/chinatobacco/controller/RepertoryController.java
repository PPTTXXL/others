package com.chinatobacco.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatobacco.pojo.Location;
import com.chinatobacco.pojo.Repertory;
import com.chinatobacco.service.RepertoryService;

@Controller
@RequestMapping("/repertory")

public class RepertoryController {
	Logger logger = Logger.getLogger(RepertoryController.class);
	@Autowired
	private RepertoryService repertoryService;
	
	@RequestMapping("/list")
	public String list(Model model){
		List<Repertory> list=repertoryService.selectAll();
		model.addAttribute("list",list);
		return "showrepertory";
		
	}
	//运用json
	@RequestMapping(value=("/list2"), produces="text/html;charset=utf-8;")
	public @ResponseBody String list2() {
		JSONObject json = new JSONObject();
		List<Repertory> list = repertoryService.selectAll();
		json.put("list", list);
		System.err.println(json);
		return json.toString();
	}
	@RequestMapping("/toadd")
	public String toadd() {
		return "addrepertory";
	}

	@RequestMapping(value = "/add")
	public String add(Repertory repertory) {
		boolean flag = repertoryService.add(repertory);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}

	@RequestMapping("/delete")
	public String delete(int comid) {
		boolean flag = repertoryService.delete(comid);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}

	@RequestMapping("/toupdate")
	public String toupdate(int id, Model model) {
		model.addAttribute("id", id);
		return "updaterepertory";
	}

	@RequestMapping("/update")
	public String update(Repertory repertory) {
		System.out.println(repertory.getId());
		System.out.println(repertory.getComid());
		System.out.println(repertory.getNum());
		System.out.println(repertory.getLocid());
		boolean flag = repertoryService.update(repertory);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}
}
