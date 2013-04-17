package celemari.tms.hbn;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Studentdocument entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see celemari.tms.hbn.Studentdocument
 * @author MyEclipse Persistence Tools
 */

public class StudentdocumentDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(StudentdocumentDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String ADDRESS = "address";
	public static final String TYPE = "type";

	public void save(Studentdocument transientInstance) {
		log.debug("saving Studentdocument instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Studentdocument persistentInstance) {
		log.debug("deleting Studentdocument instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Studentdocument findById(java.lang.Integer id) {
		log.debug("getting Studentdocument instance with id: " + id);
		try {
			Studentdocument instance = (Studentdocument) getSession().get(
					"celemari.tms.hbn.Studentdocument", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Studentdocument instance) {
		log.debug("finding Studentdocument instance by example");
		try {
			List results = getSession()
					.createCriteria("celemari.tms.hbn.Studentdocument")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Studentdocument instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Studentdocument as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findAll() {
		log.debug("finding all Studentdocument instances");
		try {
			String queryString = "from Studentdocument";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Studentdocument merge(Studentdocument detachedInstance) {
		log.debug("merging Studentdocument instance");
		try {
			Studentdocument result = (Studentdocument) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Studentdocument instance) {
		log.debug("attaching dirty Studentdocument instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Studentdocument instance) {
		log.debug("attaching clean Studentdocument instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}