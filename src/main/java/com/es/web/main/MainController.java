package com.es.web.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class MainController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	// main page로 접근하는 복수개의 요청을 하나의 경로로 전달.
	@RequestMapping(value = {"", "/", "/index", "/home"}, method=RequestMethod.GET)
	public String index() throws Exception {
		log.info("INDEX CONTROLLER");
		
		return "/main/index";
	}
}
