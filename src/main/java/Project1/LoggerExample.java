package Project1;

import java.util.logging.Logger;

public class LoggerExample {

    protected static final Logger log = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {

        log.info("To jest log o poziomie info");

        log.warning("To jest log o poziomie warning");


    }
}
