package com.me.java.controller.cms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cms")
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		
		return "/cms/index";
	}
}
