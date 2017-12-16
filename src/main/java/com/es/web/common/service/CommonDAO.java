package com.es.web.common.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.es.web.common.util.REStringUtils;

public class CommonDAO {
	
	@Autowired
	protected SqlSession sqlSession;
	
	@Autowired
	protected REStringUtils stringUtils;

}
