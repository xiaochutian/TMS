package celemari.tms.hbn;

/**
 * AbstractJobId entity provides the base persistence definition of the JobId
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJobId implements java.io.Serializable {

	// Fields

	private Company company;
	private Teacher teacher;

	// Constructors

	/** default constructor */
	public AbstractJobId() {
	}

	/** full constructor */
	public AbstractJobId(Company company, Teacher teacher) {
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
		if (!(other instanceof AbstractJobId))
			return false;
		AbstractJobId castOther = (AbstractJobId) other;

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