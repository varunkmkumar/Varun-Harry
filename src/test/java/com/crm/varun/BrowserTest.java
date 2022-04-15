package com.crm.varun;


import org.testng.annotations.Test;

public class BrowserTest {

	@Test
	public void browserTest()
	{
		
		
		String BROWSER = System.getProperty("browser");
		
		
		System.out.println(BROWSER);
	}
}
