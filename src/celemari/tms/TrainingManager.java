package celemari.tms;

import celemari.tms.vo.StudentDocumentBean;
import celemari.tms.vo.TrainBean;
import java.util.List;

public interface TrainingManager{

    /**
     * 为实训添加一篇报告
     *
     * @param trainBean 要添加报告的实训
     * @param doc 要添加的报告
     */
    void addReport(TrainBean trainBean, StudentDocumentBean doc);

    /**
     * 获得指定的实训关联的报告
     *
     * @param trainBean 要检索的实训
     * @return 与该实训关联的报告的列表
     */
    List<StudentDocumentBean> getReports(TrainBean trainBean);

    /**
     * 为指定的实训评分
     *
     * @param trainBean 要评分的实训
     * @param grade 分数
     */
    void gradeTrain(TrainBean trainBean, int grade);
}
