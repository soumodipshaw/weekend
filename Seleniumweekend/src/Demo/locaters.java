package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locaters {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	WebElement ele = driver.findElement(By.id("email"));
	ele.sendKeys("hi");
	Thread.sleep(2000);
	ele.clear();
	Thread.sleep(2000);
	driver.close();
	
}
}
