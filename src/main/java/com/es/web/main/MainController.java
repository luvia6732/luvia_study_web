package com.es.web.main;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.es.web.common.exception.REException;
import com.es.web.common.service.CommonController;
import com.es.web.common.vo.MemberVO;
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
	public String index(HttpSession session) throws Exception {
		log.info("session = " + session.getAttribute("mbrSeq"));
		
		return "/main/index";
	}
	
	/**
	 * Login
	 * @param session
	 * @param memberVO
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/main/ajax/login", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public ResponseEntity<Map<String, Object>> login( HttpSession session, MemberVO memberVO ) throws Exception {
		if(stringUtils.isEmpty(memberVO.getMbrName())) {
			return ajaxResponse.getExceptionResponse("아이디를 적어야지?");
		}
		if(stringUtils.isEmpty(memberVO.getMbrPw())) {
			return ajaxResponse.getExceptionResponse("비밀번호 적어야지..");
		}
		
		try {
			long mbrSeq = mainService.login(memberVO);
			if(mbrSeq != 0L) {
				session.setAttribute("mbrSeq", mbrSeq);
			}
		} catch(REException e) {
			return ajaxResponse.getExceptionResponse(e.getMessage());
		} catch(Exception e) {
			return ajaxResponse.getErrorResponse();
		}
		
		return ajaxResponse.getSuccessResponse();
	}
}
