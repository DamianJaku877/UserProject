package Project1;

public interface UserService {

     public boolean registration(User user);
     public boolean login(String login, String password);
     public boolean changePassword(String login, String oldPassword , String newPassword );
}
