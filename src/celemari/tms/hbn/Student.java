package celemari.tms.hbn;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student extends celemari.tms.hbn.User implements java.io.Serializable {

	// Fields

	private Integer studentNumber;
	private String email;
	private String phoneNumber;
	private Short type;
	private Set trainings = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer studentNumber,String name, String password,
			String email, Short type) {
		this.studentNumber = studentNumber;
		this.email = email;
		this.type = type;
		this.setName(name);
		this.setPassword(password);
	}
	
	
	/** my constructor*/
	public Student(Integer studentNumber,String name, String password,
			String email, String phoneNumber, Short type) {
		super();
		this.studentNumber = studentNumber;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.type = type;
		this.setName(name);
		this.setPassword(password);
	}

	/** full constructor */
	public Student(Integer studentNumber,String name, String password,
			String email, String phoneNumber, Short type, Set trainings) {
		this.studentNumber = studentNumber;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.type = type;
		this.trainings = trainings;
		this.setName(name);
		this.setPassword(password);
	}

	// Property accessors

	public Integer getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Set getTrainings() {
		return this.trainings;
	}

	public void setTrainings(Set trainings) {
		this.trainings = trainings;
	}

}