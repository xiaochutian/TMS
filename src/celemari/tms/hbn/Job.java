package celemari.tms.hbn;

import java.util.HashSet;
import java.util.Set;

/**
 * Job entity. @author MyEclipse Persistence Tools
 */

public class Job implements java.io.Serializable {

	// Fields

	private JobId id;
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
	public Job(JobId id, String name, String brief, Integer studentMax,
			Integer studentPresent) {
		this.id = id;
		this.name = name;
		this.brief = brief;
		this.studentMax = studentMax;
		this.studentPresent = studentPresent;
	}

	/** full constructor */
	public Job(JobId id, String name, String brief, Integer studentMax,
			Integer studentPresent, Set trainings) {
		this.id = id;
		this.name = name;
		this.brief = brief;
		this.studentMax = studentMax;
		this.studentPresent = studentPresent;
		this.trainings = trainings;
	}

	// Property accessors

	public JobId getId() {
		return this.id;
	}

	public void setId(JobId id) {
		this.id = id;
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