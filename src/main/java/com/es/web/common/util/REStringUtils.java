package com.es.web.common.util;

public class REStringUtils {

	/**
	 * empty check of mybatis
	 * 
	 * @param obj
	 * @return
	 */
	public boolean isEmpty(Object obj) {
		if (obj == null) {
			return true;
		}
		if (obj instanceof String) {
			return "".equals(((String) obj).trim());
		}
		if (obj instanceof Integer) {
			return false;
		}
		return false;
	}

	/**
	 * Null 값인경우 "" 로 치환, Null이 아니면 Trim 적용후 반환
	 * 
	 * @param param
	 * @return
	 */
	public String nullToEmptyTrimString(String param) {
		return param == null ? "" : param.trim();
	}

}
