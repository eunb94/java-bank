package bank.serviceImpls;

import bank.domains.AdminBean;
import bank.domains.CustomerBean;
import bank.domains.MemberBean;
import bank.services.MemberService;

public class MemberServiceImpl implements MemberService{
	private MemberBean[] members;
	private int count = 0;
	
	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
		count++;
		
	}

	@Override
	public void join(CustomerBean param) {
		MemberBean member = new MemberBean();
	//	member.setId(findById());
		
		
		
		
		
	}

	@Override
	public CustomerBean[] findAllCustomers() {
		
		return null;
	}

	@Override
	public AdminBean[] findAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(MemberBean param) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countAdmins() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(MemberBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean param) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
