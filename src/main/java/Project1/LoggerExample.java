package Project1;

import org.apache.log4j.Logger;


public class LoggerExample {

    protected static final Logger log = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {

        log.info("To jest log o poziomie info");
        log.warn("To jest Log na poziomie warn");
        log.debug("To jest log o poziomie debug");
    }
}
