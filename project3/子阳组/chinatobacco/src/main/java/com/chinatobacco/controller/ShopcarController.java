package com.chinatobacco.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinatobacco.pojo.Shopcar;
import com.chinatobacco.pojo.Store;
import com.chinatobacco.service.ShopcarService;

@Controller
@RequestMapping("shopcar")
public class ShopcarController {
	@Autowired
	private ShopcarService shopcarService;

	@RequestMapping("list")
	public String list(HttpSession session, Model model) {
		Object obj = session.getAttribute("current_store");
		Store store = (Store) obj;
		System.out.println(store.getStoreid());
		List<Shopcar> list = shopcarService.selectAll(store.getStoreid());
		model.addAttribute("list", list);
		return "showcar";
	}

	@RequestMapping("add")
	public String add(int comid, HttpSession session) {
		Object obj = session.getAttribute("current_store");
		Store store = (Store) obj;
		Shopcar s = shopcarService.selectOne(comid, store.getStoreid());
		if (s == null) {
			Shopcar shopcar = new Shopcar();
			shopcar.setComid(comid);
			shopcar.setStoreid(store.getStoreid());
			shopcarService.add(shopcar);
			return "redirect:/shopcar/list.do";
		} else {
			return "redirect:/shopcar/list.do";
		}
	}

}
