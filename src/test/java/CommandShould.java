import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CommandShould {

    /*@Mock
    PostHistoryShould postHistory;
    Command command;
    @Mock User user;

    @Mock UserRepository userRepository;

    @BeforeEach
    void setUp() {
        command = new Command("Bob", postHistory, user, userRepository);
    }

    @Test
    void read_the_post_and_print_it_out() {
        command.read();
        verify(postHistory).read("Bob");
    }

    @Test
    void write_post_and_save() {
        command.writePost("Hello");
        verify(postHistory).write("Bob", "Hello");
    }

    @Test
    void follow_user() {
        command.follow();
        verify(userRepository).setFollowers("Bob", user);
    }*/
}