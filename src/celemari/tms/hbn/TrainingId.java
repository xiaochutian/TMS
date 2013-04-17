package celemari.tms.hbn;

/**
 * TrainingId entity. @author MyEclipse Persistence Tools
 */

public class TrainingId implements java.io.Serializable {

	// Fields

	private Job job;
	private Student student;

	// Constructors

	/** default constructor */
	public TrainingId() {
	}

	/** full constructor */
	public TrainingId(Job job, Student student) {
		this.job = job;
		this.student = student;
	}

	// Property accessors

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TrainingId))
			return false;
		TrainingId castOther = (TrainingId) other;

		return ((this.getJob() == castOther.getJob()) || (this.getJob() != null
				&& castOther.getJob() != null && this.getJob().equals(
				castOther.getJob())))
				&& ((this.getStudent() == castOther.getStudent()) || (this
						.getStudent() != null && castOther.getStudent() != null && this
						.getStudent().equals(castOther.getStudent())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getJob() == null ? 0 : this.getJob().hashCode());
		result = 37 * result
				+ (getStudent() == null ? 0 : this.getStudent().hashCode());
		return result;
	}

}