package com.bank.web.domains;

public class AdminBean extends MemberBean  {
	private String credit;
	
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getString() {
		return this.credit;
	}
	
	@Override
	public String toString() {
		
		return "고객정보 [아이디=" + getId() + ", 비번="
				+getPass() + ", 이름="
				+getName() + ", 주민번호 = "
				+ getSsn() + ", 신용도="
				+ credit+ "]";
	}
}
