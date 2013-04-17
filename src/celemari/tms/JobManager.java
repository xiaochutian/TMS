package celemari.tms;

import java.util.List;

import celemari.tms.hbn.Job;
import celemari.tms.hbn.Training;
import celemari.tms.vo.JobBean;
import celemari.tms.vo.TrainBean;

/**
 * 管理发布实训招收信息，查看已发布的信息并申请，处理申请及审批。
 */
public interface JobManager{

    /**
     * 发布一条实训招收信息
     *
     * @param userBean 发布信息的用户
     * @param jobBean 要发布的实训招收信息
     */
    void publishJob(int idteacher, int idcompany ,JobBean jobBean);

    /**
     * 获得已发布的实训招收信息的数量
     *
     * @return 已发布的实训招收信息的数量
     */
    int getCount();


    /**
     * 得到指定数量的实训招收信息
     *
     * @param start 索引开始处
     * @param len 要返回的实训招收信息数量
     * @return
     * start..start+len的实训招收信息列表，若start+len>getCount()，则返回的列表长度为getCount()-start
     */
    List<Job> getJobs(int start, int len);

    /**
     * 得到指定的用户所发布的实训招收信息
     *
     * @param userBean 要查找的用户
     * @return 该用户所发布的实训招收信息列表
     */
    List<Job> getJobs(int idteacher);

    /**
     * 移除指定的实训招收信息
     *
     * @param jobBean 要移除的信息
     */
    void removeJob(int idjob);

    /**
     * 用户申请应征指定的工作
     *
     * @param userBean 提出申请的用户
     * @param jobBean 申请的工作
     * @return 记录了申请信息的实训记录
     */
    void applyJob(int idstudent,int idjob,String appAddress);

    /**
     * 获得指定的招收中申请
     *
     * @param jobBean 要检索的招收信息
     * @return 注册在此招收信息上的申请列表，只包含未经审核的申请
     */
    List<Training> getTrains(int idjob);

    /**
     * 审核指定的申请，已接受的申请会从已发布的招收信息中移除
     *
     * @param trainBean 要审核的申请
     * @param accept true表示接受，false表示拒绝
     */
    void checkTrain(int idtrain, boolean accept);
}
