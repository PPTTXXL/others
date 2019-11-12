package com.chinatobacco.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PayReturnController {
@RequestMapping("paysucsses")
public String paySucsses(HttpServletRequest request,Model model){
	String trade_no =(String) request.getAttribute("trade_no");
	String out_trade_no= (String) request.getAttribute("out_trade_no");
	String total_amount= (String) request.getAttribute("total_amount");
	model.addAttribute("trade_no", trade_no);
	model.addAttribute("out_trade_no", out_trade_no);
	model.addAttribute("total_amount", total_amount);
	return"paysucsses";
}
}
