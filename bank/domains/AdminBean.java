package bank.domains;

public class AdminBean extends MemberBean  {
	private String credit;
	
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getString() {
		return this.credit;
	}
}
