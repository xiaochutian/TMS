/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celemari.tms.struts.action;

import celemari.tms.JobManager;
import celemari.tms.vo.JobBean;
import celemari.tms.vo.TrainBean;
import celemari.tms.vo.UserBean;
import com.opensymphony.xwork2.ActionContext;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ROC
 */
public class JobListAction {
    private static final long serialVersionUID = 1l;
    
    private JobManager jm = new JobManagerImpl();
    private List<JobBean> jobs;
    
    public String execute() throws Exception {
            
        Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
        UserBean user = (UserBean)session.get("user");
        setJobs(jm.getJobs(0, 100));
        session.put("jobs", getJobs());
        
        return "success";
		
    }      

    /**
     * @return the jobs
     */
    public List<JobBean> getJobs() {
        return jobs;
    }

    /**
     * @param jobs the jobs to set
     */
    public void setJobs(List<JobBean> jobs) {
        this.jobs = jobs;
    }
}
