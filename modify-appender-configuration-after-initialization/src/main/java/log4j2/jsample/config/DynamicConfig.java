package log4j2.jsample.config;

import org.apache.logging.log4j.LogManager;
import org.slf4j.MDC;

public class DynamicConfig {

    public static synchronized void reconfigure() {
        MDC.put("layout", "%d{yyyy-MM-dd HH:mm:ss.SSS} %level [%t] [%c] [%M] [%l] - %msg vikas %n");
        ((org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false)).reconfigure();
    }
}
