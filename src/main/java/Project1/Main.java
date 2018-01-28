package Project1;

import java.util.logging.Logger;

public class Main {

    protected static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[]args){

        UserService userService = new UserServiceImpl();

        User user1 = new User();
        user1.setLogin("Damian");
        user1.setPassword("Damian");
        userService.registration(user1);

        boolean islogin1 = userService.login("Damian", "Damian");
        log.info("Zalogowany: " + islogin1);

        boolean changePassword = userService.changePassword("Damian","Damian", "Jaku56dytcbowski");
        log.info("PasswordChange : Sucess " + changePassword);


    }
}
