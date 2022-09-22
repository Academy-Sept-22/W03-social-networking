import java.util.ArrayList;
import java.util.HashMap;

public class User {

    public ArrayList<User> followers;
    public String userFirstName;

    public User(String userFirstName) {
        this.followers = new ArrayList<>();
        this.userFirstName = userFirstName;
//        this.postHistory;
//        this.wall;
    }


}
