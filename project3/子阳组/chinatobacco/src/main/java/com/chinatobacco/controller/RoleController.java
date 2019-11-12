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

import com.chinatobacco.pojo.Role;
import com.chinatobacco.pojo.User;
import com.chinatobacco.service.RoleService;
import com.chinatobacco.service.UserService;

/**
 * @author Davi
 * @category 角色控制器
 */
@Controller
@RequestMapping("/role")
public class RoleController {
	Logger log = Logger.getLogger(RoleController.class);

	@Resource
	private RoleService roleService;

	// 查询所有角色
	@RequestMapping("/showrole")
	public String showuser(Model model) {
		List<Role> list = roleService.selectAll();
		// 向模型对象中添加数据
		model.addAttribute("list", list);
		System.out.println(list.size());
		// 返回视图页面
		return "showrole";
	}

	
		//查询角色名称
		@RequestMapping(value="/showrole1",produces="text/html;charset=utf-8")
		public @ResponseBody String showuser1() {
			
			JSONObject json = new JSONObject();
			List<Role> list = roleService.selectAll();
			// 向模型对象中添加数据
			json.put("list", list);
			System.out.println(list.size());
			// 返回视图页面
			return json.toString();
		}
	

	// 增加角色
	@RequestMapping("/add")
	public String add() {
		return "addrole";
	}

	// 保存增加的角色
	@RequestMapping("/addsave")
	public String addsave(Role role) {
		boolean flag = roleService.add(role);
		if (flag) {
			return "redirect:showrole.do";
		}
		return "404";
	}

	// 删除角色
	@RequestMapping("/delete")
	public String delete(int roleid) {
		boolean flag = roleService.delete(roleid);
		if (flag) {
			return "showrole";
		}
		return "404";
	}

	// 修改角色
	@RequestMapping("/update")
	public String update() {
		return "updaterole";
	}

	// 保存修改的角色
	@RequestMapping("/updatesave")
	public String updatesave(Role role) {
		boolean flag = roleService.update(role);
		if (flag) {
			return "redirect:showrole.do";
		}
		return "404";
	}
    //通过roleid查询角色
	@RequestMapping("/selectOne")
	public String selectOne(@RequestParam("roleid") int roleid,Model model){
		Role role = roleService.selectOne(roleid);
		//向模型对象中添加数据
		model.addAttribute("role", role);
		return "showrole";
	}
}
