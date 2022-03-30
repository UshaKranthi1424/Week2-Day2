package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		 
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.name("phoneAreaCode")).sendKeys("00");
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String text = driver.findElement(By.className("x-paging-info")).getText();
		
		if (text.equals("No records to display")) {
			
			System.out.println("Match Found");
		
		} else {
			
			System.out.println("No match Found");
		}
		
		driver.close();
	}
}	
		
		