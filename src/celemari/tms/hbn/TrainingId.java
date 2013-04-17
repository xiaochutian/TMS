package celemari.tms.hbn;

/**
 * TrainingId entity. @author MyEclipse Persistence Tools
 */

public class TrainingId implements java.io.Serializable {

	// Fields

	private Integer studentStudentNumber;
	private Integer jobCompanyIdcompany;
	private Integer jobTeacherIdteacher;

	// Constructors

	/** default constructor */
	public TrainingId() {
	}

	/** full constructor */
	public TrainingId(Integer studentStudentNumber,
			Integer jobCompanyIdcompany, Integer jobTeacherIdteacher) {
		this.studentStudentNumber = studentStudentNumber;
		this.jobCompanyIdcompany = jobCompanyIdcompany;
		this.jobTeacherIdteacher = jobTeacherIdteacher;
	}

	// Property accessors

	public Integer getStudentStudentNumber() {
		return this.studentStudentNumber;
	}

	public void setStudentStudentNumber(Integer studentStudentNumber) {
		this.studentStudentNumber = studentStudentNumber;
	}

	public Integer getJobCompanyIdcompany() {
		return this.jobCompanyIdcompany;
	}

	public void setJobCompanyIdcompany(Integer jobCompanyIdcompany) {
		this.jobCompanyIdcompany = jobCompanyIdcompany;
	}

	public Integer getJobTeacherIdteacher() {
		return this.jobTeacherIdteacher;
	}

	public void setJobTeacherIdteacher(Integer jobTeacherIdteacher) {
		this.jobTeacherIdteacher = jobTeacherIdteacher;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TrainingId))
			return false;
		TrainingId castOther = (TrainingId) other;

		return ((this.getStudentStudentNumber() == castOther
				.getStudentStudentNumber()) || (this.getStudentStudentNumber() != null
				&& castOther.getStudentStudentNumber() != null && this
				.getStudentStudentNumber().equals(
						castOther.getStudentStudentNumber())))
				&& ((this.getJobCompanyIdcompany() == castOther
						.getJobCompanyIdcompany()) || (this
						.getJobCompanyIdcompany() != null
						&& castOther.getJobCompanyIdcompany() != null && this
						.getJobCompanyIdcompany().equals(
								castOther.getJobCompanyIdcompany())))
				&& ((this.getJobTeacherIdteacher() == castOther
						.getJobTeacherIdteacher()) || (this
						.getJobTeacherIdteacher() != null
						&& castOther.getJobTeacherIdteacher() != null && this
						.getJobTeacherIdteacher().equals(
								castOther.getJobTeacherIdteacher())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getStudentStudentNumber() == null ? 0 : this
						.getStudentStudentNumber().hashCode());
		result = 37
				* result
				+ (getJobCompanyIdcompany() == null ? 0 : this
						.getJobCompanyIdcompany().hashCode());
		result = 37
				* result
				+ (getJobTeacherIdteacher() == null ? 0 : this
						.getJobTeacherIdteacher().hashCode());
		return result;
	}

}