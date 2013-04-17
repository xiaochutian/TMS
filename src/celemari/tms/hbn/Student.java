package celemari.tms.hbn;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer idstudent;
	private String studentNumber;
	private String name;
	private String password;
	private String email;
	private String phoneNumber;
	private Short type;
	private Set trainings = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String studentNumber, String name, String password,
			String email, Short type) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.password = password;
		this.email = email;
		this.type = type;
	}

	public Student(String studentNumber, String name, String password,
			String email, String phoneNumber, Short type) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.type = type;
	}

	/** full constructor */
	public Student(String studentNumber, String name, String password,
			String email, String phoneNumber, Short type, Set trainings) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.type = type;
		this.trainings = trainings;
	}

	// Property accessors

	public Integer getIdstudent() {
		return this.idstudent;
	}

	public void setIdstudent(Integer idstudent) {
		this.idstudent = idstudent;
	}

	public String getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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