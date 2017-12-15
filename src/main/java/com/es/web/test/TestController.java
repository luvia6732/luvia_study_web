package com.es.web.test;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="TestService")
	private TestService testService;
	
	@RequestMapping(value = "/connectionTest")
	public String connectionTest(Model model) throws Exception {
		String toDate = "## Init ##";
		
		try {
			toDate = testService.connectionTest();
			
			model.addAttribute("toDate", toDate);
		} catch (Exception e) {
			log.error("connectionTest Exception ", e);
		}
		
		return "home";
	}
	
	
}
