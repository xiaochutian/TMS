package celemari.tms.hbn;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private Integer idteacher;
	private String name;
	private String password;
	private String email;
	private String phoneNumber;
	private Set jobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(Integer idteacher, String name, String password, String email) {
		this.idteacher = idteacher;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	
	/** my constructor*/
	public Teacher(Integer idteacher, String name, String password,
			String email, String phoneNumber) {
		super();
		this.idteacher = idteacher;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	/** full constructor */
	public Teacher(Integer idteacher, String name, String password,
			String email, String phoneNumber, Set jobs) {
		this.idteacher = idteacher;
		this.name = name;
		this.password = password;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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