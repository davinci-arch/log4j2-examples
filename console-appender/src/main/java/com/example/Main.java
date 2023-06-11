package com.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; ; i++) {

            if (i % 3 == 0) {
                log.info(i + " % 3");
            } else if (i % 4 == 0) {
                log.debug(i + " % 4");
            } else if (i % 5 == 0) {
                log.warn(i + " % 5");
            } else if (i % 7 == 0) {
                log.error(i + " % 7");
            } else if (i % 11 == 0) {
                log.fatal(i + " % 11");
            }

            TimeUnit.MILLISECONDS.sleep(350);
        }
    }
}
