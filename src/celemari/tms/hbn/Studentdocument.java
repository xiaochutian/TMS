package celemari.tms.hbn;

/**
 * Studentdocument entity. @author MyEclipse Persistence Tools
 */

public class Studentdocument implements java.io.Serializable {

	// Fields

	private Integer idstudentdocument;
	private Training training;
	private String name;
	private String address;
	private Short type;

	// Constructors

	/** default constructor */
	public Studentdocument() {
	}

	/** minimal constructor */
	public Studentdocument(Training training) {
		this.training = training;
	}

	/** full constructor */
	public Studentdocument(Training training, String name, String address,
			Short type) {
		this.training = training;
		this.name = name;
		this.address = address;
		this.type = type;
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