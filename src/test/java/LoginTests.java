import models.User;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositive(){

    app.getUser().openLoginForm();
        app.getUser().fillLoginForm("asd@fgh.com","$Asdf1234");
        app.getUser().submitLogin();

    }
    @Test
    public void loginPositiveUser(){
//    User user = new User("asd@fgh.com","$Asdf1234");
        User user = new User();
//        user.setEmail("asd@fgh.com");
//        user.setPassword("$Asdf1234");
        user.setEmail("");
    app.getUser().openLoginForm();
        app.getUser().fillLoginForm(user.getEmail(), user.getPassword());
        app.getUser().submitLogin();

    }

}
