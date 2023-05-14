package com.study.test.member.service;

import java.util.List;

import com.study.test.member.vo.MemberMenuVO;

public interface MemberService {

	//학생 메뉴
	List<MemberMenuVO> stuMenuList();
	
	//학생 서브 메뉴
	List<MemberMenuVO> stuSubMenuList(String menuCode);
}
