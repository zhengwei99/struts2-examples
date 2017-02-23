package org.itschool.struts2.form;

import org.itschool.struts2.form.model.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ModelDrivenFormAction extends ActionSupport implements ModelDriven<User>{
	
	private User user = new User();
	
	
	

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		
		return user;
	}
	
	
	

}
