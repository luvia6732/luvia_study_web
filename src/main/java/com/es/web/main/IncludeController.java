package com.es.web.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/include")
public class IncludeController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * HEADER INCLUDE
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/header", method=RequestMethod.GET)
	public String header() throws Exception {
		
		return "/include/header";
	}
	
	/**
	 * FOOTER INCLUDE
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/footer", method=RequestMethod.GET)
	public String footer() throws Exception {
		
		return "/include/footer";
	}

}
