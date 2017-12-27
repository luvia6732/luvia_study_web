package com.es.web.main;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.Parser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.es.web.common.exception.REException;
import com.es.web.common.service.CommonController;
import com.es.web.common.vo.MemberVO;
import com.es.web.main.service.IncludeService;

@Controller
@RequestMapping(value = "/include")
public class IncludeController extends CommonController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="IncludeService")
	private IncludeService includeService;
	
	/**
	 * HEADER INCLUDE
	 * @param session
	 * @param model
	 * @return includePage - Header
	 * @throws Exception
	 */
	@RequestMapping(value = "/header", method=RequestMethod.GET)
	public String header( HttpSession session, Model model ) throws Exception {
		
		if(session.getAttribute("mbrSeq") != null && !session.getAttribute("mbrSeq").equals(0L) ) {
			long seq = (Long) session.getAttribute("mbrSeq");
			MemberVO loginInfo = includeService.getMemberInfo(seq);
			model.addAttribute("LoginInfo", loginInfo);		
		}
		
		return "/include/header";
	}
	
	/**
	 * Login (로그인을 Ajax 처리하면 불편한 점이 있지 않을까? 고민해보자.)
	 * @param session
	 * @param memberVO
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/header/ajax/login", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public ResponseEntity<Map<String, Object>> login( HttpSession session, MemberVO memberVO ) throws Exception {
		if(stringUtils.isEmpty(memberVO.getMbrName())) {
			return ajaxResponse.getExceptionResponse("아이디를 적어야지?");
		}
		if(stringUtils.isEmpty(memberVO.getMbrPw())) {
			return ajaxResponse.getExceptionResponse("비밀번호 적어야지..");
		}
		
		try {
			long mbrSeq = includeService.login(memberVO);
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
	
	/**
	 * Logout
	 * @param session
	 * @return redirect includePage - header
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/header/ajax/logout", method=RequestMethod.GET, produces="application/json; charset=utf-8")
	public  ResponseEntity<Map<String, Object>> logout( HttpSession session ) throws Exception {
				
		try {
			session.invalidate();			
		} catch(Exception e) {
			return ajaxResponse.getExceptionResponse(e.getMessage());
		}
		return ajaxResponse.getSuccessResponse();
		
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
