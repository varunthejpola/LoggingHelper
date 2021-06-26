package com.logginghelper;

import org.slf4j.Logger;
import org.slf4j.event.Level;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicLoggerTest {

	private Logger logger;

	@BeforeClass
	public void setup() {
		logger = BasicLogger.createLogObject("testclass");
	}

	@Test
	public void test_addLog_with_infoLevel() {
		Assert.assertTrue(BasicLogger.addLog(logger, Level.INFO, "corealted1", "info level"));
	}

	@Test
	public void test_addLog_with_debugLevel() {
		Assert.assertTrue(BasicLogger.addLog(logger, Level.DEBUG, "corealted1", "debug level"));
	}

}
