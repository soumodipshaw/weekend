package personal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bluefence {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bluefence.com/");
	 driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]")).click();
	 Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		ele.sendKeys("bitpastel.sagnik@gmail.com",Keys.ENTER);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
	}
	
}
