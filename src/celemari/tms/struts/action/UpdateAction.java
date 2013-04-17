/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celemari.tms.struts.action;

import celemari.tms.UserManager;
import celemari.tms.impl.UserManagerImpl;
import celemari.tms.vo.UserBean;
import com.opensymphony.xwork2.ActionContext;
import java.util.Map;

/**
 *
 * @author ROC
 */
public class UpdateAction {
    
    private UserBean user;
    private UserManager um = new UserManagerImpl();
	
    private static final long serialVersionUID = 1l;
    
	public String execute() throws Exception {
            
            Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
            um.update( getUser());
            session.put( "user", getUser());
            return "success";
	}    

    /**
     * @return the user
     */
    public UserBean getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(UserBean user) {
        this.user = user;
    }
    
    
    
}
