package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		 
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("shobapp@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Shobana')][1]")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.name("submitButton")).click();
		
			
		
	}

}
