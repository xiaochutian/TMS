package celemari.tms.impl;

import celemari.tms.UserManager;
import celemari.tms.hbn.Student;
import celemari.tms.hbn.StudentDAO;
import celemari.tms.hbn.Teacher;
import celemari.tms.hbn.TeacherDAO;
import celemari.tms.vo.UserBean;

public class UserManagerImpl implements UserManager {

	@Override
	public UserBean register(int id, String name, String password, int role,
			String email, String phone) {
		// TODO Auto-generated method stub
		Teacher teacher;
		Student student;
		TeacherDAO tDAO = new TeacherDAO();
		StudentDAO sDAO = new StudentDAO();
		//导师
		if(role==2){
			teacher = new Teacher(id,name,password,email,phone);
			tDAO.save(teacher);
		}else{
			student = new Student(id,name,password,email,phone,(short) role);
			sDAO.save(student);
		}
		UserBean user = new UserBean(id,name,password,role,email,phone);
		return user;
	}

	@Override
	public UserBean login(int id, String password, int role) {
		// TODO Auto-generated method stub
		Teacher teacher;
		Student student;
		UserBean user;
		TeacherDAO tDAO= new TeacherDAO();
		StudentDAO sDAO = new StudentDAO();
		if(role==2){
			teacher=tDAO.findById(id);
			if(teacher!=null&&teacher.getPassword().equals(password)){
				user = new UserBean(id,teacher.getName(),teacher.getPassword()
						,role,teacher.getEmail(),teacher.getPhoneNumber());
				return user;
			}else
				return null;
		}else{
			student=sDAO.findById(id);
			if(student!=null&&student.getPassword().equals(password)){
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
		if(userBean.getRole()==2){
			teacher = tDAO.findById(userBean.getId());
			teacher.setEmail(userBean.getEmail());
			teacher.setName(userBean.getUsername());
			teacher.setPassword(userBean.getPassword());
			teacher.setPhoneNumber(userBean.getPhone());
			tDAO.save(teacher);
		}else{
			student = sDAO.findById(userBean.getId());
			student.setEmail(userBean.getEmail());
			student.setName(userBean.getUsername());
			student.setPassword(userBean.getPassword());
			student.setPhoneNumber(userBean.getPhone());
			student.setType((short) userBean.getRole());
		}

	}

}
