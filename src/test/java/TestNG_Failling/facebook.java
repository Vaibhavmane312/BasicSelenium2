package TestNG_Failling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
@Test
public void fb() {
	WebDriverManager.edgedriver().setup();
	 WebDriver driver = new EdgeDriver();
	// for maximizing
	driver.manage().window().maximize();
	// implicit
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("asdfg");
}
}
