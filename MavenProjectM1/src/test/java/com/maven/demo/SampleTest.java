package com.maven.demo;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void case1() {
		String BROWSER = System.getProperty("bro");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("un");
		String PASSWORD = System.getProperty("pwd");

		System.out.println(BROWSER);

		System.out.println(URL);

		System.out.println(USERNAME);

		System.out.println(PASSWORD);
	}
}
