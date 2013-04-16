/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celemari.tms.struts.action;

import celemari.tms.UserManager;
import celemari.tms.vo.UserBean;
import com.opensymphony.xwork2.ActionContext;
import java.util.Map;

/**
 *
 * @author ROC
 */
public class RegisterAction {
    
	private UserBean user, retuser;
        private UserManager um;
	
	private static final long serialVersionUID = 1l;
	
	public String execute() throws Exception {
            
            Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
            retuser = um.register(user.getId(),user.getUsername(), user.getPassword(),user.getRole(), user.getEmail(), user.getPhone());
            if ( retuser != null ){
                session.put("user", retuser);
                return "success";
            }
                
            else{
                return "fail";
            }
		
	}
	
	public UserBean getUser(){
		return user;
	}
	
	public void setUser(UserBean user){
		this.user = user;
	}

}
