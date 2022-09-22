import java.nio.charset.CoderMalfunctionError;

public class Command {

    Console console = new Console();
    PostHistory postHistory;

    UserRepository userRepository;

    public Command(PostHistory postHistory, UserRepository userRepository) {
        this.postHistory = postHistory;
        this.userRepository = userRepository;
    }

    public void read(String userFirstName) {
        User user = userRepository.users.get(userFirstName);
        console.print(user.getPosts());
    }

    /*public void writePost(Post post) {
        postHistory.addPost(userFirstName, post);
    }

    public void follow() {
        userRepository.setFollowers(userFirstName, user);
    }

    public void wall(){

    }*/
}
