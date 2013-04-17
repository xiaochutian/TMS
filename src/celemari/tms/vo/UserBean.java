package celemari.tms.vo;

import java.io.Serializable;
import java.util.List;

public class UserBean implements Serializable{

    private boolean login = false;
    private String idNumber;
    private String username;
    private String password;
    private int role;
    private String email;
    private String phone;

    public UserBean(){
    }
    
   

	public UserBean(String idNumber, String username, String password,
			int role, String email, String phone) {
		super();
		this.idNumber = idNumber;
		this.username = username;
		this.password = password;
		this.role = role;
		this.email = email;
		this.phone = phone;
	}



	public String getIdNumber() {
		return idNumber;
	}



	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
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
    
    public List<JobBean> getJobs(){
        //TODO: implement it
        return null;
    }
}
