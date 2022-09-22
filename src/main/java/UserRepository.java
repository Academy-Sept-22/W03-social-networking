import java.util.ArrayList;
import java.util.HashMap;

public class UserRepository {

    public HashMap<String, User> followers;

    public HashMap<String,User> users;


    public UserRepository() {
        followers = new HashMap<>();
        users = new HashMap<>();
    }
//add
    //User

    public void addUser(String userName){
        User user = new User(userName);
        users.put(userName,user);
    }

    public void setFollowers(String userFirstName, User user){
        followers.put(userFirstName, user);
    }
}
