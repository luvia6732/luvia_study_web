package com.es.web.common.vo;

/**
 * Member Table VO 
 * @author exelu
 *
 */
public class MemberVO {
	
	private long mbrSeq;
	private String mbrName;
	private String mbrPw;
	private String jobRole;
	private String jobName;
	private String mbrBlockYn;
	private String mbrAdmYnn;
	
	public long getMbrSeq() {
		return mbrSeq;
	}
	public void setMbrSeq(long mbrSeq) {
		this.mbrSeq = mbrSeq;
	}
	public String getMbrName() {
		return mbrName;
	}
	public void setMbrName(String mbrName) {
		this.mbrName = mbrName;
	}
	public String getMbrPw() {
		return mbrPw;
	}
	public void setMbrPw(String mbrPw) {
		this.mbrPw = mbrPw;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getMbrBlockYn() {
		return mbrBlockYn;
	}
	public void setMbrBlockYn(String mbrBlockYn) {
		this.mbrBlockYn = mbrBlockYn;
	}
	public String getMbrAdmYnn() {
		return mbrAdmYnn;
	}
	public void setMbrAdmYnn(String mbrAdmYnn) {
		this.mbrAdmYnn = mbrAdmYnn;
	}	
	
	

	
}
