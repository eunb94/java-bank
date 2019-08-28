package bank.domains;

public class MemberBean {
	private String id, pass, name, ssn;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPass(String pass) {
		this.pass = pass;
		}
	public String getPass() {
		return this.pass;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
}
