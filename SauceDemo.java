package SauceLabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemo {
WebDriver driver;
@Test(priority=-1)
void openapp() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
driver.get("https://www.saucedemo.com/v1/index.html");
System.out.println("openapp");
}
@Test(priority=0)
void loginapp() {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.className("btn_action")).click();
}
@Test(priority=1)
void NameAtoZ() throws InterruptedException {
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]")).click();
Thread.sleep(100);
System.out.println("done");
driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[2]")).click();
Thread.sleep(100);
System.out.println("done");
driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[3]")).click();
Thread.sleep(100);
System.out.println("done");
driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[4]")).click();
Thread.sleep(100);
System.out.println("done");
driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[5]")).click();
Thread.sleep(100);
System.out.println("done");
driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[6]")).click();
Thread.sleep(100);
System.out.println("done");
driver.findElement(By.className("fa-shopping-cart")).click();
driver.findElement(By.className("checkout_button")).click();
driver.findElement(By.xpath("(//input[@class='form_input'])[1]")).sendKeys("tester");
driver.findElement(By.xpath("(//input[@class='form_input'])[2]")).sendKeys("me");
driver.findElement(By.xpath("(//input[@class='form_input'])[3]")).sendKeys("me");
driver.findElement(By.xpath("(//input[@class='btn_primary cart_button'])")).click();
driver.findElement(By.className("cart_button")).click();
System.out.println("order placed");
}

}

