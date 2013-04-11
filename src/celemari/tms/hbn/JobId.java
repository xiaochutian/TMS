package celemari.tms.hbn;

/**
 * JobId entity. @author MyEclipse Persistence Tools
 */

public class JobId implements java.io.Serializable {

	// Fields

	private Company company;
	private Teacher teacher;

	// Constructors

	/** default constructor */
	public JobId() {
	}

	/** full constructor */
	public JobId(Company company, Teacher teacher) {
		this.company = company;
		this.teacher = teacher;
	}

	// Property accessors

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof JobId))
			return false;
		JobId castOther = (JobId) other;

		return ((this.getCompany() == castOther.getCompany()) || (this
				.getCompany() != null && castOther.getCompany() != null && this
				.getCompany().equals(castOther.getCompany())))
				&& ((this.getTeacher() == castOther.getTeacher()) || (this
						.getTeacher() != null && castOther.getTeacher() != null && this
						.getTeacher().equals(castOther.getTeacher())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCompany() == null ? 0 : this.getCompany().hashCode());
		result = 37 * result
				+ (getTeacher() == null ? 0 : this.getTeacher().hashCode());
		return result;
	}

}