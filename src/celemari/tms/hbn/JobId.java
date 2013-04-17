package celemari.tms.hbn;

/**
 * JobId entity. @author MyEclipse Persistence Tools
 */

public class JobId implements java.io.Serializable {

	// Fields

	private Integer idjob;
	private Teacher teacher;
	private Company company;

	// Constructors

	/** default constructor */
	public JobId() {
	}

	/** full constructor */
	public JobId(Integer idjob, Teacher teacher, Company company) {
		this.idjob = idjob;
		this.teacher = teacher;
		this.company = company;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof JobId))
			return false;
		JobId castOther = (JobId) other;

		return ((this.getIdjob() == castOther.getIdjob()) || (this.getIdjob() != null
				&& castOther.getIdjob() != null && this.getIdjob().equals(
				castOther.getIdjob())))
				&& ((this.getTeacher() == castOther.getTeacher()) || (this
						.getTeacher() != null && castOther.getTeacher() != null && this
						.getTeacher().equals(castOther.getTeacher())))
				&& ((this.getCompany() == castOther.getCompany()) || (this
						.getCompany() != null && castOther.getCompany() != null && this
						.getCompany().equals(castOther.getCompany())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdjob() == null ? 0 : this.getIdjob().hashCode());
		result = 37 * result
				+ (getTeacher() == null ? 0 : this.getTeacher().hashCode());
		result = 37 * result
				+ (getCompany() == null ? 0 : this.getCompany().hashCode());
		return result;
	}

}