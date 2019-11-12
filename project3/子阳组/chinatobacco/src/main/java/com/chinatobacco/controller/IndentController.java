package com.chinatobacco.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatobacco.pojo.Commodity;
import com.chinatobacco.pojo.Commoditybag;
import com.chinatobacco.pojo.Indent;
import com.chinatobacco.pojo.Store;
import com.chinatobacco.pojo.User;
import com.chinatobacco.service.CommodityService;
import com.chinatobacco.service.CommoditybagService;
import com.chinatobacco.service.IndentService;

/**
 * @author King.zy
 * @category 订单控制器
 */
@Controller
@RequestMapping("/indent")
public class IndentController {
	@Autowired
	private IndentService indentService;
	@Autowired
	private CommoditybagService commoditybagService;
	@Autowired
	private CommodityService commodityService;

	@RequestMapping("/shoplist")
	public String shoplist(HttpSession session, Model model) {
		Object obj = session.getAttribute("current_store");
		Store store = (Store) obj;
		List<Indent> list = indentService.selectByStoreid(store.getStoreid());
		for (Indent indent : list) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd,hh:mm:ss");
			String cdate = dateFormat.format(indent.getCreatedate());
			indent.setScreatedate(cdate);
			if (indent.getEnddate() != null) {
				String sdate = dateFormat.format(indent.getEnddate());
				indent.setSenddate(sdate);
			}

		}
		model.addAttribute("list", list);
		return "showindent";
	}

	@RequestMapping("/one")
	public String selectOne(int indentid, Model model) {
		System.out.println("=======================进入到这里========================");
		Indent indent = indentService.selectByIndentid(indentid);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd,hh:mm:ss");
		String cdate = dateFormat.format(indent.getCreatedate());
		indent.setScreatedate(cdate);
		if (indent.getEnddate() != null) {
			String sdate = dateFormat.format(indent.getEnddate());
			indent.setSenddate(sdate);
		}
		List<Commoditybag> list = commoditybagService.selectByIndet(indentid);
		indent.setCbaglist(list);
		model.addAttribute("indent", indent);
		return "showindentone";// 转发到订单详情展示页面
	}

	@RequestMapping("/add")
	@ResponseBody
	public String add(String cid, String num, HttpSession session, Model model, HttpServletRequest request) {
		int indentid = random();// 获取订单号
		double grossprice = 0;
		// 将渠道的json数组转换为int数组
		JSONArray cids = new JSONArray(cid);
		JSONArray nums = new JSONArray(num);
		int[] comid = new int[cids.length()];
		int[] spnum = new int[nums.length()];
		for (int i = 0; i < nums.length(); i++) {
			spnum[i] = Integer.valueOf(nums.getString(i));
		}
		for (int i = 0; i < cids.length(); i++) {
			comid[i] = Integer.valueOf(cids.getString(i));
		}
		// 计算商品总价
		for (int i = 0; i < spnum.length; i++) {
			Commodity commodity = commodityService.selectOne(comid[i]);
			grossprice += (commodity.getPrice() * spnum[i]);
		}
		// 获取当前登录人
		Object obj = session.getAttribute("current_store");
		Store store = (Store) obj;
		// 创建定单
		Indent indent = new Indent();
		indent.setIndentid(indentid);
		indent.setCreatedate(new Date());
		indent.setGrossprice(grossprice);
		indent.setStoreid(store.getStoreid());
		indent.setStateid(1);
		boolean flagi = indentService.add(indent);
		// 创建商品包
		for (int i = 0; i < comid.length; i++) {
			Commoditybag commoditybag = new Commoditybag();// 创建商品包对象
			commoditybag.setComid(comid[i]);
			commoditybag.setIndentid(indentid);
			commoditybag.setSpnum(spnum[i]);
			commoditybagService.add(commoditybag);// 添加商品包

		}
		System.out.println("flagi：" + flagi);
		JSONObject json = new JSONObject();
		json.put("indentid", indentid);
		json.put("flagi", flagi);
		return json.toString();// 转发到ajax

	}

	/**
	 * 返回一个8位int型订单号号（当前毫秒后六位+两位随机数）
	 * 
	 * @return
	 */
	private int random() {
		long t1 = System.currentTimeMillis();
		String t2 = String.valueOf(t1);
		String t3 = t2.substring(t2.length() - 6, t2.length());
		Random random = new Random();
		int ends = random.nextInt(99);
		String ran = String.format("%02d", ends);
		String indentidstr = t3 + ran;
		int indentid = Integer.valueOf(indentidstr);
		return indentid;
	}
}
