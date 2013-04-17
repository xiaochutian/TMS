package celemari.tms.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import celemari.tms.TrainingManager;
import celemari.tms.hbn.HibernateSessionFactory;
import celemari.tms.hbn.Studentdocument;
import celemari.tms.hbn.StudentdocumentDAO;
import celemari.tms.hbn.Training;
import celemari.tms.hbn.TrainingDAO;
import celemari.tms.vo.StudentDocumentBean;
import celemari.tms.vo.TrainBean;

public class TrainingManagerImpl implements TrainingManager {

	@Override
	public void addReport(TrainBean trainBean, StudentDocumentBean doc) {
		// TODO Auto-generated method stub
		Studentdocument sd = new Studentdocument();
		sd.setAddress(doc.getAddress());
		sd.setName(doc.getName());
		sd.setType(doc.getType());
		sd.setTraining(trainBean);
		StudentdocumentDAO sdd = new StudentdocumentDAO();
		Session sess =HibernateSessionFactory.getSession();
		Transaction tx = sess.beginTransaction();
		try{
			sdd.save(sd);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			sess.close();
		}
	}

	@Override
	public List<Studentdocument> getReports(TrainBean trainBean) {
		// TODO Auto-generated method stub
		List<Studentdocument> list;
		StudentdocumentDAO sdd = new StudentdocumentDAO();
		list = sdd.findByProperty("training", trainBean);
		return list;
	}

	@Override
	public void gradeTrain(TrainBean trainBean, int grade) {
		// TODO Auto-generated method stub
		Training t;
		TrainingDAO td = new TrainingDAO();
		t = td.findById(trainBean.getIdtraining());
		t.setGrade(grade);
		Session sess = HibernateSessionFactory.getSession();
		Transaction tx =sess.beginTransaction();
		try{
			td.merge(t);
			tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			sess.close();
		}

	}

}
