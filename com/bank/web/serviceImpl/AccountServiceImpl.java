package com.bank.web.serviceImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.bank.web.services.*;
import com.bank.web.domains.*;
import com.bank.web.serviceImpl.*;
import java.util.Random;


import com.bank.web.domains.CustomerBean;

public class AccountServiceImpl implements AccountService{
	private AccountBean[] accounts;
	private AdminBean[] admins;
	private CustomerBean[] customers;
	private MemberBean[] members;
	private int count, accCount;	

	public AccountServiceImpl() {
		accounts = new AccountBean[10];
		accCount = 0;
				
	}

	@Override
	public void createAccount(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money+"");
		account.setToday(findDate());		
		accounts[count] = account;
		count++;
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
			}else {
				result += a;
			}
		} 
		System.out.println(result);
		return result;
	}

	@Override
	public AccountBean[] findAll() {
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
		return accCount;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean flag = false;
		for(int i=0; i<accCount;i++) {
			if(accountNum.equals(accounts[i].getAccountNum())) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override// 오늘날짜, 현재시간(분까지) 반환
	public String findDate() {
		return new SimpleDateFormat("yyyy-MM-dd/hh:mm").format(new Date());
			
	}

	@Override
	public void depositMoney(AccountBean param) {
		String money = param.getMoney()+"";
		System.out.println(money);
		
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		
			
		
	}

}
