package bank.serviceImpls;
import java.text.SimpleDateFormat;
import java.util.Date;
import bank.domains.AccountBean;
import bank.services.AccountService;
import java.util.Random;
import javax.swing.JOptionPane;

public class AccountServiceImpl implements AccountService{
	private AccountBean[] accounts;
	private int count = 0;
	
	
	public AccountServiceImpl() {
		accounts = new AccountBean[10];
		count = 0;
		count++;
				
	}

	@Override
	public void createAccount(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(findDate());
		
	}

	@Override
	public String createAccountNum() { // 1234-5678
		Random random = new Random();
		String a = random.nextInt(10)+"";
		String result = "";
		for(int i=0; i<9; i++) {
			result += random.nextInt(10)+"";
			if(i==4) {
				result += "-";
			}		
		} 
		System.out.println(result);
		return result;
	}

	@Override
	public AccountBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for(int i=0; i<count; i++) {
			if(accountNum.equals(accounts[i].getAccountNum())) {
				account = accounts[i];
				break;
			}
		}		
		return account;
	}

	@Override
	public int countAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean flag = false;
		AccountBean account = new AccountBean();
		for(int i=0; i<count; i++) {
			if(accountNum.equals(accounts[i].getAccountNum())) {
				flag = true;
				break;
			}
		}
	
		return flag;
	}

	@Override// 오늘날짜, 현재시간(분까지) 반환
	public String findDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd/hh:mm");
		String now = sdf.format(date);
		
		return now;
	}

	@Override
	public void depositMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
	
		
	}

}
