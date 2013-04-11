package celemari.tms.hbn;

import java.util.HashSet;
import java.util.Set;

/**
 * Company entity. @author MyEclipse Persistence Tools
 */

public class Company implements java.io.Serializable {

	// Fields

	private Integer idcompany;
	private String name;
	private String brief;
	private String address;
	private String applicationTemplateAddress;
	private String internshipCertificateAddress;
	private String linkman;
	private String mansPhoneNumber;
	private String mansEmailAddress;
	private Set jobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** minimal constructor */
	public Company(Integer idcompany, String name, String brief, String address) {
		this.idcompany = idcompany;
		this.name = name;
		this.brief = brief;
		this.address = address;
	}

	/** full constructor */
	public Company(Integer idcompany, String name, String brief,
			String address, String applicationTemplateAddress,
			String internshipCertificateAddress, String linkman,
			String mansPhoneNumber, String mansEmailAddress, Set jobs) {
		this.idcompany = idcompany;
		this.name = name;
		this.brief = brief;
		this.address = address;
		this.applicationTemplateAddress = applicationTemplateAddress;
		this.internshipCertificateAddress = internshipCertificateAddress;
		this.linkman = linkman;
		this.mansPhoneNumber = mansPhoneNumber;
		this.mansEmailAddress = mansEmailAddress;
		this.jobs = jobs;
	}

	// Property accessors

	public Integer getIdcompany() {
		return this.idcompany;
	}

	public void setIdcompany(Integer idcompany) {
		this.idcompany = idcompany;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrief() {
		return this.brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getApplicationTemplateAddress() {
		return this.applicationTemplateAddress;
	}

	public void setApplicationTemplateAddress(String applicationTemplateAddress) {
		this.applicationTemplateAddress = applicationTemplateAddress;
	}

	public String getInternshipCertificateAddress() {
		return this.internshipCertificateAddress;
	}

	public void setInternshipCertificateAddress(
			String internshipCertificateAddress) {
		this.internshipCertificateAddress = internshipCertificateAddress;
	}

	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getMansPhoneNumber() {
		return this.mansPhoneNumber;
	}

	public void setMansPhoneNumber(String mansPhoneNumber) {
		this.mansPhoneNumber = mansPhoneNumber;
	}

	public String getMansEmailAddress() {
		return this.mansEmailAddress;
	}

	public void setMansEmailAddress(String mansEmailAddress) {
		this.mansEmailAddress = mansEmailAddress;
	}

	public Set getJobs() {
		return this.jobs;
	}

	public void setJobs(Set jobs) {
		this.jobs = jobs;
	}

}