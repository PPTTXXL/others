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
import com.chinatobacco.pojo.Location;
import com.chinatobacco.pojo.Shelf;
import com.chinatobacco.service.LocationService;

@Controller
@RequestMapping("/location")
public class LocationController {
	Logger logger = Logger.getLogger(LocationController.class);
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("/list")
	public String list(Model model){
		List<Location> list=locationService.selectAll();
		model.addAttribute("list", list);
		return "showlocation";
	}
	//运用json
		@RequestMapping(value=("/list1"), produces="text/html;charset=utf-8;")
		public @ResponseBody String list1() {
			JSONObject json = new JSONObject();
			List<Location> list = locationService.selectAll();
			json.put("list", list);
			System.err.println(json);
			return json.toString();
		}
	@RequestMapping("/toadd")
	public String toadd() {
		return "addlocation";
	}

	@RequestMapping(value = "/add")
	public String add(Location location) {
		boolean flag = locationService.add(location);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}
	@RequestMapping("/delete")
	public String delete(int locid) {
		boolean flag = locationService.delete(locid);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}

	@RequestMapping("/toupdate")
	public String toupdate(int locid,Model model) {
		model.addAttribute("locid", locid);
		return "updatelocation";
	}

	@RequestMapping("/update")
	public String update(Location location) {
		
		System.out.println(location.getLocid());
		System.out.println(location.getEntid());
		System.out.println(location.getShelfid());
		System.out.println("========================");
		boolean flag = locationService.update(location);
		System.err.println(flag);
		if (flag) {
			return "redirect:list.do";
			
		}
		return "404";
	}
}
