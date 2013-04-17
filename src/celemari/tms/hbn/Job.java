package celemari.tms.hbn;

import java.util.HashSet;
import java.util.Set;

/**
 * Job entity. @author MyEclipse Persistence Tools
 */

public class Job implements java.io.Serializable {

	// Fields

	private Integer idjob;
	private Teacher teacher;
	private Company company;
	private String name;
	private String brief;
	private Integer studentMax;
	private Integer studentPresent;
	private Set trainings = new HashSet(0);

	// Constructors

	/** default constructor */
	public Job() {
	}

	/** minimal constructor */
	public Job(Teacher teacher, Company company, String name, String brief,
			Integer studentMax, Integer studentPresent) {
		this.teacher = teacher;
		this.company = company;
		this.name = name;
		this.brief = brief;
		this.studentMax = studentMax;
		this.studentPresent = studentPresent;
	}

	/** full constructor */
	public Job(Teacher teacher, Company company, String name, String brief,
			Integer studentMax, Integer studentPresent, Set trainings) {
		this.teacher = teacher;
		this.company = company;
		this.name = name;
		this.brief = brief;
		this.studentMax = studentMax;
		this.studentPresent = studentPresent;
		this.trainings = trainings;
	}

	// Property accessors

	public Integer getIdjob() {
		return this.idjob;
	}

	public void setIdjob(Integer idjob) {
		this.idjob = idjob;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrief() {
		return this.brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public Integer getStudentMax() {
		return this.studentMax;
	}

	public void setStudentMax(Integer studentMax) {
		this.studentMax = studentMax;
	}

	public Integer getStudentPresent() {
		return this.studentPresent;
	}

	public void setStudentPresent(Integer studentPresent) {
		this.studentPresent = studentPresent;
	}

	public Set getTrainings() {
		return this.trainings;
	}

	public void setTrainings(Set trainings) {
		this.trainings = trainings;
	}

}