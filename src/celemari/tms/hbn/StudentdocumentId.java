package celemari.tms.hbn;

/**
 * StudentdocumentId entity. @author MyEclipse Persistence Tools
 */

public class StudentdocumentId implements java.io.Serializable {

	// Fields

	private Integer idstudentdocument;
	private Training training;

	// Constructors

	/** default constructor */
	public StudentdocumentId() {
	}

	/** full constructor */
	public StudentdocumentId(Integer idstudentdocument, Training training) {
		this.idstudentdocument = idstudentdocument;
		this.training = training;
	}

	// Property accessors

	public Integer getIdstudentdocument() {
		return this.idstudentdocument;
	}

	public void setIdstudentdocument(Integer idstudentdocument) {
		this.idstudentdocument = idstudentdocument;
	}

	public Training getTraining() {
		return this.training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentdocumentId))
			return false;
		StudentdocumentId castOther = (StudentdocumentId) other;

		return ((this.getIdstudentdocument() == castOther
				.getIdstudentdocument()) || (this.getIdstudentdocument() != null
				&& castOther.getIdstudentdocument() != null && this
				.getIdstudentdocument()
				.equals(castOther.getIdstudentdocument())))
				&& ((this.getTraining() == castOther.getTraining()) || (this
						.getTraining() != null
						&& castOther.getTraining() != null && this
						.getTraining().equals(castOther.getTraining())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIdstudentdocument() == null ? 0 : this
						.getIdstudentdocument().hashCode());
		result = 37 * result
				+ (getTraining() == null ? 0 : this.getTraining().hashCode());
		return result;
	}

}