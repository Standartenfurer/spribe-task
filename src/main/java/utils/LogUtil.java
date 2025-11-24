package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtil {

    private static final Logger logger = LogManager.getLogger(LogUtil.class);

    private LogUtil() {
    }

    public static void info(String log) {
        logger.info(log);
    }

    public static void error(String error) {
        logger.error(error);
    }

}
