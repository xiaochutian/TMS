package celemari.tms.hbn;

/**
 * AbstractStudentdocument entity provides the base persistence definition of
 * the Studentdocument entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStudentdocument implements java.io.Serializable {

	// Fields

	private StudentdocumentId id;
	private String name;
	private String address;
	private Short type;

	// Constructors

	/** default constructor */
	public AbstractStudentdocument() {
	}

	/** minimal constructor */
	public AbstractStudentdocument(StudentdocumentId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractStudentdocument(StudentdocumentId id, String name,
			String address, Short type) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.type = type;
	}

	// Property accessors

	public StudentdocumentId getId() {
		return this.id;
	}

	public void setId(StudentdocumentId id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

}