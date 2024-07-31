package com.sample.testScripts;

import org.testng.annotations.Test;

public class Monster_Test {
@Test
public void  executeScript() {
	System.err.println("hii");
	String browserName = System.getProperty("bname");
	System.out.println(browserName);
	
	String userNames = System.getProperty("user");
	System.out.println(browserName);
	
}
}
