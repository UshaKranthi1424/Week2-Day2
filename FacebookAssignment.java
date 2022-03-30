package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	public static void main(String[] args) {
		//Assignment:1 FaceBook:
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Usha");
		
		driver.findElement(By.name("lastname")).sendKeys("Inti");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9000904498");
		
		driver.findElement(By.id("password_step_input")).sendKeys("1234567");
		
		 WebElement birthday = driver.findElement(By.id("day"));
		 Select day=new Select(birthday);
		 day.selectByValue("4");
		 
		 WebElement birthMonth = driver.findElement(By.id("month"));
		 Select month=new Select(birthMonth);
		 month.selectByValue("6");
		 
		 WebElement birthYear = driver.findElement(By.id("year"));
		 Select year=new Select(birthYear);
		 year.selectByValue("1991");
		 
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 
	}

}
