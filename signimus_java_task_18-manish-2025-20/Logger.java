// Create a thread-safe Singleton class Logger with a log(String message) method to print messages with a timestamp.

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static final Logger INSTANCE = new Logger();
    
    private Logger() {}
    
    public static Logger getInstance() {
        return INSTANCE;
    }
    
    public void log(String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("[" + timestamp + "] " + message);
    }
    
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is a log message.");
        logger.log("Logger instance is thread-safe.");
    }
}
