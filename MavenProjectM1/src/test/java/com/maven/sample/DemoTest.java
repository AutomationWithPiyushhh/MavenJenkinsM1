package com.maven.sample;

import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void case2() {
		String name = System.getProperty("name");
		System.out.println("Hey " + name + " this is case2 from DemoTest of sample...");
	}
}
