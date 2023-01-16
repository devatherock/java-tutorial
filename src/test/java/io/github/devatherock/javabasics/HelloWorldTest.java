package io.github.devatherock.javabasics;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test class for {@code HelloWorld}
 * 
 * @author devatherock
 *
 */
public class HelloWorldTest {
	private static final PrintStream OLD_STREAM = System.err;
	private static final ByteArrayOutputStream OUTPUT_STREAM = new ByteArrayOutputStream();
	private static final StringBuilder PREVIOUS_LOG_LINES = new StringBuilder();

	@AfterClass
	public static void tearDown() {
		System.setOut(OLD_STREAM);
	}

	@BeforeClass
	public static void captureConsole() {
		System.setOut(new PrintStream(OUTPUT_STREAM));
	}
	
	/**
	 * Test method for {@link HelloWorld#sayHelloInOneLine()}
	 * 
	 * @throws UnsupportedEncodingException
	 */
	@Test
	public void testSayHelloInOneLine() throws UnsupportedEncodingException {
		HelloWorld.sayHelloInOneLine();
		
		String logLine = OUTPUT_STREAM.toString("UTF-8");
		String actualLogLine = logLine.replace(PREVIOUS_LOG_LINES.toString(), "");
		
		assertEquals("Hello World!", actualLogLine);
		PREVIOUS_LOG_LINES.append(actualLogLine);
	}
	
	/**
	 * Test method for {@link HelloWorld#sayHelloWithNewLine()}
	 * 
	 * @throws UnsupportedEncodingException
	 */
	@Test
	public void testSayHelloWithNewLine() throws UnsupportedEncodingException {
		HelloWorld.sayHelloWithNewLine();
		
		String logLine = OUTPUT_STREAM.toString("UTF-8");
		String actualLogLine = logLine.replace(PREVIOUS_LOG_LINES.toString(), "");
		
		assertEquals("Hello World!" + System.lineSeparator(), actualLogLine);
		PREVIOUS_LOG_LINES.append(actualLogLine);
	}
}
