package celemari.tms.hbn;

/**
 * TrainingId entity. @author MyEclipse Persistence Tools
 */
public class TrainingId extends AbstractTrainingId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrainingId() {
	}

	/** full constructor */
	public TrainingId(Student student, Job job) {
		super(student, job);
	}

}
