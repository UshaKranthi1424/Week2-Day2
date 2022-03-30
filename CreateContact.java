package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Usha");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Kranthi");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Usha");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Inti");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		 
	    driver.findElement(By.id("createContactForm_description")).sendKeys("I am Learning Automation Testing");
		 
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kranthi.1424@gmail.com");
		
		WebElement dropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 
		Select source= new Select(dropDown);
		 
		source.selectByVisibleText("New York");
		 
		driver.findElement(By.name("submitButton")).click();
		 
		driver.findElement(By.linkText("Edit")).click();
		 
		driver.findElement(By.id("updateContactForm_description")).clear();
		 
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Selenium Automation");
		 
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 
		String title = driver.getTitle();
			
			System.out.println(title);
			
		}

}
