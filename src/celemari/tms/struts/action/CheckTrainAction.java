/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celemari.tms.struts.action;

import celemari.tms.JobManager;
import celemari.tms.vo.TrainBean;
import com.opensymphony.xwork2.ActionContext;
import java.util.Map;

/**
 *
 * @author ROC
 */
public class CheckTrainAction {
    
    private TrainBean train;
    private JobManager jm = new JobManagerImpl();
    private boolean accept;
    
    private static final long serialVersionUID = 1l;
	
    public String execute() throws Exception {
            
        Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
        jm.checkTrain(getTrain(), isAccept());
        session.put("train", getTrain());

	return "success";	
    }        

    /**
     * @return the train
     */
    public TrainBean getTrain() {
        return train;
    }

    /**
     * @param train the train to set
     */
    public void setTrain(TrainBean train) {
        this.train = train;
    }

    /**
     * @return the accept
     */
    public boolean isAccept() {
        return accept;
    }

    /**
     * @param accept the accept to set
     */
    public void setAccept(boolean accept) {
        this.accept = accept;
    }
    
}
