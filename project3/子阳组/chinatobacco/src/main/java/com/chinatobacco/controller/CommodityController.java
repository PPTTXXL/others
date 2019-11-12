package com.chinatobacco.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.chinatobacco.pojo.Commodity;
import com.chinatobacco.pojo.Comstate;
import com.chinatobacco.pojo.Ent;
import com.chinatobacco.service.CommodityService;
import com.chinatobacco.service.ComstateService;

/**
 * @author Davi
 * @category 商品控制器
 */
@Controller
@RequestMapping("/commodity")
 public class CommodityController {
 	Logger log = Logger.getLogger(CommodityController.class);
 	
 	@Resource
 	private CommodityService commodityService;

 	//查询所有状态
 		@RequestMapping("/showcommodity")
 		public String showcommodity(Model model) {
 			List<Commodity> list = commodityService.selectAll();
 			//向模型对象中添加数据
 			model.addAttribute("list", list);
 			System.out.println(list.size());
 			//返回视图页面
 			return "showcommodity";
 		}
 		@RequestMapping("/sp")
 		public String sp(Model model) {
 			List<Commodity> list = commodityService.selectAll();
 			//向模型对象中添加数据
 			model.addAttribute("list1", list);
 			System.out.println(list.size());
 			//返回视图页面
 			return "sahngcheng";
 		}
 		//运用json
 		@RequestMapping(value=("/list1"), produces="text/html;charset=utf-8;")
 		public @ResponseBody String list1() {
 			JSONObject json = new JSONObject();
 			List<Commodity> list = commodityService.selectAll();
 			json.put("list", list);
 			System.err.println(json);
 			return json.toString();
 		}
 		
 		//通过comid查询角色
 				@RequestMapping("/selectOne")
 				public String selectOne(@RequestParam("comid") int comid,Model model){
 					Commodity commodity = commodityService.selectOne(comid);
 					//向模型对象中添加数据
 					model.addAttribute("commodity", commodity);
 					return "showcommodity";
 				}

 				//通过comtypeid商品类型编号查找
 				@RequestMapping("/selectByType")
 				public String selectByType(@RequestParam("comtypeid")int comtypeid,Model model){
 					List<Commodity> list = commodityService.selectByType(comtypeid);
 					model.addAttribute("list",list);
 					System.out.println(list.size());
 					return "showcommodity";
 				}
 				
 				//通过stareid状态编号查找
 				@RequestMapping("/selectByState")
 				public String selectByState(@RequestParam("stareid") int stareid,Model model){
 					List<Commodity> list = commodityService.selectByType(stareid);
 					model.addAttribute("list",list);
 					System.out.println(list.size());
 					return "showcommodity";
 				}
 				
 				//commodity商品对象
 				@RequestMapping("/selectQuery")
 				public String selectQuery(Commodity commodity){
 					List<Commodity> list = commodityService.selectQuery(commodity);
 					return "showcommodity";
 				}
 				
 				//comname商品名称
 				@RequestMapping("/selectByName")
 				public String selectByName(String comname,Model model){
 					List<Commodity> list = commodityService.selectByName(comname);
 					model.addAttribute("list",list);
 					System.out.println(list.size());
 					return "showcommodity";
 				}
 				
 				//添加商品add
 				@RequestMapping("/add")
 				public String add() {
 						return "addcommodity";
 				}
 				
 				//保存添加状态
 				@RequestMapping("/addsave")
 				public String addsave(Commodity commodity){
 					boolean flag = commodityService.add(commodity);
 					if (flag) {
 						return "redirect:showcommodity.do";
 					}
 					return "404";
 				}
 				
 				//批量删除商品
 				@RequestMapping("/delete")
 				public String delete(int[] comid){
 					boolean flag = commodityService.delete(comid);
 					if (flag) {
						return "showcommodity";
					}
 					return "404";
 				}
 				
 				//修改商品update
 				@RequestMapping("/update")
 				public String update(){
 						return "updatecommodity";
 				}
 				//保存修改商品
 				@RequestMapping("/updatesave")
 				public String updatesave(Commodity commodity){
 					boolean flag = commodityService.update(commodity);
 					if (flag) {
 						return "redirect:showcommodity.do";
 					}
 					return "404";
 				}
 				
 				//上传文件
 				@RequestMapping("/toupload")
 				public String toupload(){
 					System.out.println("进入上传的页面里面");
 					return "upload";
 				}

 				@RequestMapping("/upload")
 				public String upload(@RequestParam("file") CommonsMultipartFile file) throws IllegalStateException, IOException{
 					String name = file.getOriginalFilename();
 					System.out.println(name);
 					String path = "D:"+File.separator+ "commodity" + name;
 					file.transferTo(new File(path));
 					//获取相对路径
 					
 					//把相对路径添加到商品对象里
 					return "success";
 				}

}
