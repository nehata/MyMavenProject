package com.test.demo;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNGGroupsAnnotationsDemo {

	
	@BeforeGroups("database")
	public void setupDB(){
		System.out.println("setupDB()");
		
	}
	
	@AfterGroups("database")
	public void cleanDB(){
		System.out.println("cleanDB()");
	}
	
  @Test(groups="selenium-test")
  public void runSeleniumRC() {
	  System.out.println("runSeleniumRC()");
  }
  
  @Test(groups="selenium-test")
 public void runSeleniumWebDriver(){
	  System.out.println("runSeleniumWebDriver()");
}
  
  @Test(groups="database")
  public void testConnectOracle(){
	  
	  System.out.println("testConnectOracle()");
  }
  
  @Test(groups="database")
  public void testConnectMySQL(){
	System.out.println("testConnectMySQL()");  
  }
  
  @Test(groups = {"database","selenium-test"})
  public void run(){
	  System.out.println("run()"); 
  }
  
 /* @Test(dependsOnGroups = {"database","selenium-test"})
  public void run(){
	  System.out.println("run()");  
  }*/
  
}
