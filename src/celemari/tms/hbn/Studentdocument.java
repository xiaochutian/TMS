package celemari.tms.hbn;

/**
 * Studentdocument entity. @author MyEclipse Persistence Tools
 */
public class Studentdocument extends AbstractStudentdocument implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Studentdocument() {
	}

	/** minimal constructor */
	public Studentdocument(StudentdocumentId id) {
		super(id);
	}

	/** full constructor */
	public Studentdocument(StudentdocumentId id, String name, String address,
			Short type) {
		super(id, name, address, type);
	}

}
