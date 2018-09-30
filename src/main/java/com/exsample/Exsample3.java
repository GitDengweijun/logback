package com.exsample;



import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.ConsoleAppender;
import org.slf4j.LoggerFactory;


public class Exsample3 {
    public static void main(String[] args) {
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.exsample.Exsample3");

        LoggerContext loggerContext=logger.getLoggerContext();
        loggerContext.reset();

        PatternLayoutEncoder encoder=new PatternLayoutEncoder();
        encoder.setContext(loggerContext);
        encoder.setPattern("%d{yyyy-MM-dd HH:mm:ss.SSS} -- %-5level [%thread] : %msg%n ");
        encoder.start();

        ConsoleAppender appender=new ConsoleAppender();
        appender.setContext(loggerContext);
        appender.setEncoder(encoder);
        appender.start();

        logger.addAppender(appender);
        logger.debug("dengweijun");
    }
}
