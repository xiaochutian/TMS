package celemari.tms.hbn;

public class User {

	private String name;
	private String password;
	
	
	public User() {
		super();
	}
	public User(String username, String password) {
		super();
		this.name = username;
		this.password = password;
	}
	public String getUsername() {
		return name;
	}
	public void setUsername(String username) {
		this.name = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
