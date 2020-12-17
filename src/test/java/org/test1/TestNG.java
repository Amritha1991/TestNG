package org.test1;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	public WebDriver driver;
	
 @BeforeClass
  private void lauchbrowser() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pamri\\eclipse-workspace\\TestNg\\src\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
 }
	 
 @AfterClass
  private void closeapp() throws InterruptedException {
  driver.wait(100000);
 }

 @BeforeMethod
 private void startTime() {
 Date d=new Date();
 System.out.println(d);
	}

 @AfterMethod
 private void endTime() {
 Date d=new Date();
 System.out.println(d);
	}
  
 @Test
 private void testCase1() throws InterruptedException {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell laptop");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	Thread.sleep(3000);
	
	List<WebElement> prodcount = driver.findElements(By.xpath("a-size-medium a-color-base a-text-normal"));
	
	for (int i = 0; i < prodcount.size(); i++) {
		String text = prodcount.get(i).getText();
		System.out.println(text);		
	}}
	
	
 @Test
  private void testCase2() throws InterruptedException {
   List<WebElement> cost = driver.findElements(By.xpath("//span[text()='₹30,000 – ₹40,000']"));
   Thread.sleep(10000);
   for (int i = 0; i < cost.size(); i++) {
	   String text1 = cost.get(i).getText();
	   System.out.println(text1);
	
}
    
    
  }
 
}

 




 
 



