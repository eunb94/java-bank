package com.bank.web.controllers;
import javax.swing.JOptionPane;
import com.bank.web.serviceImpl.MemberServiceImpl;
import com.bank.web.domains.MemberBean;
import com.bank.web.services.MemberService;
public class UserController {

	public static void main(String[] args) {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료, 1.회원가입, 2.회원정보, 3.이름찾기, 4.아이디 찾기, 5.로그인, 6.아이디 존재유무, 7.회원탈퇴")) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료");
				return;
				
			case "1" :
				break;
				
			case "2" :
				break;
				
			case "3" :
				break;
			case "4" :
				break;
			case "5" :
				
				//JOptionPane.showMessageDialog(null, service.login(member));
				break;
			case "6" :
				break;
			case "7" :
				break;
				
			}
		}
	}

}
