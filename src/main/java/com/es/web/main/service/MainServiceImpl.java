package com.es.web.main.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.es.web.main.dao.MainDAO;

@Service("MainService")
public class MainServiceImpl implements MainService {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private MainDAO mainDAO;

	
}
