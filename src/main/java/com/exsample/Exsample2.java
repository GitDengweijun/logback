package com.exsample;



import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class Exsample2 {
    public static void main(String[] args) {
        ch.qos.logback.classic.Logger logger = (Logger) LoggerFactory.getLogger("com.dwj");

        logger.setLevel(Level.INFO);
        logger.info("info");
        ch.qos.logback.classic.Logger logger2 = (Logger) LoggerFactory.getLogger("com.dwj.debug");
        logger2.debug("debug");
        ch.qos.logback.classic.Logger logger3 = (Logger) LoggerFactory.getLogger("com.dwj.debug");

        logger.info(logger2 == logger3 ? "true":"false");


    }
}
