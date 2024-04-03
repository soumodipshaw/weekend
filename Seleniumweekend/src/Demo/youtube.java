package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("KGF");
		Thread.sleep(2000);

	 driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		
	 Thread.sleep(2000);
	 driver.close();
	 

		
		
}
}