package com.yanmingchen.demo;

import com.yanmingchen.chain_of_responsibility.AbstractLogger;
import com.yanmingchen.chain_of_responsibility.ConsoleLogger;
import com.yanmingchen.chain_of_responsibility.ErrorLogger;
import com.yanmingchen.chain_of_responsibility.FileLogger;

/**
 * @Author: YanmingChen
 * @Date: Create in 8:56 2018/6/15
 * @Description:
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }

}
