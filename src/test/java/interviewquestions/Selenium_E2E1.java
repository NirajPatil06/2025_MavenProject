package interviewquestions;

import static org.testng.Assert.assertEquals;

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

public class Selenium_E2E1 {
	static WebDriver driver = null;

	public static void main(String[] args) {

		//Selenium Assignment - 1
		//====================
		
//		        1. Launch browser window(Chrome)    
		         driver = new ChromeDriver();
		        
//		        2. Maximize the browser window
		        driver.manage().window().maximize();
		        
//		        3. Delete all the cookies    
		        driver.manage().deleteAllCookies();
		        
//		        4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)    
		        driver.get("https://parabank.parasoft.com/parabank/index.htm");
		        
//		        5. Verify application title (ParaBank | Welcome | Online Banking)
		        String actualTitle = driver.getTitle();
		        String expectedTitle = "ParaBank | Welcome | Online Banking";
		        Assert.assertEquals(actualTitle, expectedTitle);
		        
//		        6. Verify application logo
		        WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		        Assert.assertTrue(logo.isDisplayed());
		        
//		        7. Verify application caption (Experience the difference)
		        WebElement Caption = driver.findElement(By.xpath("//p[contains(text(),'Experience the difference')]"));
		        String actualCaption = Caption.getText();
		        String expectedCaption = "Experience the difference";
		        Assert.assertEquals(actualCaption, expectedCaption);
		        
//		        8. Enter Invalid credentials in Username and Password textboxes
		        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		        
				//clear textboxes
				userName.clear();
				password.clear();
				
		        userName.sendKeys("admin123");
		        password.sendKeys("admin@123");
		        
//		        9. Verify button label (LOG IN) and Click on Login Button
		        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		        String actual = loginButton.getAttribute("value").toUpperCase();
		        String expected = "LOG IN";
		        Assert.assertEquals(actual,expected);
		        loginButton.click();
		       
		       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		       wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[@class='error']"), 0));
		       
//		        10. Verify error message is coming
		        WebElement erroMessage = driver.findElement(By.xpath("//p[@class='error']"));
		        Assert.assertTrue(erroMessage.isDisplayed());
		        
//		        11. Click on Admin page link
		        WebElement adminPageLink = driver.findElement(By.xpath("//a[contains(text(),'Admin Page')]"));
		        adminPageLink.click();
		        
//		        12. Wait for admin page
		        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
		        wait1.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"), 0));
		        
//		        13. Select Data access mode as ' SOAP'
		        selectAccessMode("SOAP");
		        
//		        14. Scroll-down till Loan provider
//		        15. Select Loan provider as 'Web Service'
		        selectLoanProvider("selectLoanProvider");
		        
//		        16. Click on Submit button
		        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		        submitButton.click();
		        
//		        17. wait for Successful submission message
		        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.]\""), 0));
		       
//		        18. Click on Services Link
		        WebElement ServiceLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		        ServiceLink.click();
		        
//		        19. Wait for Services page
		        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Available Bookstore SOAP services:']"), 0));

//		        20. Scroll-down till Bookstore services
		        WebElement booktable = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		        JavascriptExecutor js =(JavascriptExecutor)driver;
		        js.executeScript("arguments[o],scrollIntoView()",booktable);
		        
//		        21. Get total rows, columns in the bookstore service table
		        List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tbody//tr"));
		        int totalrows = rows.size();
		        
		        List<WebElement> coloumn = driver.findElements(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tbody//tr[1]//td"));
		        int totalcoloumn = coloumn.size();
		        
//		        22. Get Column headers of book store services table
		        for(WebElement coloumheader:coloumn ) {
		        	System.out.println(coloumheader.getText());
		        }
//		        23. Get all the data from book store service table
		        for(int r=1;r<=totalrows;r++) {
		        	for(int c=1;c<=totalcoloumn;c++) {
		        		
		        	WebElement cell = driver.findElement(By.xpath("//span[text()='Bookstore services:']//following-sibling::table[1]//tbody//tr["+r+"]//td["+c+"]"));
		        	System.out.println("Row "+r+" , coloumn "+c+" value is : "+cell.getText());
		        	}
		        }
//		        24. Close browser window
		        driver.quit();
	}

	public static void selectAccessMode(String option) {
		WebElement accessMode = driver.findElement(By.xpath("//input[@value=' "+option+" ']"));
		accessMode.click();
	}
	public static void selectLoanProvider(String option) {
		WebElement loanProvider = driver.findElement(By.xpath("//select[@name='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",loanProvider);
		Select s = new Select(loanProvider);
		s.selectByVisibleText(option);
	}
}
