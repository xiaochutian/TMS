package celemari.tms.hbn;

import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
public class Student extends AbstractStudent implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer studentNumber, String name, String email, Short type) {
		super(studentNumber, name, email, type);
	}

	/** full constructor */
	public Student(Integer studentNumber, String name, String email,
			String phoneNumber, Short type, Set trainings) {
		super(studentNumber, name, email, phoneNumber, type, trainings);
	}

}
