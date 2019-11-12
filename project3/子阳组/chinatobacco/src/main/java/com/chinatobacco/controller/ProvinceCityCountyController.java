package com.chinatobacco.controller;

import java.util.List;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatobacco.pojo.City;
import com.chinatobacco.pojo.County;
import com.chinatobacco.pojo.Province;
import com.chinatobacco.service.CityServcice;
import com.chinatobacco.service.CountyService;
import com.chinatobacco.service.ProvinceService;

/**
 * @author yd
 * @category 省市区控制器
 *
 */
@Controller
@RequestMapping("/pcc")
public class ProvinceCityCountyController {
		@Resource
		private ProvinceService provinceService;
		@Resource
		private CityServcice cityService;
		@Resource
		private CountyService countyService;

		
		//查询所有省份
		@RequestMapping(value = "/pfind",produces="text/html;charset=UTF-8;")
		public @ResponseBody String pfind(){
			//创建一个JSONOBJECT
			JSONObject json = new JSONObject();
			List<Province> list = provinceService.findAll();
			json.put("list", list);
			System.err.println(json);
			return json.toString();
			
		}
		//根据省份id查询出所有的城市列表
		@RequestMapping(value = "/cfind",produces="text/html;charset=UTF-8;")
		public @ResponseBody String cfind(String provinceId){
			//创建一个JSONOBJECT
			JSONObject json = new JSONObject();
			List<City>  list = cityService.selectAll(provinceId);
			json.put("list", list);
			System.err.println(json);
			return json.toString();
		}
		
		
		//根据城市id，查询出所有的区县列表
		@RequestMapping(value = "/cofind",produces="text/html;charset=UTF-8;")
		public @ResponseBody String cofind(String cityID){
			//创建一个JSONOBJECT
			JSONObject json = new JSONObject();
			System.err.println(countyService);
			List<County>  list = countyService.findAreasByCid(cityID);
			json.put("list", list);
			System.err.println(json);
			return json.toString();
		}
		
		
		
}
