package celemari.tms.hbn;

/**
 * TrainingId entity. @author MyEclipse Persistence Tools
 */

public class TrainingId implements java.io.Serializable {

	// Fields

	private Student student;
	private Job job;

	// Constructors

	/** default constructor */
	public TrainingId() {
	}

	/** full constructor */
	public TrainingId(Student student, Job job) {
		this.student = student;
		this.job = job;
	}

	// Property accessors

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TrainingId))
			return false;
		TrainingId castOther = (TrainingId) other;

		return ((this.getStudent() == castOther.getStudent()) || (this
				.getStudent() != null && castOther.getStudent() != null && this
				.getStudent().equals(castOther.getStudent())))
				&& ((this.getJob() == castOther.getJob()) || (this.getJob() != null
						&& castOther.getJob() != null && this.getJob().equals(
						castOther.getJob())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getStudent() == null ? 0 : this.getStudent().hashCode());
		result = 37 * result
				+ (getJob() == null ? 0 : this.getJob().hashCode());
		return result;
	}

}