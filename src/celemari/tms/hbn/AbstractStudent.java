package celemari.tms.hbn;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractStudent entity provides the base persistence definition of the
 * Student entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStudent implements java.io.Serializable {

	// Fields

	private Integer studentNumber;
	private String name;
	private String email;
	private String phoneNumber;
	private Short type;
	private Set trainings = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractStudent() {
	}

	/** minimal constructor */
	public AbstractStudent(Integer studentNumber, String name, String email,
			Short type) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.email = email;
		this.type = type;
	}

	/** full constructor */
	public AbstractStudent(Integer studentNumber, String name, String email,
			String phoneNumber, Short type, Set trainings) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.type = type;
		this.trainings = trainings;
	}

	// Property accessors

	public Integer getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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