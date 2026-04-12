package com.selenium.webactions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class SeleniumWebActions7 {
	
	static WebDriver driver  = null;

	public static void main(String[] args) {

//      1. Launch browser window(Chrome) 
		driver = new ChromeDriver();
		
//      2. Maximize the browser window  
		driver.manage().window().maximize();
		
//      3. Delete all the cookies  
		driver.manage().deleteAllCookies();
		
//      4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm) 
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//      5. Verify application title (ParaBank | Welcome | Online Banking)
		String actualTitle = driver.getTitle();
		String expTitle = "ParaBank | Welcome | Online Banking";
		Assert.assertEquals(actualTitle, expTitle);
		
//      6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed());
		
//      7. Verify application caption (Experience the difference)
		WebElement actualCaption = driver.findElement(By.xpath("//p[@class='caption']"));
		String actualCap = actualCaption.getText();
		String expCaption = "Experience the difference";
		Assert.assertEquals(actualCap, expCaption);
		
//      8. Enter Invalid credentials in Username and Password textboxes
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='username']"));
		userName.clear();
		password.clear();
		userName.sendKeys("user");
		password.sendKeys("pass123");
		
//      9. Verify button label (LOG IN) and Click on Login Button
		WebElement button = driver.findElement(By.xpath("//input[@value='Log In']"));
		Assert.assertTrue(button.isDisplayed());
		button.click();
		
//      10. Verify error message is coming
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[text()='The username and password could not be verified.']"),0));
//		WebElement message = driver.findElement(By.xpath("//p[text()='The username and password could not be verified.']"));
//		Assert.assertTrue(message.isDisplayed());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		
		WebElement error = driver.findElement(By.xpath("//p[@class='error']"));
		Assert.assertTrue(error.isDisplayed());
		
//      11. Click on Admin page link
		WebElement adminpageLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminpageLink.click();
		
//      12. Wait for admin page
		driver.findElement(By.xpath("//h1[contains(text(), 'Administration') and @class= 'title']"));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(), 'Administration') and @class= 'title']"),0));
		
//      13. Select Data access mode as ' SOAP'
		selectradiobutton("soap");
		
//      14. Scroll-down till Loan provider
//      15. Select Loan provider as 'Web Service'
		selectLoanProvider("Web Service");
		
//      16. Click on Submit button
		WebElement sumitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		sumitButton.click();
		
//      17. wait for Successful submission message
		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text() = 'Settings saved successfully.']"),0));
		
		
//      18. Click on Services Link
		WebElement ServiceLink = driver.findElement(By.xpath("//ul[@class= 'leftmenu']//li[3]// a[text()='Services']"));
		ServiceLink.click();
		
//      19. Wait for Services page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		
//      20. Scroll-down till Bookstore services
		WebElement bookservices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", bookservices);
		
//      21. Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tbody//tr"));
		int totalRows = rows.size();
		
		List<WebElement> coloumn = driver.findElements(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tbody//tr[1]//td"));
		int totalColumn = coloumn.size();
		
		
//      22. Get Column headers of book store services table
		
		for(WebElement header:coloumn) {
			System.out.println("Coloumn header : "+ header.getText());
		}
//      23. Get all the data from book store service table
		for(int r=1;r<=totalRows;r++) {
			for(int c=1;c<=totalColumn;c++) {
				WebElement cell = driver.findElement(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr["+r+"]//td["+c+"]"));
				
				System.out.println("Row "+r+", Column "+c+" value is :"+cell.getText());
				
			}
		}
//      24. Close browser window
		driver.quit();
	}

	public static void selectradiobutton(String option) {
		WebElement dbMode = driver.findElement(By.xpath("//input[@value='"+ option +"']"));
		dbMode.click();
	}
	
	public static void selectLoanProvider(String option) {
		WebElement loanProvider = driver.findElement(By.xpath("//select[@id='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView",loanProvider);
		Select s = new Select(loanProvider);
		s.selectByVisibleText(option);

	}
}
