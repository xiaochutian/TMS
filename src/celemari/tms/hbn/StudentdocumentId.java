package celemari.tms.hbn;

/**
 * StudentdocumentId entity. @author MyEclipse Persistence Tools
 */

public class StudentdocumentId implements java.io.Serializable {

	// Fields

	private Integer trainingStudentStudentNumber;
	private Integer trainingJobCompanyIdcompany;
	private Integer trainingJobTeacherIdteacher;

	// Constructors

	/** default constructor */
	public StudentdocumentId() {
	}

	/** full constructor */
	public StudentdocumentId(Integer trainingStudentStudentNumber,
			Integer trainingJobCompanyIdcompany,
			Integer trainingJobTeacherIdteacher) {
		this.trainingStudentStudentNumber = trainingStudentStudentNumber;
		this.trainingJobCompanyIdcompany = trainingJobCompanyIdcompany;
		this.trainingJobTeacherIdteacher = trainingJobTeacherIdteacher;
	}

	// Property accessors

	public Integer getTrainingStudentStudentNumber() {
		return this.trainingStudentStudentNumber;
	}

	public void setTrainingStudentStudentNumber(
			Integer trainingStudentStudentNumber) {
		this.trainingStudentStudentNumber = trainingStudentStudentNumber;
	}

	public Integer getTrainingJobCompanyIdcompany() {
		return this.trainingJobCompanyIdcompany;
	}

	public void setTrainingJobCompanyIdcompany(
			Integer trainingJobCompanyIdcompany) {
		this.trainingJobCompanyIdcompany = trainingJobCompanyIdcompany;
	}

	public Integer getTrainingJobTeacherIdteacher() {
		return this.trainingJobTeacherIdteacher;
	}

	public void setTrainingJobTeacherIdteacher(
			Integer trainingJobTeacherIdteacher) {
		this.trainingJobTeacherIdteacher = trainingJobTeacherIdteacher;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentdocumentId))
			return false;
		StudentdocumentId castOther = (StudentdocumentId) other;

		return ((this.getTrainingStudentStudentNumber() == castOther
				.getTrainingStudentStudentNumber()) || (this
				.getTrainingStudentStudentNumber() != null
				&& castOther.getTrainingStudentStudentNumber() != null && this
				.getTrainingStudentStudentNumber().equals(
						castOther.getTrainingStudentStudentNumber())))
				&& ((this.getTrainingJobCompanyIdcompany() == castOther
						.getTrainingJobCompanyIdcompany()) || (this
						.getTrainingJobCompanyIdcompany() != null
						&& castOther.getTrainingJobCompanyIdcompany() != null && this
						.getTrainingJobCompanyIdcompany().equals(
								castOther.getTrainingJobCompanyIdcompany())))
				&& ((this.getTrainingJobTeacherIdteacher() == castOther
						.getTrainingJobTeacherIdteacher()) || (this
						.getTrainingJobTeacherIdteacher() != null
						&& castOther.getTrainingJobTeacherIdteacher() != null && this
						.getTrainingJobTeacherIdteacher().equals(
								castOther.getTrainingJobTeacherIdteacher())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTrainingStudentStudentNumber() == null ? 0 : this
						.getTrainingStudentStudentNumber().hashCode());
		result = 37
				* result
				+ (getTrainingJobCompanyIdcompany() == null ? 0 : this
						.getTrainingJobCompanyIdcompany().hashCode());
		result = 37
				* result
				+ (getTrainingJobTeacherIdteacher() == null ? 0 : this
						.getTrainingJobTeacherIdteacher().hashCode());
		return result;
	}

}