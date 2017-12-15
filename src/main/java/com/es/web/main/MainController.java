package com.es.web.main;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.es.web.common.CommonController;

@Controller
@RequestMapping(value = "/")
public class MainController extends CommonController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * Index page
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = {"", "/", "/index", "/home"}, method=RequestMethod.GET)
	public String index() throws Exception {
		log.info("INDEX CONTROLLER");
		
		return "/main/index";
	}
	
	@ResponseBody
	@RequestMapping(value = "/main/ajax/login", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public ResponseEntity<Map<String, Object>> login() throws Exception {
		
		return ajaxResponse.getSuccessResponse();
	}
}
