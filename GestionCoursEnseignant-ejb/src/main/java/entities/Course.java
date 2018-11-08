package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Course
 *
 */
@Entity

public class Course implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany
	private List<User> etudiants;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private User enseignant;
	
	private static final long serialVersionUID = 1L;

	public Course() {
		super();
	}  
	
	
	public Course(String name) {
		super();
		this.name = name;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<User> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<User> etudiants) {
		this.etudiants = etudiants;
	}
	public User getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(User enseignant) {
		this.enseignant = enseignant;
	}
   
}
