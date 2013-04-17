/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celemari.tms.struts.action;

import celemari.tms.JobManager;
import celemari.tms.vo.JobBean;
import celemari.tms.vo.UserBean;
import com.opensymphony.xwork2.ActionContext;
import java.util.Map;

/**
 *
 * @author ROC
 */
public class PublishJobAction {
    private UserBean user;
    private JobBean job;
    private JobManager jm = new JobManagerImpl();
    
    private static final long serialVersionUID = 1l;
	
    public String execute() throws Exception {
            
        Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
        jm.publishJob(getUser(), getJob());
        session.put("job", getJob());

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

    /**
     * @return the job
     */
    public JobBean getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(JobBean job) {
        this.job = job;
    }
}
