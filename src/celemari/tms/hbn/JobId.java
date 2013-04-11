package celemari.tms.hbn;

/**
 * JobId entity. @author MyEclipse Persistence Tools
 */
public class JobId extends AbstractJobId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public JobId() {
	}

	/** full constructor */
	public JobId(Company company, Teacher teacher) {
		super(company, teacher);
	}

}
