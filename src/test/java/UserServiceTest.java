import org.junit.Test;
import ru.yandex.practicum.catsgram.exception.DuplicatedDataException;
import ru.yandex.practicum.catsgram.model.User;
import ru.yandex.practicum.catsgram.service.UserService;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    public void shouldThrowExc() {
        UserService userService = new UserService();

        User user1 = new User();

        user1.setUsername("yui");
        user1.setEmail("ufeh@djsnf");
        user1.setPassword("123");

        assertEquals(user1, userService.create(user1));

        User user2 = new User();

        user2.setUsername("yui");
        user2.setEmail("ufeh@djsnf");
        user2.setPassword("123");

        assertThrows(DuplicatedDataException.class, () -> userService.create(user2));
    }


}
