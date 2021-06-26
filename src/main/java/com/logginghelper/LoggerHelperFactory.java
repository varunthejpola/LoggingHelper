package com.logginghelper;

import org.slf4j.event.Level;

import com.logginghelper.impl.DebugLoggerHelper;
import com.logginghelper.impl.InfoLoggerHelper;

public class LoggerHelperFactory {

	public static LoggerHelper loggerLevel(Level level) {
		switch (level) {
		case INFO:
			return new InfoLoggerHelper();
		case DEBUG:
			return new DebugLoggerHelper();
		default:
			System.out.println("You will never read me");
			break;
		}
		return null;
	}

}
