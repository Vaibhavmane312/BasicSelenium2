package POP_UPS;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Popup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// for maximizing
		driver.manage().window().maximize();
		// implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
		}
		driver.findElement(By.xpath("//input[@placeholder='Enter name to continue']")).sendKeys("sasikala");
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
	}

}
