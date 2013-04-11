package celemari.tms.hbn;

/**
 * Training entity. @author MyEclipse Persistence Tools
 */
public class Training extends AbstractTraining implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Training() {
	}

	/** minimal constructor */
	public Training(TrainingId id, String applicationAddress, Short state) {
		super(id, applicationAddress, state);
	}

	/** full constructor */
	public Training(TrainingId id, Integer grade, String applicationAddress,
			Short state, Studentdocument studentdocument) {
		super(id, grade, applicationAddress, state, studentdocument);
	}

}
