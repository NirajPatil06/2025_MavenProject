package com.framework.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationCommons extends WebpageCommons{
	
	@Test 
	public void TestCase1() {
	//	Assert.fail("Test Case 1 failed");
		System.out.println("Test Case 1 - Home Page Executed Successfully...");
	}
	
	@Test 
	public void TestCase2() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test Case 2 - Add Product to Cart Feature Executed Successfully...");
		
	}	

	@Test(dataProvider="testcase3")
	public void TestCase3(String username, String password) {
		System.out.println("Test Case 3 - Login Executed Successfully with..."+username+" ,"+password);
	}

}
