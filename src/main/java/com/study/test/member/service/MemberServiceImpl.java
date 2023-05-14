package com.study.test.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.test.member.vo.MemberMenuVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//학생 메뉴
	@Override
	public List<MemberMenuVO> stuMenuList() {
		return sqlSession.selectList("memberMenuMapper.stuMenuList");
	}

	//학생ㅅㅓ브 메뉴
	@Override
	public List<MemberMenuVO> stuSubMenuList(String menuCode) {
		return sqlSession.selectList("memberMenuMapper.stuSubMenuList", menuCode);
	}

	
}
