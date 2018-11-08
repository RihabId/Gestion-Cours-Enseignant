package services;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Course;
import entities.User;

/**
 * Session Bean implementation class coursmanagement
 */
@Stateless
@LocalBean
public class coursmanagement implements coursmanagementRemote, coursmanagementLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager em;
    public coursmanagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void ajouterUser(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
		
	}

	@Override
	public void ajouterCoursEtEnseignant(Course course, User teacher) {
		course.setEnseignant(teacher);
		em.persist(course);
		
	}

	@Override
	public List<Course> listerCours(int id) {
		TypedQuery<Course> q=em.createQuery("select e from Course e where e.enseignant.id=:id", Course.class);
		q.setParameter("id", id);
		return q.getResultList();
	}

	@Override
	public User userlogin(String login, String passwoord) {
		TypedQuery<User> qr= em.createQuery("select e from User e where e.login=:param1 and e.password=:param2", User.class);
		qr.setParameter("param1", login );
		qr.setParameter("param2", passwoord);
		User u = null;
		try {
			
			 u= qr.getSingleResult();
			
		} catch (NoResultException e ) {
			Logger.getAnonymousLogger();
		}
		
			return u;
	}

}
