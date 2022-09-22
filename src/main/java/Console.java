import java.util.ArrayList;

public class Console {

    public void print(ArrayList<Post> posts) {

        for (Post post:
             posts) {
            System.out.println(post.message);
        }
    }

}
