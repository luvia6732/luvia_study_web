package com.es.web.main.service;

import com.es.web.common.vo.MemberVO;

public interface MainService {
	
	// Login process
	public long login(MemberVO memberVO) throws Exception;

}
