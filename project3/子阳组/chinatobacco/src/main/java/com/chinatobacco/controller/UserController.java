package com.chinatobacco.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatobacco.pojo.Role;
import com.chinatobacco.pojo.Store;
import com.chinatobacco.pojo.User;
import com.chinatobacco.service.UserService;

/**
 * @author Davi
 * @category 用户控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {
	Logger log = Logger.getLogger(UserController.class);

	@Resource
	private UserService userService;

	// 进入首页
	@RequestMapping("/index")
	public String index() {
		System.out.println("index");
		return "forward:/index.html";
	}

	// 进入登录页面
	@RequestMapping("/tologin")
	public String toLogin() {
		return "userlogin";
	}

	// 用户登录
	@RequestMapping("/login")
	public String login(String uid, String password, HttpSession session, HttpServletRequest request) {
		System.out.println("login");
		System.out.println(uid);
		System.out.println(password);
		int id = Integer.valueOf(uid);
		User user = userService.selectByPass(id, password);
		if (user != null) {
			// 登录成功，将用户对象放入Session中
			session.setAttribute("current_user", user);
			request.setAttribute("uid", id);
			return "redirect:/account/list.do";
		} else {
			return "redirect:/user/tologin.do";// 登录失败
		}

	}

	// 进入管理员登录页面
	@RequestMapping("/tologin1")
	public String toLogin1() {
		return "adminlogin";
	}

	// 管理员登录
	@RequestMapping("/login1")
	public String login1(String uid, String password, HttpSession session) {
		System.out.println("login");
		System.out.println(uid);
		System.out.println(password);
		int id = Integer.valueOf(uid);
		User user = userService.selectByPass(id, password);
		if (user != null) {
			// 登录成功，将用户对象放入Session中
			session.setAttribute("current_user", user);
			return "redirect:/user/showuser.do";
		} else {
			return "redirect:/user/tologin1.do";// 登录失败
		}

	}

	// 查询所有
	@RequestMapping("/showuser")
	public String showuser(Model model) {
		log.debug("showuser");
		List<User> list = userService.selectAll();
		// 向模型对象中添加数据
		model.addAttribute("list", list);
		System.out.println(list.size());
		// 返回视图页面
		return "showuser";
	}

	// 查询所有
	@RequestMapping(value = "/showuser1", produces = "text/html;charset=UTF-8;")
	public @ResponseBody String showuser1() {
		System.err.println(userService);
		JSONObject json = new JSONObject();
		List<User> list = userService.selectAll();
		json.put("list", list);
		System.out.println(list.size());
		return json.toString();
	}

	// 添加员工add
	@RequestMapping("/add")
	public String add() {
		return "adduser";
	}

	// 保存添加员工
	@RequestMapping("/addsave")
	public String addsave(User user) {
		boolean flag = userService.add(user);
		if (flag) {
			return "redirect:showuser.do";
		}
		return "404";
	}

	// 删除员工delete
	@RequestMapping("/delete")
	public String delete(int uid) {
		boolean flag = userService.delete(uid);
		if (flag) {
			return "showuser";
		}
		return "404";
	}

	// 修改员工update
	@RequestMapping("/update")
	public String update(User user, Model model) {
		model.addAttribute("User", user);
		return "updateuser";
	}

	// 保存修改员工
	@RequestMapping("/updatesave")
	public String updatesave(User user) {
		boolean flag = userService.update(user);
		if (flag) {
			return "redirect:showuser.do";
		}
		return "404";
	}

	// 个人修改update
	@RequestMapping("/update1")
	public String update1(Integer uid, Model model) {
		model.addAttribute("uid", uid);
		return "updateuser";
	}

	// 保存修改员工
	@RequestMapping("/updatesave1")
	public String updatesave1(User user, HttpSession httpSession) {
		boolean flag = userService.update(user);
		if (flag) {
			httpSession.removeAttribute("current_user");
			return "redirect:tologin1.do";
		}
		return "404";
	}

	// 通过角色id查询员工
	@RequestMapping("/selectByuid")
	public String selectByRole(@RequestParam("uid") int uid, Model model) {
		log.debug("showuser");
		List<User> list = userService.selectByRole(uid);
		// 向模型对象中添加数据
		model.addAttribute("list", list);
		System.out.println(list.size());
		// 返回视图页面
		return "showuser";
	}

	// 通过员工ID找到员工
	// 通过商户ID查询商户对象
	@RequestMapping("/selectById1")
	public String selectOne(int uid, Model model) {
		User user = userService.selectById(uid);
		model.addAttribute("uid", uid);
		return "showpersonuser";
	}

	@RequestMapping("/selectById")
	public String selectById(HttpSession session, HttpServletRequest request) {
		Object object = session.getAttribute("current_user");
		if (object != null) {
			User user = (User) object;
			if (user.getUid() != 0) {
				user = userService.selectById(user.getUid());
				request.setAttribute("user", user);
				return "login";
			} else {
				return "404";
			}
		} else {
			return "404";
		}

	}

	// 退出
	@RequestMapping("/exit")
	public String exit(HttpSession session) {
		session.removeAttribute("current_store");
		return "redirect:tologin.do";
	}

}
