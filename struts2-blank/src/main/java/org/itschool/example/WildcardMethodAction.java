package org.itschool.example;

public class WildcardMethodAction extends ExampleSupport{
	
	private static final long serialVersionUID = 1L;
	
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String insert() throws Exception {
		setMessage("insert page");
		return SUCCESS;
	}

public String update() throws Exception {
	setMessage("update page");
	  return SUCCESS;
}

}
