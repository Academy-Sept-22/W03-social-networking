import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class FeatureAcceptanceTest {

    @Mock Console console;

    @Test
    void
    should_print_timeline() {
        User user = new User("Bob");
//        Console console = new Console();
        Command command = new Command();
        command.read("Hello");

        verify(console).print("Hello");

    }



}
