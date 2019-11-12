package com.chinatobacco.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinatobacco.pojo.Comstate;
import com.chinatobacco.pojo.Role;
import com.chinatobacco.pojo.User;
import com.chinatobacco.service.ComstateService;
import com.chinatobacco.service.UserService;

/**
 * @author Davi
 * @category 商品状态控制器
 */
@Controller
@RequestMapping("/comstate")
public class ComstateController {
	Logger log = Logger.getLogger(ComstateController.class);
	
	@Resource
	private ComstateService comstateService;

	//查询所有状态
		@RequestMapping("/showcomstate")
		public String showcomstate(Model model) {
			List<Comstate> list = comstateService.selectAll();
			//向模型对象中添加数据
			model.addAttribute("list", list);
			System.out.println(list.size());
			//返回视图页面
			return "showcomstate";
		}

		
		//通过stareid查询角色
		@RequestMapping("/selectOne")
		public String selectOne(@RequestParam("stareid") int stareid,Model model){
			Comstate comstate = comstateService.selectOne(stareid);
			//向模型对象中添加数据
			model.addAttribute("comstate", comstate);
			return "showcomstate";
		}
		
		//添加状态add
		@RequestMapping("/add")
		public String add() {
				return "addcomstate";
		}
		
		//保存添加状态
		@RequestMapping("/addsave")
		public String addsave(Comstate comstate){
			boolean flag = comstateService.add(comstate);
			if (flag) {
				return "redirect:showcomstate.do";
			}
			return "404";
		}
		
		//删除状态delete
		@RequestMapping("/delete")
		public String delete(int stareid){
			boolean flag  = comstateService.delete(stareid);
			if (flag) {
				return "showcomstate";
			}
			return "404";
		}
		
		//修改状态update
		@RequestMapping("/update")
		public String update(){
				return "updatecomstate";
		}
		//保存修改状态
		@RequestMapping("/updatesave")
		public String updatesave(Comstate comstate){
			boolean flag = comstateService.update(comstate);
			if (flag) {
				return "redirect:showcomstate.do";
			}
			return "404";
		}
}
