package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Course;
import entities.User;

@Remote
public interface coursmanagementRemote {
	
	public void ajouterUser(User user);
	public void  ajouterCoursEtEnseignant(Course course, User  teacher);
	public List<Course>  listerCours(int id);


}
