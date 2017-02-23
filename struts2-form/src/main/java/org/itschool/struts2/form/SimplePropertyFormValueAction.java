package org.itschool.struts2.form;

import com.opensymphony.xwork2.ActionSupport;

public class SimplePropertyFormValueAction extends ActionSupport {
	
	private String account;
	
	private String password;
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
