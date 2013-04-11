package celemari.tms.hbn;

/**
 * AbstractStudentdocumentId entity provides the base persistence definition of
 * the StudentdocumentId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStudentdocumentId implements java.io.Serializable {

	// Fields

	private Training training;

	// Constructors

	/** default constructor */
	public AbstractStudentdocumentId() {
	}

	/** full constructor */
	public AbstractStudentdocumentId(Training training) {
		this.training = training;
	}

	// Property accessors

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
		if (!(other instanceof AbstractStudentdocumentId))
			return false;
		AbstractStudentdocumentId castOther = (AbstractStudentdocumentId) other;

		return ((this.getTraining() == castOther.getTraining()) || (this
				.getTraining() != null && castOther.getTraining() != null && this
				.getTraining().equals(castOther.getTraining())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTraining() == null ? 0 : this.getTraining().hashCode());
		return result;
	}

}