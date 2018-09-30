package com.exsample;


import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld1 {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorld1.class);

    public static void main(String[] args) throws ClassNotFoundException {


        logger.info("hello world!");//GGG

    }
}
