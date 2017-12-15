package com.es.web.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class GlobalInterceptor extends HandlerInterceptorAdapter {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Constants constants;

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView mav) throws Exception {
		mav.addObject("CONSTANTS", constants);
		log.info("GLOBAL INTERCEPTOR");
	}
	
	

}
