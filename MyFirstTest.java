package FirstTest;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFirstTest {
	WebDriver a;//declare as class variable 
	
	@Test(priority=-1)
	void openapp() {
		System.out.println("openapp");
		a=new ChromeDriver();//Instantiate WebDriver object
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		a.manage().window().maximize();
		a.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
@Test(priority=0)
	void login() {
	System.out.println("login");
	a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	a.manage().window().maximize();
	a.findElement(By.name("username")).sendKeys("Admin");
	a.findElement(By.name("password")).sendKeys("admin123");
	a.findElement(By.className("orangehrm-login-button")).click();
}
@Test(priority=1)
	void logout() {
	System.out.println("logout");
	a.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	a.findElement(By.className("oxd-userdropdown-icon")).click();
	a.findElement(By.className("oxd-userdropdown-link")).click();
	WebElement dialogbox=a.findElement(By.className("oxd-dialog-close-button-position"));
		if(dialogbox.isDisplayed() && dialogbox.isEnabled()) {
			dialogbox.click();
	}
	else {
		System.out.println("closed");
	}
		a.findElement(By.className("oxd-userdropdown-icon")).click();
		a.findElement(By.className("oxd-userdropdown-link")).click();
	}
}

