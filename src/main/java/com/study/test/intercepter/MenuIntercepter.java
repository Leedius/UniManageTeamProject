package com.study.test.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.study.test.member.service.MemberService;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

	

public class MenuIntercepter implements HandlerInterceptor {
	
	@Resource(name="memberService")
	private MemberService memberService;
	
	

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		String menuCode = request.getParameter("menuCode");
		
		modelAndView.addObject("menuList", memberService.stuMenuList());
		modelAndView.addObject("subMenuList", memberService.stuSubMenuList(menuCode));
	}

	

	
	
}
