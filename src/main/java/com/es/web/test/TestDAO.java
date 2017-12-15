package com.es.web.test;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("com.es.web.test.TestDAO")
public class TestDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public String connectionTest() throws Exception {
		return sqlSession.selectOne("TEST.connectionTest");
	}
}
