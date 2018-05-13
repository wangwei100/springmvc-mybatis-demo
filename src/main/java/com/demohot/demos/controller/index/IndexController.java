package com.demohot.demos.controller.index;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/")
	public ModelAndView helloWorld() {
		Map<String, Object> model = new HashMap<>();
		model.put("name", "小明");
		model.put("age", 18);
		String view = "index/index.jsp";// 前缀在beans-mvc.xml中配置
		return new ModelAndView(view, model);
	}

}