package com.es.web.main.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.web.common.exception.REException;
import com.es.web.common.util.RECrypto;
import com.es.web.common.vo.MemberVO;
import com.es.web.main.dao.IncludeDAO;

@Service("IncludeService")
public class IncludeServiceImpl implements IncludeService {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource
	private IncludeDAO includeDAO;

	@Autowired
	private RECrypto crypto;

	@Override
	public long login(MemberVO memberVO) throws Exception {
		boolean flag = includeDAO.isExistsMbrName(memberVO.getMbrName());

		if (!flag) {
			throw new REException("등록되지 않았는데? 누구냐 너.");
		}
		memberVO.setMbrPw(crypto.encrypt(memberVO.getMbrPw()));

		MemberVO resultVO = includeDAO.getMbrLoginVO(memberVO);
		if (resultVO == null) {
			throw new REException("비밀번호가 틀렸어. 잘 생각해봐");
		} else if (!"N".equals(resultVO.getMbrBlockYn())) {
			throw new REException("미안, 그만둔 사람은 더 이상 접속할 수 없어.");
		}

		return resultVO.getMbrSeq();
	}

	@Override
	public MemberVO getMemberInfo(long seq) throws Exception {
		MemberVO resultVO = includeDAO.getMbrInfo(seq);
		
		if(resultVO.getMbrName()==null || resultVO.getJobName()==null || resultVO.getJobRole()==null) {
			return null;
		} else {
			return resultVO;
		}
	
	}
	

}
