package com.study.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		

		return "content/info_main";
	}
}