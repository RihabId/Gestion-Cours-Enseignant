package services;

import java.util.List;

import javax.ejb.Local;

import entities.Course;
import entities.User;

@Local
public interface coursmanagementLocal {
	public void ajouterUser(User user);
	public void  ajouterCoursEtEnseignant(Course course, User  teacher);
	public List<Course>  listerCours(int id);
	public User userlogin(String login, String passwoord);

}
