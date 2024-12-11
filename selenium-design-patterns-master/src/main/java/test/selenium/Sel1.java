package test.selenium;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel1 {
	
	public static void main(String [] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsit0\\Music\\JavaSel\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-alerts");
		WebDriver d1 = new ChromeDriver(options);
		
		
        
		d1.get("https://www.naukri.com/");
		d1.findElement(By.xpath("//a[@title=\"Jobseeker Login\"]")).click();
		Thread.sleep(10000);
		d1.findElement(By.xpath("//div[@class='acceptance-btn']")).click();
		d1.findElement(By.xpath("//img[@alt=\"cross\"]")).click();
		WebDriverWait w1 = new WebDriverWait(d1, 100000);
		
		
		//w1.until(ExpectedConditions.alertIsPresent());
		d1.manage().window().maximize();
		//Alert a1 = w1.until(ExpectedConditions.alertIsPresent());
		//a1.accept();
		
		d1.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys("deepakit007@gmail.com");
		d1.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]")).sendKeys("Delhi123");
		d1.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		w1.until(e1-> e1.findElement(By.xpath("//img[@alt='naukri user profile img']")));
		
		d1.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		//w1.until(e1-> e1.findElement(By.xpath("//em[@class=\\\"icon edit\\\"]"))).click();
		//d1.findElement(By.xpath("//em[@class=\"icon edit\"]")).click();
		File uploadFile = new File("C:/Users/dsit0/Desktop/Qa_Automation_Architect_SDET_13Yrs_Exp.pdf");
		Thread.sleep(4000);
		WebElement e1 = d1.findElement(By.xpath("//input[@value=\"Update resume\"]"));
		//Actions actions = new Actions(d1);
		d1.findElement(By.xpath("//input[@value=\"Update resume\"]")).sendKeys(uploadFile.getAbsolutePath());
        // Click on the file input element to focus it
        //actions.click(e1).perform();
        // Send the file path to the file input element
        //actions.sendKeys(fileInput).perform();
		d1.findElement(By.xpath("//button[@id=\"saveBasicDetailsBtn\"]")).click();
		d1.quit();
	}

}
