import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppLogger {
    private static final Logger logger = LoggerFactory.getLogger(AppLogger.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.warn("This is a warning");
        logger.error("This is an error message");
    }
}