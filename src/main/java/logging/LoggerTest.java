package logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoggerTest {

	static String configFileName = "C:\\Users\\Tanay\\eclipse-workspace\\practest\\log4j.properties";

	// public static final Logger logger;

	public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());

	@BeforeTest

	public static void getLogger() {

		PropertyConfigurator.configure(configFileName);

	}

	@Test
	public void testLogger() {
		// getlogger
		logger.info("log test 1");
		logger.info("log test 2");
		logger.info("Browser Closed");
		logger.error("invalid browser");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
