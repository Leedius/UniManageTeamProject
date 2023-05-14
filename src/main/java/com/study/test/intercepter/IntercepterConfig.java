package com.study.test.intercepter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class IntercepterConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {


		registry.addInterceptor(getMenuIntercepter())
				.addPathPatterns("/memberMenu/**");
				/*
				.addPathPatterns("/memberMenu/myInfo")
				.addPathPatterns("/memberMenu/myStu")
				.addPathPatterns("/memberMenu/stuClass")
				.addPathPatterns("/memberMenu/board")
				.addPathPatterns("/memberMenu/calender")
				.addPathPatterns("/memberMenu/infoManage")
				.addPathPatterns("/memberMenu/changePwd")
				.addPathPatterns("/memberMenu/academicManage")
				.addPathPatterns("/memberMenu/grade")
				.addPathPatterns("/memberMenu/application")
				.addPathPatterns("/memberMenu/evaluation")
				.addPathPatterns("/memberMenu/totalBoard")
				.addPathPatterns("/memberMenu/donation")
				.addPathPatterns("/memberMenu/evaluation")
				.addPathPatterns("/memberMenu/departmentSchedule")
				.addPathPatterns("/memberMenu/mySchedule");
				*/
	}

	@Bean
	public MenuIntercepter getMenuIntercepter() {
		return new MenuIntercepter();
	}
	
	
}
