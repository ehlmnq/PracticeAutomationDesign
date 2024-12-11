package com.udemy.seleniumdesign.command;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsit0\\Music\\JavaSel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w1 = new WebDriverWait(driver, 10);
		WebDriverWait w2 = (WebDriverWait) new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		List<WebElement> e1  =  driver.findElements(By.cssSelector(".radioButton"));
	    WebElement e2 = driver.findElement(By.cssSelector("#opentab"));
	    w1.until(e0-> e0.findElements(By.cssSelector("#opentab")));
	    
		e1.stream().forEach(e -> e.click());
		
		driver.close();
		
		
		
		
	}

}
