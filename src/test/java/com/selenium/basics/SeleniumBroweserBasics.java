package com.selenium.basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumBroweserBasics {

	public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().minimize();
    driver.manage().window().setSize(new Dimension(800,500));
    driver .manage().window().maximize();
    driver.get("https://www.google.com");
    String actualtitle = driver.getTitle();
    String expectedTitle = "Google";
    Assert.assertEquals(actualtitle, expectedTitle);
    
    String windowhandleid = driver.getWindowHandle();
    
    driver.navigate().to("https://www.selenium.dev/");
    driver.navigate().back();
    driver.navigate().forward();
    
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://in.search.yahoo.com/");
    
    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("https://in.search.yahoo.com/");
    
    driver.switchTo().window(windowhandleid);
    
    driver.close();
    driver.quit();
    
	}

}
;