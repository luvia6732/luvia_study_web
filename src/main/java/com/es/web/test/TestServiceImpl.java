package com.es.web.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("TestService")
public class TestServiceImpl implements TestService {
	
	@Resource
	private TestDAO testDAO;

	@Override
	public String connectionTest() throws Exception {
		// TODO Auto-generated method stub
		return testDAO.connectionTest();
	}
	
	

}
