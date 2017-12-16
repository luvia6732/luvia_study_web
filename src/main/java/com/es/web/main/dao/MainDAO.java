package com.es.web.main.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.es.web.common.service.CommonDAO;
import com.es.web.common.vo.MemberVO;

@Repository("com.es.web.main.dao.MainDAO")
public class MainDAO extends CommonDAO {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 로그임 검증을 위한 멤버 아이디가 존재하는지 확인
	 * @param mbrName
	 * @return
	 * @throws Exception
	 */
	public boolean isExistsMbrName(String mbrName) throws Exception {
		String resultId = sqlSession.selectOne("MainMapper.isExistsMbrName", mbrName);
		return !stringUtils.isEmpty(resultId);
				
	}

	/**
	 * 로그임 검증을 위한 멤버 아이디가 존재하는지 확인
	 * @param mbrName
	 * @return
	 * @throws Exception
	 */
	public MemberVO getMbrLoginVO(MemberVO memberVO) throws Exception {
		return sqlSession.selectOne("MainMapper.getMbrLoginVO", memberVO);
	}
}
