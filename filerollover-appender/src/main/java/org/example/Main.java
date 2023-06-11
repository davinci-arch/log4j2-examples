package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws InterruptedException {

        int i = 0;

        while(true){

            if (i % 3 == 0) {
                log.debug("This is debug cuz: " + i + " / 3 = 0");
            } else if (i % 7 == 0) {
                log.info("This is debug cuz: " + i + " / 7 = 0");
            } else if (i % 13 == 0) {
                log.warn("This is debug cuz: " + i + " / 13 = 0");
            } else if (i % 16 == 0) {
                log.error("This is debug cuz: " + i + " / 16 = 0");
            } else if (i % 20 == 0) {
                log.fatal("This is debug cuz: " + i + " / 20 = 0");
            }

            TimeUnit.MILLISECONDS.sleep(100);

            i++;

        }
    }
}