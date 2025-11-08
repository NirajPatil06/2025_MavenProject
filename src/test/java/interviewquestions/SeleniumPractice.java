package interviewquestions;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumPractice {

	public static void main(String[] args) {

	
//		WebDriver driver = new ChromeDriver();
//		
////		driver.manage().window().maximize();
////		driver.manage().window().setSize(new Dimension (800,800));
////		driver.manage().window().minimize();
//		driver.manage().window().maximize();
//		
//		driver.manage().deleteAllCookies();
//		
//		driver.get("https://www.flipkart.com/");
//		
//		String expectedTitle = driver.getTitle();
//		String actualTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//		
//		System.out.println(expectedTitle);
//		
//		//compare expected vs actual title
//		Assert.assertEquals(actualTitle, expectedTitle);
//		
//		//change url on same tab		
//		driver.navigate().to("https://www.amazon.in/");
//		
//		driver.navigate().back();
//		driver.navigate().refresh();
//		
//		//get window handle id
//		String windowHandleID = driver.getWindowHandle();
//		System.out.println(windowHandleID);
//		
//		//open new tab in same browser window
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.amazon.in/");
//		
//	
//		driver.switchTo().window(windowHandleID);
//		
//		//open new tab in new browser
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.amazon.in/");
//		
//		driver.switchTo().window(windowHandleID);
//		
//		//Select DropDown
//		//Select drop = new Select();
//		//drop.selectByVisibleText();
//		
//		//Select hiddden element
//		//JavascriptExecutor js = (JavascriptExecutor)driver;	
//		//js.executeScript("arguments[0].scrollIntoView()", subjects);
//		driver.quit();
//	
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String  windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
		String  title = driver.getTitle();
		System.out.println(title);
		String expectedTile = "Google";
		Assert.assertEquals(title, expectedTile);
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().back();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com");
		
		driver.switchTo().window(windowID);
		
		
		driver.quit();
		
		
	
	
	}

}
