import java.util.ArrayList;
import java.util.Date;

public class User {
    public String userFirstName;
    private ArrayList<Post> posts;
    //private int totalNumberOfFollowers;

    public User(String userFirstName) {
        this.userFirstName = userFirstName;
        posts = new ArrayList();
    }

    public void addPosts(String post) {
        Post newPost = new Post(userFirstName, post, new Date());
        posts.add(newPost);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }
}
