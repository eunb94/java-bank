package com.bank.web.serviceImpl;
import com.bank.web.services.*;

import bank.domains.AdminBean;
import bank.domains.CustomerBean;
import bank.domains.MemberBean;

import com.bank.web.domains.*;




public class MemberServiceImpl implements MemberService{
	private CustomerBean[] customers;
	private AdminBean[] admins;
	private int custCount, adminCount;
	
	public MemberServiceImpl() {
		customers = new CustomerBean[10];
		admins = new AdminBean[10];
		custCount = 0;
		adminCount = 0;
	}
	@Override
	public void join(CustomerBean param) {
		customers[custCount] = param;
		custCount++;
		
	}

	@Override
	public void register(AdminBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerBean[] findAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminBean[] findAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int mCount = 0;
		for(int i=0; i<custCount;i++) {
			if(name.equals(customers[i].getName())) {
				mCount++;
			}
		}
		for(int i=0; i<adminCount;i++) {
			if(name.equals(admins[i].getName())) {
				mCount++;			
			}
		}
		MemberBean[] members = new MemberBean[mCount]; 
		int j = 0;
		for(int i=0; i<custCount;i++) {
			if(name.equals(customers[i].getName())) {
				members[j] = customers[i];
				j++;
			}
		}
		for(int i=0; i<adminCount;i++) {
			if(name.equals(admins[i].getName())) {
				members[j] = admins[i];		
				j++;
			}
		}
		return members;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean c = new MemberBean();
		for(int i=0; i<custCount; i++) {
			if(id.equals(customers[i].getId())) {
				c = customers[i];
				break;
			}
		}
		for(int i=0; i<adminCount; i++) {
			if(id.equals(admins[i].getId())) {
				c = admins[i];
				break;
			}
		}
	
		
		return c;
	}

	@Override
	public boolean login(MemberBean param) {
		boolean flag = false;
		for(int i=0; i<custCount; i++) {
			if(param.getId().equals(customers[i].getId())
			&& param.getPass().equals(customers[i].getPass())){
				flag = true;	
				break;
			}
		}
		for(int i=0; i<adminCount; i++) {
			if(param.getId().equals(admins[i].getId())
			&& param.getPass().equals(admins[i].getPass())){
				flag = true;	
				break;
			}
		}		
		return flag;
	}

	@Override
	public int countCustomers() {
		return custCount;
	}

	@Override
	public int countAdmins() {
		return adminCount;
	}

	@Override
	public boolean existId(String id) {
		boolean flag = false;
		for(int i=0; i<custCount; i++) {
			if(id.equals(customers[i].getId())) {
				flag = true;
				break;
			}
		}
		for(int i=0; i<adminCount; i++) {
			if(id.equals(admins[i].getId())) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public void updatePass(MemberBean param) {
		String id = param.getId();
		String[] pass = param.getPass().split(",");
		String oldPass = pass[0];
		String newPass = pass[1];
		param.setPass(oldPass);
		if(login(param)){
			findById(param.getId()).setPass(newPass);
		
		
	}
	}	
	

	@Override
	public void deleteMember(MemberBean param) {
		if(login(param)) {
			for(int i=0; i<custCount;i++) {
				if(param.getId().equals(customers[i].getId())) {
					customers[i] = customers[custCount-1];
					custCount--;
					break;
				}
			}
			for(int i=0; i<adminCount;i++) {
				if(param.getId().equals(admins[i].getId())) {
					admins[i] = admins[custCount-1];
					adminCount--;
					break;
				
	}
}
		}
	}
}

