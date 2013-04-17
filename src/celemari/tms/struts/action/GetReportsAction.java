/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package celemari.tms.struts.action;

import celemari.tms.TrainingManager;
import celemari.tms.vo.StudentDocumentBean;
import celemari.tms.vo.TrainBean;
import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ROC
 */
public class GetReportsAction {

    private List<StudentDocumentBean> studentdocument;
    private TrainBean train;
    private TrainingManager tm = new TrainingManagerImpl();
    
    private static final long serialVersionUID = 1l;
	
    public String execute() throws Exception {
            
        Map session = (Map)ActionContext.getContext().get(ActionContext.SESSION);
        setStudentdocument(tm.getReports(getTrain()));
        session.put("studentdocument", getStudentdocument());

	return "success";	
    }    

    /**
     * @return the studentdocument
     */
    public List<StudentDocumentBean> getStudentdocument() {
        return studentdocument;
    }

    /**
     * @param studentdocument the studentdocument to set
     */
    public void setStudentdocument(List<StudentDocumentBean> studentdocument) {
        this.studentdocument = studentdocument;
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
    
}
