package celemari.tms.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import celemari.tms.JobManager;
import celemari.tms.hbn.CompanyDAO;
import celemari.tms.hbn.HibernateSessionFactory;
import celemari.tms.hbn.Job;
import celemari.tms.hbn.JobDAO;
import celemari.tms.hbn.StudentDAO;
import celemari.tms.hbn.TeacherDAO;
import celemari.tms.hbn.Training;
import celemari.tms.hbn.TrainingDAO;
import celemari.tms.vo.JobBean;
import celemari.tms.vo.TrainBean;

public class JobManagerImpl implements JobManager {

	@Override
	public void publishJob(int idteacher, int idcompany,JobBean jobBean) {
		// TODO Auto-generated method stub

		CompanyDAO cd = new CompanyDAO();
		TeacherDAO td = new TeacherDAO();
		Job j = new Job();
		JobDAO jd = new JobDAO();
		j.setBrief(jobBean.getBrief());
		j.setCompany(cd.findById(idcompany));
		j.setName(jobBean.getName());
		j.setStudentMax(jobBean.getStudentMax());
		j.setStudentPresent(0);
		j.setTeacher(td.findById(idteacher));
		Session sess =HibernateSessionFactory.getSession();
		Transaction tx =sess.beginTransaction();
		try{
			jd.save(j);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			sess.close();
		}
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		JobDAO jd = new JobDAO();
		List<Job> list=jd.findAll();
		return list.size();
	}

	@Override
	public List<Job> getJobs(int start, int len) {
		// TODO Auto-generated method stub
		JobDAO jd = new JobDAO();
		List<Job> list=jd.findAll();
		List<Job> list1= new ArrayList();
		for(int i=start;i<start+len;i++){
			list1.add(list.get(i));
		}
		return list1;
	}

	@Override
	public List<Job> getJobs(int idteacher) {
		// TODO Auto-generated method stub
		JobDAO jd = new JobDAO();
		List<Job> list=jd.findByProperty("teacher", idteacher);
		return list;
	}

	@Override
	public void removeJob(int idjob) {
		// TODO Auto-generated method stub
		JobDAO jd = new JobDAO();
		Session sess = HibernateSessionFactory.getSession();
		Transaction tx =sess.beginTransaction();
		try{
			jd.delete(jd.findById(idjob));
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			sess.close();
		}
	}

	@Override
	public void applyJob(int idstudent,int idjob,String appAddress) {
		// TODO Auto-generated method stub
		JobDAO jd = new JobDAO();
		StudentDAO sd = new StudentDAO();
		Training t = new Training();
		TrainingDAO td = new TrainingDAO();
		t.setApplicationAddress(appAddress);
		t.setJob(jd.findById(idjob));
		t.setState((short)0);
		t.setStudent(sd.findById(idstudent));
		Session sess =HibernateSessionFactory.getSession();
		Transaction tx =sess.beginTransaction();
		try{
			td.save(t);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			sess.close();
		}
	}

	@Override
	public List<Training> getTrains(int idjob) {
		// TODO Auto-generated method stub
		TrainingDAO td = new TrainingDAO();
		Job j = new Job();
		JobDAO jd = new JobDAO();
		j = jd.findById(idjob);
		List<Training> list= td.findByProperty("job", j);
		return list;
	}

	@Override
	public void checkTrain(int idtrain, boolean accept) {
		// TODO Auto-generated method stub
		Session sess =HibernateSessionFactory.getSession();
		Transaction tx= sess.beginTransaction();
		TrainingDAO td = new TrainingDAO();
		Training t=td.findById(idtrain);
		if(accept==true){
			t.setState((short)1);
			try{
				td.save(t);
				tx.commit();
			}catch(Exception e){
				tx.rollback();
				e.printStackTrace();
			}finally{
				sess.close();
			}
		}else{
			try{
				td.delete(t);
				tx.commit();
			}catch(Exception e){
				tx.rollback();
				e.printStackTrace();
			}finally{
				sess.close();
			}
		}
		

	}

}
