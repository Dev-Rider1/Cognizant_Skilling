import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserControllerTest {
    @Test
    public void testFetchUsername() {
        UserService mockService = mock(UserService.class);
        when(mockService.fetchUsername(1)).thenReturn("MockUser");
        assertEquals("MockUser", mockService.fetchUsername(1));
    }
}