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
public class GradeAction {
    private static final long serialVersionUID = 1l;
    
    private JobManager jm = new JobManagerImpl();
    private List<TrainBean> trains;
    
    public String execute() throws Exception {
            
        Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
        UserBean user = (UserBean)session.get("user");
        List<JobBean> jList = jm.getJobs(user);
        setTrains(new LinkedList<TrainBean>());
        for ( JobBean t : jList )
        {
            getTrains().addAll(jm.getTrains(t));
            
        }
        session.put("trains", getTrains());
        
        return "success";
		
    }       

    /**
     * @return the trains
     */
    public List<TrainBean> getTrains() {
        return trains;
    }

    /**
     * @param trains the trains to set
     */
    public void setTrains(List<TrainBean> trains) {
        this.trains = trains;
    }
}
