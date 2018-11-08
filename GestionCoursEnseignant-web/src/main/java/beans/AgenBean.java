package beans;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import entities.Course;
import entities.User;
import entities.UserType;
import services.coursmanagementLocal;

@ManagedBean
public class AgenBean {
	
	private String login;
	private String name;
	private String password;
	private int age;
	private Date date= new Date();
	private User user;
	private String nomcours;
	
	@EJB
	coursmanagementLocal cm;
	
	public void ajoutenseignantetcours() {
		
		
		cm.ajouterCoursEtEnseignant(new Course(nomcours), new User(name, login, UserType.teacher, password, age, new Date()));
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getNomcours() {
		return nomcours;
	}

	public void setNomcours(String nomcours) {
		this.nomcours = nomcours;
	}

	public coursmanagementLocal getCm() {
		return cm;
	}

	public void setCm(coursmanagementLocal cm) {
		this.cm = cm;
	}
	
	
	
}
	
	
	
	
	