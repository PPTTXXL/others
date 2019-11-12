package com.chinatobacco.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatobacco.pojo.Storelevel;
import com.chinatobacco.service.StorelevelService;

/**
 * @author yd
 * @category 商户等级控制器
 */
@Controller
@RequestMapping("/storelevel")
public class StoreLevelController {

	Logger logger = Logger.getLogger(StoreController.class);
	@Resource
	private StorelevelService service;

	// 查询 全部信息
	@RequestMapping("list")
	public String list( Model model) {
		List<Storelevel> list = service.selectAll();
		model.addAttribute("list", list);
		System.err.println(list.size());
		return "showstorelevel";
	}
	
	@RequestMapping(value = "/list1",produces="text/html;charset=UTF-8;")
	public @ResponseBody String list1() {
		//创建一个JSONOBJECT
		JSONObject json = new JSONObject();
		List<Storelevel> list = service.selectAll();
		json.put("list", list);
		System.err.println(json);
		return json.toString();
	}

	// 通过等级ID查询
	@RequestMapping("/selectone")
	public String selectone(@RequestParam("lvid") int lvid,Model model) {
		Storelevel storelevel = service.selectOne(lvid);
		model.addAttribute("storelevel", storelevel);
		return "showstorelevel";
	}

	// 添加
	@RequestMapping("add")
	public String add() {
		return "addstorelevel";
	}

	@RequestMapping("addSave")
	public String addSave(Storelevel storelevel){
		boolean flag = service.add(storelevel);
		if(flag){
		return "redirect:list.do";
		}else {
			return "404";
		}
		
	}

	// 删除
	@RequestMapping("/delete")
	public String delete(int lvid){
		boolean flag = service.delete(lvid);
		if(flag){
		return "redirect:list.do";
		}else {
			return "404";
		}
		
	}

	// 修改用户
	@RequestMapping("update")
	public String update() {
		return "updatestorelevel";
	}

	@RequestMapping("updateSave")
	public String updateSave(Storelevel storelevel){
		boolean flag = service.update(storelevel);
		if(flag){
		return "redirect:list.do";
		}else {
			return "404";
		}
		
	}

}
