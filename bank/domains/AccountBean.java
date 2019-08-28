package bank.domains;

public class AccountBean {
	private int money;
	private String accountNum, today;

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return this.accountNum;
	}
	public void setToday(String today ) {
		this.today = today;
	}
	public String getToday() {
		return this.today;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return this.money;
	}

}
