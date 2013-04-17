/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celemari.tms.struts.action;

import celemari.tms.TrainingManager;
import celemari.tms.vo.TrainBean;
import com.opensymphony.xwork2.ActionContext;
import java.util.Map;

/**
 *
 * @author ROC
 */
public class GradeTrainAction {

    private TrainBean train;
    private int grade;
    private TrainingManager tm = new TrainingManagerImpl();
    
    private static final long serialVersionUID = 1l;
	
    public String execute() throws Exception {
            
        Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
        tm.gradeTrain(getTrain(), getGrade());
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
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
}
