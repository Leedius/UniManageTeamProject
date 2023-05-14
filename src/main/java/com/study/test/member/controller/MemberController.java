package com.study.test.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.test.member.service.MemberService;
import com.study.test.member.vo.MemberMenuVO;
import com.study.test.member.vo.MemberSubMenuVO;

import jakarta.annotation.Resource;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Resource(name = "memberService")
	private MemberService memberService;
	
	//-------------------Menu ============================================================================================================================
	//내 정보 관리
	@GetMapping("/myInfo")
	private String myInfo(Model model, MemberMenuVO memberMenuVO, MemberSubMenuVO memberSubMenuVO, String menuCode) {
		
		System.out.println(menuCode);
		
		model.addAttribute("menuList",memberService.stuMenuList());
		model.addAttribute("subMenuList", memberService.stuSubMenuList(menuCode));
		
		System.out.println("###################" + memberService.stuMenuList());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@" + memberService.stuSubMenuList(menuCode));
		
		System.out.println(memberMenuVO);
		
		
		return "/content/info/stu_myInfo/my_info";
	}
	
	//학적 관리
	@GetMapping("myStu")
	private String myStu(Model model, MemberMenuVO memberMenuVO, MemberSubMenuVO memberSubMenuVO, String menuCode) {
		
		System.out.println(menuCode);
		
		model.addAttribute("menuList",memberService.stuMenuList());
		model.addAttribute("subMenuList", memberService.stuSubMenuList(menuCode));
		
		System.out.println("###################" + memberService.stuMenuList());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@" + memberService.stuSubMenuList(menuCode));
		
		System.out.println(memberMenuVO);

		
		return "/content/info/stu_myStu/my_stu";
	}
	
	//교과수업
	@GetMapping("stuClass")
	private String stuClass(Model model, MemberMenuVO memberMenuVO, MemberSubMenuVO memberSubMenuVO, String menuCode) {
		System.out.println(menuCode);
		
		model.addAttribute("menuList",memberService.stuMenuList());
		model.addAttribute("subMenuList", memberService.stuSubMenuList(menuCode));
		
		System.out.println("###################" + memberService.stuMenuList());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@" + memberService.stuSubMenuList(menuCode));
		
		return "/content/info/stu_class/class";
	}
	
	
	
	//게시판
	@GetMapping("board")
	private String board(Model model, MemberMenuVO memberMenuVO, MemberSubMenuVO memberSubMenuVO, String menuCode) {
		System.out.println(menuCode);
		
		model.addAttribute("menuList",memberService.stuMenuList());
		model.addAttribute("subMenuList", memberService.stuSubMenuList(menuCode));
		
		System.out.println("###################" + memberService.stuMenuList());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@" + memberService.stuSubMenuList(menuCode));

		
		return "/content/info/stu_board/board";
	}
	
	//캘린더
	@GetMapping("calender")
	private String calender(Model model, MemberMenuVO memberMenuVO, MemberSubMenuVO memberSubMenuVO, String menuCode) {
		System.out.println(menuCode);
		
		model.addAttribute("menuList",memberService.stuMenuList());
		model.addAttribute("subMenuList", memberService.stuSubMenuList(menuCode));
		
		System.out.println("###################" + memberService.stuMenuList());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@" + memberService.stuSubMenuList(menuCode));

		
		return "/content/info/stu_calender/calender";
	}
		
	//-----------------------------------------------------------------------------------------------------------------------------
	
	//성적조회
		@GetMapping("grade")
		private String grade(Model model, MemberMenuVO memberMenuVO, MemberSubMenuVO memberSubMenuVO, String menuCode) {
			System.out.println(menuCode);
			
			model.addAttribute("menuList",memberService.stuMenuList());
			model.addAttribute("subMenuList", memberService.stuSubMenuList(menuCode));
			
			System.out.println("###################" + memberService.stuMenuList());
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@" + memberService.stuSubMenuList(menuCode));

			
			return "/content/info/stu_class/class";
		}
		
	//비밀번호 변경 페이지 이동
	@GetMapping("/changePwd")
	private String cateManage(Model model, MemberMenuVO memberMenuVO) {
		
		return "/content/info/change_pwd";
	}
	
	
	//학적 관리 페이지
	
	@GetMapping("/academicManage")
	private String academic(Model model, MemberMenuVO memberMenuVO) {
	
		return "/content/info/academic_manage"; 
	}
	
}
