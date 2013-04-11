package celemari.tms.hbn;

import java.util.Set;

/**
 * Job entity. @author MyEclipse Persistence Tools
 */
public class Job extends AbstractJob implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Job() {
	}

	/** minimal constructor */
	public Job(JobId id, String name, String brief, Integer studentMax,
			Integer studentPresent) {
		super(id, name, brief, studentMax, studentPresent);
	}

	/** full constructor */
	public Job(JobId id, String name, String brief, Integer studentMax,
			Integer studentPresent, Set trainings) {
		super(id, name, brief, studentMax, studentPresent, trainings);
	}

}
