package tiDo.Manager;

public class Manager {
	private String usename;
	private String password;
	
	public Manager(String usename, String password) {
		this.usename = usename;
		this.password = password;
	}
	
	public String getUsename() {
		return usename;
	}

	public String getPassword() {
		return password;
	}	
	
	public void setUsename(String usename) {
		this.usename = usename;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void display() {
		System.out.println("usename: " + this.usename + "\n" + 
				"password: " + this.password + "\n");
	}
}
