import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PostHistory {

    private ArrayList<Post> postHistory = new ArrayList<>();

    public void addPost(Post post) {
        postHistory.add(post);
    }

    public List<Post> read() {
        return postHistory;
    }

    public int getSize(){
        return postHistory.size();
    }
}
