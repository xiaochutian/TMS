package celemari.tms.hbn;

/**
 * AbstractTraining entity provides the base persistence definition of the
 * Training entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTraining implements java.io.Serializable {

	// Fields

	private TrainingId id;
	private Integer grade;
	private String applicationAddress;
	private Short state;
	private Studentdocument studentdocument;

	// Constructors

	/** default constructor */
	public AbstractTraining() {
	}

	/** minimal constructor */
	public AbstractTraining(TrainingId id, String applicationAddress,
			Short state) {
		this.id = id;
		this.applicationAddress = applicationAddress;
		this.state = state;
	}

	/** full constructor */
	public AbstractTraining(TrainingId id, Integer grade,
			String applicationAddress, Short state,
			Studentdocument studentdocument) {
		this.id = id;
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