package com.logginghelper.impl;

import org.slf4j.Logger;

import com.logginghelper.LoggerHelper;

public class InfoLoggerHelper implements LoggerHelper {

	@Override
	public boolean addLog(Logger loggerObject, String finalMessage) {
		boolean isLogged = false;
		if (loggerObject.isInfoEnabled()) {
			loggerObject.info(finalMessage);
			isLogged = true;
		}

		return isLogged;
	}

}
