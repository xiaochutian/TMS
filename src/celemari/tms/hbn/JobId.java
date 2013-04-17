package celemari.tms.hbn;

/**
 * JobId entity. @author MyEclipse Persistence Tools
 */

public class JobId implements java.io.Serializable {

	// Fields

	private Integer companyIdcompany;
	private Integer teacherIdteacher;

	// Constructors

	/** default constructor */
	public JobId() {
	}

	/** full constructor */
	public JobId(Integer companyIdcompany, Integer teacherIdteacher) {
		this.companyIdcompany = companyIdcompany;
		this.teacherIdteacher = teacherIdteacher;
	}

	// Property accessors

	public Integer getCompanyIdcompany() {
		return this.companyIdcompany;
	}

	public void setCompanyIdcompany(Integer companyIdcompany) {
		this.companyIdcompany = companyIdcompany;
	}

	public Integer getTeacherIdteacher() {
		return this.teacherIdteacher;
	}

	public void setTeacherIdteacher(Integer teacherIdteacher) {
		this.teacherIdteacher = teacherIdteacher;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof JobId))
			return false;
		JobId castOther = (JobId) other;

		return ((this.getCompanyIdcompany() == castOther.getCompanyIdcompany()) || (this
				.getCompanyIdcompany() != null
				&& castOther.getCompanyIdcompany() != null && this
				.getCompanyIdcompany().equals(castOther.getCompanyIdcompany())))
				&& ((this.getTeacherIdteacher() == castOther
						.getTeacherIdteacher()) || (this.getTeacherIdteacher() != null
						&& castOther.getTeacherIdteacher() != null && this
						.getTeacherIdteacher().equals(
								castOther.getTeacherIdteacher())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCompanyIdcompany() == null ? 0 : this
						.getCompanyIdcompany().hashCode());
		result = 37
				* result
				+ (getTeacherIdteacher() == null ? 0 : this
						.getTeacherIdteacher().hashCode());
		return result;
	}

}