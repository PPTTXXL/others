package com.chinatobacco.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatobacco.pojo.Inforamation;
import com.chinatobacco.pojo.Store;
import com.chinatobacco.service.InforamationService;

/**
 * @author yd
 * @category 信息控制器
 *
 */
@Controller
@RequestMapping("/inforamation")
public class InforamationController {
	@Resource
	private InforamationService service;

	// 查询所有信息(多表联查-员工姓名)
	@RequestMapping("/list")
	public String list(Model model) {
		List<Inforamation> list = service.selectAll();
		model.addAttribute("list", list);
		System.err.println(list.size());
		return "showinforamation";
	}

	// 显示首页的8条信息，以时间倒序排列(多表联查-员工姓名)
	@RequestMapping("/list1")
	public String list1(Model model) {
		List<Inforamation> list = service.selectEight();
		model.addAttribute("list", list);
		System.err.println(list.size());
		return "showinforamation";
	}

	// 显示一条信息详情(多表联查-员工姓名)
	@RequestMapping("/selectOne")
	public String selectOne(int infoid, Model model) {
		Inforamation inforamation = service.selectOne(infoid);
		model.addAttribute("inforamation", inforamation);
		return "showinforamation";
	}

	@RequestMapping("/selectOne1")
	public String selectOne1(HttpSession session, HttpServletRequest request) {

		Object obj = session.getAttribute("current_user");
		if (obj != null) {
			Inforamation inforamation = (Inforamation) obj;
			if (inforamation.getInfoid() != 0) {
				inforamation = service.selectOne(inforamation.getInfoid());
				request.setAttribute("inforamation", inforamation);
				return "showinforamation";
			} else {
				return "404";
			}
		} else {
			return "404";
		}

	}

	// 添加一条信息
	@RequestMapping("/add")
	public String add() {
		return "addinforamation";
	}

	@RequestMapping("/addSave")
	public String addSave(Inforamation inforamation) {
		boolean flag = service.add(inforamation);
		if (flag) {
			return "redirect:/list.do";
		} else {
			return "404";
		}
	}

	// 批量删除信息
	@RequestMapping("/delete")
	public String delete(int[] infoid) {
		boolean flag = service.delete(infoid);
		if (flag) {
			return "redirect:/list.do";
		} else {
			return "404";
		}
	}

	// 修改信息
	@RequestMapping("/update")
	public String update(Integer infoid, Model model) {
		Inforamation inforamation = service.selectOne(infoid);
		model.addAttribute("inforamation", inforamation);
		return "updateinforamation";
	}

	@RequestMapping("/updateSave")
	public String updateSave(Inforamation inforamation) {
		boolean flag = service.update(inforamation);
		if (flag) {
			return "redirect:/list1.do";
		} else {
			return "404";
		}
	}
}
