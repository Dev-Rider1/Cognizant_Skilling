import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class NotificationTest {
    @Test
    public void testEmailSent() {
        EmailService emailService = mock(EmailService.class);
        emailService.sendEmail("Hello");
        verify(emailService).sendEmail("Hello");
    }
}