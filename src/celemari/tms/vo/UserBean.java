package celemari.tms.vo;

import java.io.Serializable;

public class UserBean implements Serializable{

    private boolean login = false;
    private int id;
    private String username;
    private String password;
    private int role;
    private String email;
    private String phone;

    public UserBean(){
    }
    
    public UserBean(int id, String username, String password, int role,
			String email, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.email = email;
		this.phone = phone;
	}

	public boolean isLogin(){
        return login;
    }

    public void setLogin(boolean login){
        this.login = login;
    }
    
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public int getRole(){
        return role;
    }

    public void setRole(int role){
        this.role = role;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
