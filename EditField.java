package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditField {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("kranthi.1424@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Usha");
		String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
	    System.out.println(attribute);
	    driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	    driver.findElement(By.xpath("//label[contains(text(),'disabled')]/following-sibling::input"));
	    WebElement Disabled = driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean enabled = Disabled.isEnabled();
		System.out.println(enabled);
	   
	}

}
