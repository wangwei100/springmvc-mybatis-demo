package com.demohot.demos.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demohot.demos.module.user.po.User;
import com.demohot.demos.module.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public ModelAndView users() {
		Map<String, Object> model = new HashMap<>();
		List<User> users = userService.find().getRows();
		model.put("users", users);
		String view = "/user/users.jsp";// 前缀在beans-mvc.xml中配置
		return new ModelAndView(view, model);
	}

	@RequestMapping("/user/new")
	public String userNew() {
		return "/user/userEdit.jsp";
	}

	@RequestMapping("/user/create")
	public ModelAndView userCreate(String username, Integer age) {
		User po = new User();
		po.setUsername(username);
		po.setAge(age);
		userService.insert(po);
		return new ModelAndView("redirect:/users");
	}

	@RequestMapping("/user/delete")
	@ResponseBody
	public String userDelete(Long user_id) {
		userService.delete(user_id);
		return "success";
	}

	@RequestMapping("/user/edit/{user_id}")
	public ModelAndView userEdit(@PathVariable Long user_id) {// 取url中的参数
		Map<String, Object> model = new HashMap<>();
		User user = userService.get(user_id);
		model.put("user", user);
		String view = "/user/userEdit.jsp";
		return new ModelAndView(view, model);
	}

	@RequestMapping(value = "/user/update", consumes = { "application/x-www-form-urlencoded;charset=UTF-8" })
	public ModelAndView userUpdate(User params) {
		userService.update(params);
		return new ModelAndView("redirect:/users");
	}

}
