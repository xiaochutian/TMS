/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celemari.tms.struts.action;

import celemari.tms.UserManager;
import celemari.tms.impl.UserManagerImpl;
import celemari.tms.vo.UserBean;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;

/**
 *
 * @author ROC
 */
public class LoginAction {
	
	private UserBean user, retuser;
        private UserManager um = new UserManagerImpl();
	
	private static final long serialVersionUID = 1l;
	
	public String execute() throws Exception {
            
            Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
            retuser = um.login(user.getId(), user.getPassword(),user.getRole());
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