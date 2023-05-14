package com.study.test;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.test.member.service.MemberService;
import com.study.test.member.vo.MemberMenuVO;

import jakarta.annotation.Resource;



@Controller
public class IndexController {
	@Resource(name = "memberService")
	private MemberService memberService;

	@GetMapping("/")
	public String index(Model model, MemberMenuVO memberMenuVO) {

		if(memberMenuVO.getMenuCode() == null) {
			memberMenuVO.setMenuCode("MENU_001");
		}
		
		System.out.println("gddd$$@!@$!@$!$@!$@$!@!$@!$@@!$!!$@!$@!$@g" + memberMenuVO);
		
		model.addAttribute("menuList", memberService.stuMenuList());
		System.out.println("@@@@@@@@@@@@@" + memberService.stuMenuList());

		return "/content/info/info_main";

	/*public String index() {
		return "content/login/login_page";

	}*/
	}
}
