import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class GreetingServiceTest {
    GreetingService service;

    @BeforeEach
    public void setUp() {
        service = new GreetingService();
    }

    @Test
    public void testGreet() {
        // Arrange is done in setUp
        // Act
        String result = service.greet("Meghana");
        // Assert
        assertEquals("Hello, Meghana!", result);
    }

    @AfterEach
    public void tearDown() {
        service = null;
    }
}