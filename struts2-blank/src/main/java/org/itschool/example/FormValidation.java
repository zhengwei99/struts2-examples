package org.itschool.example;/**
 * Created by user on 2017/2/7.
 */

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * for form validation
 *
 * @author
 * @create 2017-02-07 10:45
 **/
public class FormValidation extends ActionSupport implements ModelDriven<User>{

    private User user = new User();

    public String execute()  throws Exception{
//      if(true){
//          throw new RuntimeException("it is a runtime exception...");
//      }
        System.out.println("getData is invoked.");
        return "ok";
    }

    public String add()  throws Exception{
        return "add";
    }

    public String list()  throws Exception{
        return "list";
    }


    public String save() throws Exception{

        System.out.println(user);
        return "save";

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
