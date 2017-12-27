package com.es.web.main.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.es.web.common.service.CommonDAO;

@Repository("com.es.web.main.dao.MainDAO")
public class MainDAO extends CommonDAO {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	
}
