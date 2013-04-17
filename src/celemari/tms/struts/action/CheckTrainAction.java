/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celemari.tms.struts.action;

import celemari.tms.JobManager;
import celemari.tms.vo.TrainBean;
import celemari.tms.vo.UserBean;
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
    private String isaccept, id;
    
    private static final long serialVersionUID = 1l;
	
    public String execute() throws Exception {
            
        Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
        UserBean user = (UserBean) session.get("user");
        if ( isaccept.equals("accept") )
            jm.checkTrain(getTrain(), isAccept());
        else
            
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

    /**
     * @return the isaccept
     */
    public String getIsaccept() {
        return isaccept;
    }

    /**
     * @param isaccept the isaccept to set
     */
    public void setIsaccept(String isaccept) {
        this.isaccept = isaccept;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}
