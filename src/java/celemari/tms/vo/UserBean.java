package celemari.tms.vo;

import celemari.tms.data.UserEntity;
import java.io.Serializable;

public class UserBean implements Serializable{

    private boolean login = false;
    private String username;
    private UserEntity entity;
    private int role;

    public UserBean(){
    }
    
    public boolean isLogin(){
        return login;
    }

    public void setLogin(boolean login){
        this.login = login;
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
}
