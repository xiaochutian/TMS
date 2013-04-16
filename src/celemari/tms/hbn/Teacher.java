package celemari.tms.hbn;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher extends celemari.tms.hbn.User implements java.io.Serializable {

	// Fields

	private Integer idteacher;
	private String email;
	private String phoneNumber;
	private Set jobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(Integer idteacher, String email) {
		this.idteacher = idteacher;
		this.email = email;
	}
	
	
	/** my constructor*/
	public Teacher(Integer idteacher, 
			String email, String phoneNumber) {
		super();
		this.idteacher = idteacher;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	/** full constructor */
	public Teacher(Integer idteacher, 
			String email, String phoneNumber, Set jobs) {
		this.idteacher = idteacher;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.jobs = jobs;
	}

	// Property accessors

	public Integer getIdteacher() {
		return this.idteacher;
	}

	public void setIdteacher(Integer idteacher) {
		this.idteacher = idteacher;
	}



	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set getJobs() {
		return this.jobs;
	}

	public void setJobs(Set jobs) {
		this.jobs = jobs;
	}

}