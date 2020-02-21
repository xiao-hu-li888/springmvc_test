package com.accp.handler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHandler {
	
	@RequestMapping("/a")
	public String showPage() {
		return "/WEB-INF/view/test.jsp";
	}
}
