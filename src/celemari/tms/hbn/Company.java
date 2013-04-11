package celemari.tms.hbn;

import java.util.Set;

/**
 * Company entity. @author MyEclipse Persistence Tools
 */
public class Company extends AbstractCompany implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** minimal constructor */
	public Company(Integer idcompany, String name, String brief, String address) {
		super(idcompany, name, brief, address);
	}

	/** full constructor */
	public Company(Integer idcompany, String name, String brief,
			String address, String applicationTemplateAddress,
			String internshipCertificateAddress, String linkman,
			String mansPhoneNumber, String mansEmailAddress, Set jobs) {
		super(idcompany, name, brief, address, applicationTemplateAddress,
				internshipCertificateAddress, linkman, mansPhoneNumber,
				mansEmailAddress, jobs);
	}

}
