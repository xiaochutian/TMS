package celemari.tms.hbn;

import java.util.HashSet;
import java.util.Set;

/**
 * Training entity. @author MyEclipse Persistence Tools
 */

public class Training implements java.io.Serializable {

	// Fields

	private Integer idtraining;
	private Student student;
	private Job job;
	private Integer grade;
	private String applicationAddress;
	private Short state;
	private Set studentdocuments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Training() {
	}

	/** minimal constructor */
	public Training(Student student, Job job, String applicationAddress,
			Short state) {
		this.student = student;
		this.job = job;
		this.applicationAddress = applicationAddress;
		this.state = state;
	}

	/** full constructor */
	public Training(Student student, Job job, Integer grade,
			String applicationAddress, Short state, Set studentdocuments) {
		this.student = student;
		this.job = job;
		this.grade = grade;
		this.applicationAddress = applicationAddress;
		this.state = state;
		this.studentdocuments = studentdocuments;
	}

	// Property accessors

	public Integer getIdtraining() {
		return this.idtraining;
	}

	public void setIdtraining(Integer idtraining) {
		this.idtraining = idtraining;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getApplicationAddress() {
		return this.applicationAddress;
	}

	public void setApplicationAddress(String applicationAddress) {
		this.applicationAddress = applicationAddress;
	}

	public Short getState() {
		return this.state;
	}

	public void setState(Short state) {
		this.state = state;
	}

	public Set getStudentdocuments() {
		return this.studentdocuments;
	}

	public void setStudentdocuments(Set studentdocuments) {
		this.studentdocuments = studentdocuments;
	}

}