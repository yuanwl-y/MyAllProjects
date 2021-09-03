package ywl.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create by ywl--- 2021-07-21-17:19
 **/
public class Log4jTest {
        public static Logger logger = LoggerFactory.getLogger(Log4jTest.class);
        public static void main(String[] arge){
            logger.debug("taiyonghai debug");
            logger.info("taiyonghai info");
            logger.error("taiyonghai error");
            logger.warn("taiyonghai warn");
        }
    }

