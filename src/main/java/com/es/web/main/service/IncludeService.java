package com.es.web.main.service;

import com.es.web.common.vo.MemberVO;

public interface IncludeService {

	// Login 처리
	public long login(MemberVO memberVO) throws Exception;
	
	// Login 성공 시 정보 가져오기
	public MemberVO getMemberInfo(long seq) throws Exception;	
	
}
