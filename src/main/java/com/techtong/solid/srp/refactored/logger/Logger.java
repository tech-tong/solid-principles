package com.techtong.solid.srp.refactored.logger;

public class Logger {

    private static final FileLogger fileLogger = new FileLogger();
    private static final ConsoleLogger consoleLogger = new ConsoleLogger();

    public static void info(String message) {
        fileLogger.logInFile(message);
        consoleLogger.logInConsole(message);
    }
}
