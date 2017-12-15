package com.es.web.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AjaxResponse {
	
	private Map<String, Object> resultMap;
	
	public synchronized ResponseEntity<Map<String, Object>> getSuccessResponse() {
		resultMap = new HashMap<String, Object>();
		resultMap.put("resCode", "0000");
		resultMap.put("resMsg", "SUCCESS");
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}
	
	public synchronized ResponseEntity<Map<String, Object>> getExceptionResponse( String exceptionMsg ) {
		resultMap = new HashMap<String, Object>();
		resultMap.put("resCode", "9000");
		resultMap.put("resMsg",exceptionMsg);
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}
	
	public synchronized ResponseEntity<Map<String, Object>> getErrorResponse() {
		resultMap = new HashMap<String, Object>();
		resultMap.put("resCode", "9999");
		resultMap.put("resMsg", "SERVER-ERROR");
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}

}
