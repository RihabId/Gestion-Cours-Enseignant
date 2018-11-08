package beans;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import entities.Course;
import entities.User;
import services.coursmanagementLocal;

@ManagedBean
@ViewScoped
public class TeacherBean implements Serializable {
	
	private ArrayList<Course> lc= new ArrayList<>();
	
	@EJB
	private coursmanagementLocal cm;
	
	@ManagedProperty(value="#{loginbean}")
	private Loginbean lb;
	
	private User user;
	
	
	@PostConstruct
	public void init(){
		System.out.println("LE BEAN TEACHER"+lb.getE().getName());
		lc= (ArrayList<Course>) cm.listerCours(lb.getE().getId());
		
	}


	public ArrayList<Course> getLc() {
		return lc;
	}


	public void setLc(ArrayList<Course> lc) {
		this.lc = lc;
	}


	public Loginbean getLb() {
		return lb;
	}


	public void setLb(Loginbean lb) {
		this.lb = lb;
	}


	public coursmanagementLocal getCm() {
		return cm;
	}


	public void setCm(coursmanagementLocal cm) {
		this.cm = cm;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
