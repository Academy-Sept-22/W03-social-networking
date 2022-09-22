import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PostHistoryShould {

    @Mock Command command;

    @Test
    public void read_post_and_print_it_out(){
        User user = new User("Bob");
        user.addPosts("Hello");
        User user1 = new User("Mark");
        user1.addPosts("Hello");
        command.read("Bob");
        Assertions.assertEquals(user.getPosts().size(), 1);

    }

}
