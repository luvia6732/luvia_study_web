package com.es.web.common.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.es.web.common.util.AjaxResponse;
import com.es.web.common.util.REStringUtils;

public class CommonController {
	
	@Autowired
	protected AjaxResponse ajaxResponse;
	
	@Autowired
	protected REStringUtils stringUtils;

}
