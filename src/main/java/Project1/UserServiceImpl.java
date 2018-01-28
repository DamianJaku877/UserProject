package Project1;

import java.time.LocalDate;
import java.util.ArrayList;;
import java.util.List;

public class UserServiceImpl implements UserService {

    List<User> userList = new ArrayList<User>();

    public boolean registration(User user) {

        if(LocalDate.now().minusYears(18).isAfter(user.getDateOfBirth())){
            return true;
        }
        for (int i=0; i <userList.size(); i++){
            if((user.getLogin().equals(userList.get(i).getLogin())) || user.getEmail().equals(userList.get(i).getEmail())){
                return false;
            }
        }
        return true;
    }

    public boolean login(String login, String password) {
        for(int i =0; i < userList.size(); i++){
            if (login.equals( userList.get(i).getLogin())){
                if(password.equals(userList.get(i).getPassword())){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean changePassword(String login, String oldPassword, String newPassword ) {
        for(int i =0; i < userList.size(); i++){

            if(login.equals( userList.get(i).getLogin()) && (oldPassword.equals(userList.get(i).getPassword()))) {

                if (oldPassword.equals(userList.get(i).getPassword())) {
                    userList.get(i).setPassword(newPassword);
                    return true;
                }
            }
        }
        return false;
    }
}
