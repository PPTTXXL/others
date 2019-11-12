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
import com.chinatobacco.pojo.Shelf;
import com.chinatobacco.service.ShelfService;

@Controller
@RequestMapping("/shelf")
public class ShelfController {
	Logger logger = Logger.getLogger(ShelfController.class);
	@Autowired
	private ShelfService shelfService;

	@RequestMapping("/list")
	public String list(Model model) {
		List<Shelf> list = shelfService.selectAll();
		model.addAttribute("list", list);
		return "showshelf";
	}
	//运用json
	@RequestMapping(value=("/list1"),produces="text/html;charset=utf-8;")
	public @ResponseBody String list1(){
		JSONObject json = new JSONObject();
		List<Shelf> list = shelfService.selectAll();
		json.put("list", list);
		System.err.println(list.size());
		System.err.println(json);
		System.out.println(shelfService);
		return json.toString();
	}

	@RequestMapping("toadd")
	public String toadd() {
		return "addshelf";
	}

	@RequestMapping(value = "/add")
	public String add(Shelf shelf) {
		boolean flag = shelfService.add(shelf);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}

	@RequestMapping("/delete")
	public String delete(int shelfid) {
		boolean flag = shelfService.delete(shelfid);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}

	@RequestMapping("/toupdate")
	public String toupdate(String shelfid, String shelfname, Model model) {
		model.addAttribute("shelfid", shelfid);
		model.addAttribute("shelfname", shelfname);
		return "updateshelf";
	}

	@RequestMapping("/update")
	public String update(Shelf shelf) {
		boolean flag = shelfService.update(shelf);
		if (flag) {
			return "redirect:list.do";
		}
		return "404";
	}
}
