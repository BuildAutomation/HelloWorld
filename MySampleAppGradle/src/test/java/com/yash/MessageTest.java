package com.yash;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MessageTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String user = "Demo";
		String ms = "Welcome to the SampleApp";
		Message message = new Message();
		message.setUser(user);
		assertEquals(ms + " " + user+" ...!", message.getMsg());
	}

}
