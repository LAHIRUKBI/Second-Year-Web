package supervisor;

public class Supervisor {
	
	private int id;
	private String name;
	private String email;
	private String phone;
	private String branch;
	private String userName;
	private String password;
	public Supervisor(int id, String name, String email, String phone, String branch, String userName,String password) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.branch = branch;
		this.userName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	
	
	

}
