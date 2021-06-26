package com.logginghelper.impl;

import org.slf4j.Logger;

import com.logginghelper.LoggerHelper;

public class DebugLoggerHelper implements LoggerHelper {

	@Override
	public boolean addLog(Logger loggerObject, String finalMessage) {
		boolean isLogged = false;
		if (loggerObject.isDebugEnabled()) {
			loggerObject.debug(finalMessage);
			isLogged = true;
		}
		return isLogged;
	}

}
