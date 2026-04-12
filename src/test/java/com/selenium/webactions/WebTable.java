package com.selenium.webactions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static void main(String[] args) {
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://cosmocode.io/automation-practice-webtable/");
   
   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
   
   wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h2[text() ='List of Countries, Capitals, Currencies and Languages']"), 0));
   
   List<WebElement> rows = driver.findElements(By.xpath("//h2[text() ='List of Countries, Capitals, Currencies and Languages']/following-sibling::table//tbody//tr"));
   int totalrows = rows.size();
   
   List<WebElement> column = driver.findElements(By.xpath("//h2[text() ='List of Countries, Capitals, Currencies and Languages']/following-sibling::table//tbody//tr[1]//td"));
   int totalcoloumn = column.size();
   
   
   for(int r=1;r<=totalrows;r++) {
	   for(int c=1;c<=totalcoloumn;c++) {
		  WebElement cell =  driver.findElement(By.xpath("//h2[text() ='List of Countries, Capitals, Currencies and Languages']/following-sibling::table//tbody//tr["+r+"]/td["+c+"]"));
		  System.out.println("Row "+r+", Column "+c+" value is :"+cell.getText());
	   }
   }
   
   driver.quit();
	}

}
