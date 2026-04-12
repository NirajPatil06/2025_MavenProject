package interviewquestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import groovyjarjarantlr4.v4.codegen.model.Action;



public class Selenium_E2E2 {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
//		Selenium Assignment - 2
//		====================

//		        1. Launch browser window(Chrome) 
		        driver = new ChromeDriver();
		        
//		        2. Maximize the browser window
		        driver.manage().window().maximize();
		        
//		        3. Delete all the cookies   
		        driver.manage().deleteAllCookies();
		        
//		        4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form) 
		        driver.get("https://demoqa.com/automation-practice-form");
		        
//		        5. Wait for Page-load
		        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[text()='Practice Form']"), 0));
		        
//		        6. Enter First name and Last name   
		        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		        firstName.clear();
		        lastName.clear();
		        
		        firstName.sendKeys("Niraj");
		        lastName.sendKeys("Patil");
		        
//		        7. Enter Email   
		        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		        email.clear();
		        email.sendKeys("nirajvyas1997@gmail.com");
		        
//		        8. Select Gender (Female)
		        selectGender("Male");
		        
//		        9. Enter mobile number    
		        WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		        mobileNumber.clear();
		        mobileNumber.sendKeys("7030377525");
		        
//		        10.Select DOB (1-Feb-1991) 
		        selectDOB("4","June","1999");
		        
//		        11.Search and Select Computer Science 
		        
		        
//		        12.Select Hobbies as Sports and Reading               
//		        13.Upload photo               
//		        14. Wait till window open to upload the file               
//		        15. Upload file               
//		        16. Wait till file upload                
//		        17.Submit Details               
//		        18. Close browser window
	}
	
	public static void selectGender(String option) {
		WebElement gender = driver.findElement(By.xpath("//input[@value='"+option+"]"));
		gender.click();
	}

	public static void selectDOB(String date, String month, String year) {
		//open calender 
		WebElement calender = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		calender.click();
		
		//wait for calender
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@class='react-datepicker__month-select']"), 0));
		
		//Select Month
		WebElement selectmonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select selectMonth = new Select(selectmonth);
		selectMonth.selectByVisibleText(month);
		
		//select year
		WebElement selectyear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']']"));
		Select selectYear = new Select(selectmonth);
		selectYear.selectByVisibleText(year);
		
		// Select date
		WebElement selectdate = driver.findElement(By.xpath(" //div[text()='"+date+"' and contains(@aria-label,'"+month+"')]"));
		Select selectDate = new Select(selectmonth);
		selectDate.selectByVisibleText(year);
		
		
		
	}
	
	public static void selectSunject(String subjectName) {
		WebElement subject = driver.findElement(By.xpath(" //div[@id='subjectsWrapper']"));
		
		// scroll down till subject
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0],scrollIntoView()",subject);
		
		//inter input values
		Actions action = new Actions(driver);
		action.sendKeys(subject, subjectName).perform();
		
		//
		
		
		
	}
}
