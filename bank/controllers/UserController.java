package bank.controllers;
import javax.swing.JOptionPane;

import bank.domains.MemberBean;
import bank.services.MemberService;
public class UserController {

	public static void main(String[] args) {
		MemberBean member = null;
		MemberService service = null;
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료, 1.회원가입, 2.회원정보, 3.이름찾기, 4.아이디 찾기, 5.로그인, 6.아이디 존재유무, 7.회원탈퇴")) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료");
				return;
				
			case "1" :
				
			}
		}
	}

}
