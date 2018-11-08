package beans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

import entities.User;
import entities.UserType;
import services.coursmanagementLocal;

@ManagedBean
@SessionScoped
public class Loginbean implements Serializable{
	
	private String login;
	private String password;
	private User e = new User();
	
	@EJB
	coursmanagementLocal cm;
	
	
	public String authentification()
	{
		String navigTo="null";
		
		  e= cm.userlogin(login, password);
		if((e !=null) && (e.getUsertyp()==UserType.agent))
		{
			navigTo="/pages/Agent?faces-redirect=true";
			System.out.println("AGENT"+e.getLogin()+e.getUsertyp());
		}
		else if ((e !=null) && (e.getUsertyp()==UserType.teacher)) 
		{
			navigTo="/pages/Teacher?faces-redirect=true";
			System.out.println("TEACHER"+e.getLogin()+e.getUsertyp());
		}
		else{
//			FacesContext.getCurrentInstance().addMessage("form1:btn", new FacesMessage("bad credentials"));
//			System.out.println("bad credentials");
			navigTo="/pages/Error?faces-redirect=true";
		}
		System.out.println("THE USER IS "+ e.getId() );	
		return navigTo;

	}
	public String doLogout(){
		return "/Login?faces-redirect=true";
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public User getE() {
		return e;
	}


	public void setE(User e) {
		this.e = e;
	}


	public coursmanagementLocal getCm() {
		return cm;
	}


	public void setCm(coursmanagementLocal cm) {
		this.cm = cm;
	}


	

}
