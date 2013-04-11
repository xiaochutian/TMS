package celemari.tms.vo;

import java.io.Serializable;

public class UserBean implements Serializable{

    private boolean login = false;
    private int id;
    private String username;
    private String password;
    private int role;

    public UserBean(){
    }
    
    public boolean isLogin(){
        return login;
    }

    public void setLogin(boolean login){
        this.login = login;
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
