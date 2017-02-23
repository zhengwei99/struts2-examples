package org.itschool.struts2.form;

import org.itschool.struts2.form.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class FormBeanAction extends ActionSupport {
	


	private User user;
	
	
	

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
	
	
	

}
