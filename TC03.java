package SauceLabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC03 {
	WebDriver driver;
	@Test(priority=1)
void NameAtoZ() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	for(int i=1;i<7;i++) {
	driver.findElement(By.className("btn_inventory")).click();
	}
	System.out.println("done");
	
}
}