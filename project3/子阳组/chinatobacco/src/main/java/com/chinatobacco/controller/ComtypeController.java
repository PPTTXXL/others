package com.chinatobacco.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinatobacco.pojo.Comstate;
import com.chinatobacco.pojo.Comtype;
import com.chinatobacco.service.ComstateService;
import com.chinatobacco.service.ComtypeService;

/**
 * @author Davi
 * @category 商品类型控制器
 */
@Controller
@RequestMapping("/comtype")
public class ComtypeController {
	Logger log = Logger.getLogger(ComtypeController.class);
	
	@Resource
	private ComtypeService comtypeService;

	//查询所有状态
		@RequestMapping("/showcomtype")
		public String showcomtype(Model model) {
			List<Comtype> list = comtypeService.selectAll();
			//向模型对象中添加数据
			model.addAttribute("list", list);
			System.out.println(list.size());
			//返回视图页面
			return "showcomtype";
		}

		
		//通过stareid查询角色
				@RequestMapping("/selectOne")
				public String selectOne(@RequestParam("comtypeid") int comtypeid,Model model){
					Comtype comtype = comtypeService.selectOne(comtypeid);
					//向模型对象中添加数据
					model.addAttribute("comtype", comtype);
					return "showcomtype";
				}
				
				//添加状态add
				@RequestMapping("/add")
				public String add() {
						return "addcomtype";
				}
				
				//保存添加状态
				@RequestMapping("/addsave")
				public String addsave(Comtype comtype){
					boolean flag = comtypeService.add(comtype);
					if (flag) {
						return "redirect:showcomtype.do";
					}
					return "404";
				}
				
				//删除状态delete
				@RequestMapping("/delete")
				public String delete(int comtypeid){
					boolean flag  = comtypeService.delete(comtypeid);
					if (flag) {
						return "showcomtype";
					}
					return "404";
				}
				
				//修改状态update
				@RequestMapping("/update")
				public String update(){
						return "updatecomtype";
				}
				//保存修改状态
				@RequestMapping("/updatesave")
				public String updatesave(Comtype comtype){
					boolean flag = comtypeService.update(comtype);
					if (flag) {
						return "redirect:showcomtype.do";
					}
					return "404";
				}
}
