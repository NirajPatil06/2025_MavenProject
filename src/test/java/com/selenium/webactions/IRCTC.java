package com.selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IRCTC {

	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.irctc.co.in

		// 1. Launch browser window(Chrome)
		driver = new ChromeDriver();

		// 2. Maximize the browser window
		driver.manage().window().maximize();

		// 3. Delete all the cookies
		driver.manage().deleteAllCookies();

		// 4. Enter URL and Launch the application
		// (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://www.irctc.co.in");
		
		WebElement menubutton = driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']//i[@class='fa fa-align-justify']"));
		menubutton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//a[@aria-label='Menu Train']//strong[text()='TRAINS']"), 0));
		
		WebElement trains = driver.findElement(By.xpath("//a[@aria-label='Menu Train']//strong[text()='TRAINS']"));
		trains.click();
		
		WebElement irctc_trains = driver.findElement(By.xpath("//a[@aria-label='class']//span[text()='IRCTC TRAINS']"));
		Actions action = new Actions(driver);
		action.moveToElement(irctc_trains);
		
		WebElement groupBookings = driver.findElement(By.xpath("//a[@aria-label='Sub Menu of IRCTC TRAINS, Group Booking']//span[text()='Group Booking']"));
		groupBookings.click();
	}

}
