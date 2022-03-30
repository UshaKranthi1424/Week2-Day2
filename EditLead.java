package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

  public class EditLead {

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
		
		driver.findElement(By.id("ext-gen248")).sendKeys("Shobana");
		
		driver.findElement(By.id("ext-gen334")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Shobana')][1]")).click();
				
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Bosch");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
