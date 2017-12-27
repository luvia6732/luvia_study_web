package com.es.web.main;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.es.web.common.service.CommonController;
import com.es.web.main.service.MainService;

@Controller
@RequestMapping(value = "/")
public class MainController extends CommonController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="MainService")
	private MainService mainService;
	
	/**
	 * Index page
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = {"", "/", "/index", "/home"}, method=RequestMethod.GET)
	public String index() throws Exception {		
		
		return "/main/index";
	}
		
}
