package com.es.web.main.dao;

import org.springframework.stereotype.Repository;

import com.es.web.common.service.CommonDAO;
import com.es.web.common.vo.MemberVO;

@Repository("com.es.web.main.dao.IncludeDAO")
public class IncludeDAO extends CommonDAO {
	/**
	 * 로그임 검증을 위한 멤버 아이디가 존재하는지 확인
	 * 
	 * @param mbrName
	 * @return
	 * @throws Exception
	 */
	public boolean isExistsMbrName(String mbrName) throws Exception {
		String resultId = sqlSession.selectOne("IncludeMapper.isExistsMbrName", mbrName);
		return !stringUtils.isEmpty(resultId);
	}

	/**
	 * 로그임 검증을 위한 MemberVO 기본정보 조회
	 * 
	 * @param mbrName
	 * @return
	 * @throws Exception
	 */
	public MemberVO getMbrLoginVO(MemberVO memberVO) throws Exception {
		return sqlSession.selectOne("IncludeMapper.getMbrLoginVO", memberVO);
	}
	
	/**
	 * 로그인 성공 시 MemberVO 상세정보 조회
	 * @param seq
	 * @return
	 * @throws Exception
	 */
	public MemberVO getMbrInfo(Long seq) throws Exception {
		return sqlSession.selectOne("IncludeMapper.getMbrInfo", seq);
	}

}
