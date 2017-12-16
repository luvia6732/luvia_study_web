package com.es.web.main.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.web.common.exception.REException;
import com.es.web.common.util.RECrypto;
import com.es.web.common.vo.MemberVO;
import com.es.web.main.dao.MainDAO;

@Service("MainService")
public class MainServiceImpl implements MainService {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private MainDAO mainDAO;
	
	@Autowired
	private RECrypto crypto;
	
	/**
	 * 로그인 처리
	 * @param memberVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public long login(MemberVO memberVO) throws Exception {
		boolean flag = mainDAO.isExistsMbrName( memberVO.getMbrName() );
		
		if( !flag ) {
			throw new REException("등록되지 않은 아이디. 너 누구임?");
		}
		memberVO.setMbrPw( crypto.encrypt( memberVO.getMbrPw() ) );
		
		MemberVO resultVO = mainDAO.getMbrLoginVO( memberVO );
		if(resultVO == null) {
			throw new REException("비밀번호가 틀렸어. 잘 생각해봐");
		} else if(!"N".equals(resultVO.getMbrBlockYn())) {
			throw new REException("미안, 나간 사람은 더 이상 접속할 수 없어.");
		}
		
		return resultVO.getMbrSeq();
	}
}
