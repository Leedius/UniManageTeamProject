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
@RequestMapping("/memberMenu")
public class MenuController {
	
	@Resource(name = "memberService")
	private MemberService memberService;
	
	//-------------------Menu ============================================================================================================================
	//내 정보 관리
	@GetMapping("/myInfo")
	private String myInfo(Model model, MemberMenuVO memberMenuVO, MemberSubMenuVO memberSubMenuVO, String menuCode) {
		
		System.out.println(menuCode);
		
		//인터쎕터 써가꼬 필요없음. 이해되면 지워두댐. 아래 컨트롤러도 모두 인터셉터주면서 메뉴, 서브메뉴 모델 지움.
		//model.addAttribute("menuList",memberService.stuMenuList());
		//model.addAttribute("subMenuList", memberService.stuSubMenuList(menuCode));
		
		System.out.println("###################" + memberService.stuMenuList());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@" + memberService.stuSubMenuList(menuCode));
		
		System.out.println(memberMenuVO);
		
		
		return "/content/info/stu_myInfo/infoManage";
	}
	
	//학적 관리
	@GetMapping("myStu")
	private String myStu() {
		

		
		return "/content/info/stu_myStu/my_stu";
	}
	
	//교과수업
	@GetMapping("stuClass")
	private String stuClass() {
		
		return "/content/info/stu_class/grade";
	}
	
	
	
	//게시판
	@GetMapping("board")
	private String board() {

		
		return "/content/info/stu_board/totalBoard";
	}
	
	//캘린더
	@GetMapping("calender")
	private String calender() {

		
		return "/content/info/stu_calender/departmentSchedule";
	}
		
	//-----------------------------------------------------------------------------------------------------------------------------
	
	
	//-------------------SubMenu ============================================================================================================================
	
	// ---- 내정보 관리 { 
	//MyInfo
	@GetMapping("infoManage")
	private String infoManage() {

		
		return "/content/info/stu_myInfo/infoManage";
	}
	
	
	  //비밀번호변경	  
	  @GetMapping("changePwd") 
	  private String changePwd() {
	  
	  
	  return "/content/info/stu_myInfo/changePwd"; }
	 
	// ----- 내 정보 관리 끝 }
	
	
	//----------학적관리 {
	@GetMapping("/academicManage")
	private String academicManage() {

		return "/content/info/stu_myStu/academicManage";
	}
	
	
	// ---- 교과수업 { 
	//성적조회
		@GetMapping("grade")
		private String grade() {
			
			return "/content/info/stu_class/grade";
		}
		
	//수강신청
	@GetMapping("application")
	private String application() {

		return "/content/info/stu_class/application";
	}
	
	//수업평가
	@GetMapping("evaluation")
	private String evaluation() {

		return "/content/info/stu_class/evaluation";
	}
	
	// 교과수업 끝 } 
		
	// ------ 게시판 {
	//전체 게시판
	@GetMapping("/totalBoard")
	private String totalBoard() {

		return "/content/info/stu_board/totalBoard";
	}
	
	//중고 나눔
	@GetMapping("/donation")
	private String donation() {

		return "/content/info/stu_board/donation";
	}
	
	// 게시판 끝 } 
	
	//----------- 캘린더 {
	//학과 일정
	@GetMapping("/departmentSchedule")
	private String departmentSchedule() {

		return "/content/info/stu_calender/departmentSchedule";
	}
	
	//내 할일
	@GetMapping("/mySchedule")
	private String mySchedule() {

		return "/content/info/stu_calender/mySchedule";
	}
	
	
	
	
	
}
