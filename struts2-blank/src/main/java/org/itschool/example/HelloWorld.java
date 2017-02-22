
package org.itschool.example;


public class HelloWorld extends ExampleSupport {


	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
        //setMessage(getText(MESSAGE));
		setMessage("Hello, Struts2");
		return SUCCESS;
    }
	
	public String throwError() throws Exception{
		throw new RuntimeException("some errors happens");
	}

    /**
     * Provide default valuie for Message property.
     */
    public static final String MESSAGE = "HelloWorld.message";

    /**
     * Field for Message property.
     */
    private String message;

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    
}
