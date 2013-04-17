package celemari.tms.hbn;

/**
 * Training entity. @author MyEclipse Persistence Tools
 */

public class Training implements java.io.Serializable {

	// Fields

	private TrainingId id;
	private Student student;
	private Job job;
	private Integer grade;
	private String applicationAddress;
	private Short state;
	private Studentdocument studentdocument;

	// Constructors

	/** default constructor */
	public Training() {
	}

	/** minimal constructor */
	public Training(TrainingId id, Student student, Job job,
			String applicationAddress, Short state) {
		this.id = id;
		this.student = student;
		this.job = job;
		this.applicationAddress = applicationAddress;
		this.state = state;
	}

	/** full constructor */
	public Training(TrainingId id, Student student, Job job, Integer grade,
			String applicationAddress, Short state,
			Studentdocument studentdocument) {
		this.id = id;
		this.student = student;
		this.job = job;
		this.grade = grade;
		this.applicationAddress = applicationAddress;
		this.state = state;
		this.studentdocument = studentdocument;
	}

	// Property accessors

	public TrainingId getId() {
		return this.id;
	}

	public void setId(TrainingId id) {
		this.id = id;
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

	public Studentdocument getStudentdocument() {
		return this.studentdocument;
	}

	public void setStudentdocument(Studentdocument studentdocument) {
		this.studentdocument = studentdocument;
	}

}