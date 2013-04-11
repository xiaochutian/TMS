package celemari.tms.hbn;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Job
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see celemari.tms.hbn.Job
 * @author MyEclipse Persistence Tools
 */

public class JobDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(JobDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String BRIEF = "brief";
	public static final String STUDENT_MAX = "studentMax";
	public static final String STUDENT_PRESENT = "studentPresent";

	public void save(Job transientInstance) {
		log.debug("saving Job instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Job persistentInstance) {
		log.debug("deleting Job instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Job findById(celemari.tms.hbn.JobId id) {
		log.debug("getting Job instance with id: " + id);
		try {
			Job instance = (Job) getSession().get("celemari.tms.hbn.Job", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Job instance) {
		log.debug("finding Job instance by example");
		try {
			List results = getSession().createCriteria("celemari.tms.hbn.Job")
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
		log.debug("finding Job instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Job as model where model."
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

	public List findByBrief(Object brief) {
		return findByProperty(BRIEF, brief);
	}

	public List findByStudentMax(Object studentMax) {
		return findByProperty(STUDENT_MAX, studentMax);
	}

	public List findByStudentPresent(Object studentPresent) {
		return findByProperty(STUDENT_PRESENT, studentPresent);
	}

	public List findAll() {
		log.debug("finding all Job instances");
		try {
			String queryString = "from Job";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Job merge(Job detachedInstance) {
		log.debug("merging Job instance");
		try {
			Job result = (Job) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Job instance) {
		log.debug("attaching dirty Job instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Job instance) {
		log.debug("attaching clean Job instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}