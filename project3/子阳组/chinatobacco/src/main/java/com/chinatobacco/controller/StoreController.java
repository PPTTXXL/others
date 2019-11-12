package com.chinatobacco.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinatobacco.pojo.Store;
import com.chinatobacco.service.StoreService;

/**
 * @author yd
 * @category 商户控制器
 */
@Controller
@RequestMapping("/store")
public class StoreController {
	Logger logger = Logger.getLogger(StoreController.class);
	@Resource
	private StoreService storeService;

	// 商户登录
	@RequestMapping("/tologin")
	public String login() {
		return "storelogin";
	}

	@RequestMapping("/login")
	public String login(String storeid, String password, HttpSession session, HttpServletRequest request) {
		System.out.println("login");
		System.out.println(storeid);
		System.out.println(password);
		int id = Integer.valueOf(storeid);
		Store store = storeService.selectByPass(id, password);
		if (store != null) {
			// 登录成功，将用户对象放入Session中
			session.setAttribute("current_store", store);
			request.setAttribute("storeid", id);
			return "forward:/store/selectOne1.do";
		} else {
			return "redirect:/store/tologin.do";// 登录失败
		}

	}

	// 查询所有商户
	@RequestMapping("/selectAll")
	public String selectAll(Model model) {

		List<Store> list = storeService.selectAll();
		System.err.println(list.size());
		model.addAttribute("list", list);
		return "showpersonstore";
	}

	// 通过商户ID查询商户对象
	@RequestMapping("/selectOne")
	public String selectOne(int storeid, Model model) {
		Store store = storeService.selectOne(storeid);
		model.addAttribute("store", store);
		return "showpersonstore";
	}

	@RequestMapping("/selectOne1")
	public String selectOne1( HttpSession session,HttpServletRequest request){
		Object obj = session.getAttribute("current_store");
		if(obj != null){
			Store store = (Store)obj;
			if(store.getStoreid() != 0  ){
				store = storeService.selectOne(store.getStoreid());
				request.setAttribute("store", store);
				return "showpersonstore";
			}else{
				return "404";
			}
		}else {
			return "404";
		}
	}

	// 通过商户等级编号查询商户
	@RequestMapping("/selectByLv")
	public String selectByLv(@RequestParam("lvid") int lvid, Model model) {
		logger.debug("lvid" + lvid);
		List<Store> list = storeService.selectByLv(lvid);
		model.addAttribute("list", list);
		System.err.println(list.size());
		return "showstore";
	}

	// 插入
	@RequestMapping("/add")
	public String add() {
		return "addstore";
	}

	@RequestMapping("/addSave")
	public String addsave(Store store) {
		boolean flag = storeService.add(store);
		return "redirect:selectAll.do";
	}

	// 修改
	@RequestMapping("/update")
	public String update() {
		
		return "updatestore";
	}
	@RequestMapping("/updateSave")
	public String updateSave(Store store) {
		boolean flag = storeService.update(store);
		return "redirect:selectAll.do";
	}
	// 个人修改
	@RequestMapping("/update1")
	public String update1(Integer storeid, Model model) {
		model.addAttribute("storeid", storeid);
		return "updateperstore";
	}

	@RequestMapping("/update1Save")
	public String update1Save(Store store , HttpSession session) {
		System.out.println(store.getStoreid());
		System.out.println(store.getPassword());
		System.out.println(store.getStorename());
		boolean flag = storeService.update(store);
		
		if(flag){
			session.removeAttribute("current_store");
			return "redirect:tologin.do";
		}else{
			return "404";
		}
	}

	// 删除
	@RequestMapping("/delete")
	public String delete(@RequestParam("storeid") int storeid) {
		boolean flag = storeService.delete(storeid);
		return "redirect:selectAll.do";
	}
	
	//退出
	@RequestMapping("/exit")
	public String exit(HttpSession session){
		session.removeAttribute("current_store");
		return "redirect:tologin.do";
	}
	
}
