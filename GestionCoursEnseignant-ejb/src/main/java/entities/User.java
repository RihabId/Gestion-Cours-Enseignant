package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String login;
	@Enumerated(EnumType.STRING)
	private UserType usertyp;
	private String password;
	private Integer age;
	private Date birthdate;
	@ManyToMany(mappedBy="etudiants")
	private List<Course> lcoursetudiants;
	@OneToMany(mappedBy="enseignant")
	private List<Course> lcoursenseignant;
	
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	
	
	public User(String name, String login, UserType usertyp, String password, Integer age, Date birthdate) {
		super();
		this.name = name;
		this.login = login;
		this.usertyp = usertyp;
		this.password = password;
		this.age = age;
		this.birthdate = birthdate;
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public UserType getUsertyp() {
		return usertyp;
	}
	public void setUsertyp(UserType usertyp) {
		this.usertyp = usertyp;
	}
	public List<Course> getLcoursetudiants() {
		return lcoursetudiants;
	}
	public void setLcoursetudiants(List<Course> lcoursetudiants) {
		this.lcoursetudiants = lcoursetudiants;
	}
	public List<Course> getLcoursenseignant() {
		return lcoursenseignant;
	}
	public void setLcoursenseignant(List<Course> lcoursenseignant) {
		this.lcoursenseignant = lcoursenseignant;
	}   
	
   
}
