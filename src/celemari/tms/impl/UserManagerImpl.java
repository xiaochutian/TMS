package celemari.tms.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import celemari.tms.UserManager;
import celemari.tms.hbn.HibernateSessionFactory;
import celemari.tms.hbn.Student;
import celemari.tms.hbn.StudentDAO;
import celemari.tms.hbn.Teacher;
import celemari.tms.hbn.TeacherDAO;
import celemari.tms.vo.UserBean;

public class UserManagerImpl implements UserManager {

	@Override
	public UserBean register(String idNumber, String name, String password, int role,
			String email, String phone) {
		// TODO Auto-generated method stub
		Teacher teacher;
		Student student;
		TeacherDAO tDAO = new TeacherDAO();
		StudentDAO sDAO = new StudentDAO();
		//导师
		Session sess = HibernateSessionFactory.getSession();
		Transaction tx =sess.beginTransaction();
		if(role==2){
			teacher = new Teacher(idNumber,name,password,email,phone);
			try{
				tDAO.save(teacher);
				tx.commit();
			}catch(Exception e){
				tx.rollback();
				e.printStackTrace();
			}finally{
				sess.close();
			}
		}else{
			student = new Student(idNumber,name,password,email,phone,(short) role);
			try{
				sDAO.save(student);
				tx.commit();
			}catch(Exception e){
				tx.rollback();
				e.printStackTrace();
			}finally{
				sess.close();
			}
		}
		UserBean user = new UserBean(idNumber,name,password,role,email,phone);
		return user;
	}

	@Override
	public UserBean login(String id, String password, int role) {
		// TODO Auto-generated method stub
		Teacher teacher;
		Student student;
		UserBean user;
		TeacherDAO tDAO= new TeacherDAO();
		StudentDAO sDAO = new StudentDAO();
		if(role==2){
			List<Teacher> teacherList=tDAO.findByTeacherNumber(id);
			if(teacherList.size()!=0&&teacherList.get(0).getPassword().equals(password)){
				teacher=teacherList.get(0);
				user = new UserBean(id,teacher.getName(),teacher.getPassword()
						,role,teacher.getEmail(),teacher.getPhoneNumber());
				return user;
			}else
				return null;
		}else{
			List<Student> studentList=sDAO.findByStudentNumber(id);
			if(studentList.size()!=0&&studentList.get(0).getPassword().equals(password)){
				student = studentList.get(0);
				user = new UserBean(id,student.getName(),student.getPassword()
						,role,student.getEmail(),student.getPhoneNumber());
				return user;
			}else
				return null;
		}
	}

	@Override
	public void update(UserBean userBean) {
		// TODO Auto-generated method stub
		Teacher teacher;
		Student student;
		TeacherDAO tDAO= new TeacherDAO();
		StudentDAO sDAO = new StudentDAO();
		Session sess = HibernateSessionFactory.getSession();
		Transaction tx = sess.beginTransaction();
		if(userBean.getRole()==2){
			List<Teacher> teacherList = tDAO.findByTeacherNumber(userBean.getIdNumber());
			teacher = teacherList.get(0);
			teacher.setEmail(userBean.getEmail());
			teacher.setName(userBean.getUsername());
			teacher.setPassword(userBean.getPassword());
			teacher.setPhoneNumber(userBean.getPhone());
			teacher.setTeacherNumber(userBean.getIdNumber());
			try{
				tDAO.save(teacher);
				tx.commit();
			}catch(Exception e){
				tx.rollback();
				e.printStackTrace();
			}finally{
				sess.close();
			}
		}else{
			List<Student> studentList = sDAO.findByStudentNumber(userBean.getIdNumber());
			student = studentList.get(0);
			student.setEmail(userBean.getEmail());
			student.setName(userBean.getUsername());
			student.setPassword(userBean.getPassword());
			student.setPhoneNumber(userBean.getPhone());
			student.setType((short) userBean.getRole());
			student.setStudentNumber(userBean.getIdNumber());
			try{
				sDAO.save(student);
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
