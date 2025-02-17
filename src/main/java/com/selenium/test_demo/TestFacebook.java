package com.selenium.test_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




import org.openqa.selenium.*;


public class TestFacebook {
	 static WebDriver driver = new ChromeDriver();
	 
	 public static void main(String[] args) throws InterruptedException {
		 driver.get("https://www.facebook.com/");
		 
		 driver.getTitle();
		 
		 driver.findElement(By.id("email")).sendKeys("kirankumar.3887@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("Testing");
		 driver.findElement(By.name("login")).click();
		 Thread.sleep(10000);
		 System.out.println(driver.findElements(By.xpath("//div[@class='_9ay7' and contains(text(),'The email you entered isn’t connected to an account. ')]")).size());
		 driver.quit();
		 
	 }
				
		public static boolean loginApp() {
			
			try {
				driver.get("https://www.facebook.com/");
				 
				 driver.getTitle();
				 
				 driver.findElement(By.id("email")).sendKeys("kirankumar.3887@gmail.com");
				 driver.findElement(By.id("pass")).sendKeys("Testing");
				 driver.findElement(By.name("login")).click();
				 Thread.sleep(10000);
				 return driver.findElements(By.xpath("//div[@class='_9ay7' and contains(text(),'The email you entered isn’t connected to an account. ')]")).size()>0;
				 
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				quitDriver();
			}
			return false;
			
			
		}
		 public static void quitDriver() {
				 driver.quit();
				 
			 }
		 
		 

	
	

}
