package org.itschool.example;

public class DynamicMethodInvocationAction extends ExampleSupport{
	
	private static final long serialVersionUID = 1L;

	
	public String method1() throws Exception {
		setMessage("method1");
		return SUCCESS;
	}
	
	public String method2() throws Exception {
		setMessage("method2");
		return SUCCESS;
	}
	
	public String method3() throws Exception {
		setMessage("method3");
			return SUCCESS;
	}
	
	

}
