package com.logginghelper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

public class BasicLogger {

	public static Logger createLogObject(String className) {
		// TODO try to find a way to add classname.class to the below method as argument
		return LoggerFactory.getLogger(className);
	}

	public static boolean addLog(Logger logger, Level level, String corelationId, String message) {
		boolean isLogged = false;
		LoggerHelper helper = LoggerHelperFactory.loggerLevel(level);
		if (helper != null) {
			isLogged = helper.addLog(logger, buildFinalMessage(corelationId, message));
		}
		return isLogged;
	}
	
	private static String buildFinalMessage(String corelationId, String message) {
		return corelationId + " " + message;
	}

}
