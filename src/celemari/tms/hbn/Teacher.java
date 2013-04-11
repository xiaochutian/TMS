package celemari.tms.hbn;

import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */
public class Teacher extends AbstractTeacher implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(Integer idteacher, String name, String email) {
		super(idteacher, name, email);
	}

	/** full constructor */
	public Teacher(Integer idteacher, String name, String email,
			String phoneNumber, Set jobs) {
		super(idteacher, name, email, phoneNumber, jobs);
	}

}
