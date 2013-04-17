/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celemari.tms.struts.action;

import celemari.tms.JobManager;
import celemari.tms.vo.JobBean;
import com.opensymphony.xwork2.ActionContext;
import java.util.Map;

/**
 *
 * @author ROC
 */
public class RemoveJobAction {

    private JobBean job;
    private JobManager jm = new JobManagerImpl();
    
    private static final long serialVersionUID = 1l;
	
    public String execute() throws Exception {
            
        Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
        jm.removeJob(getJob());
        session.put("job", getJob());

	return "success";	
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
