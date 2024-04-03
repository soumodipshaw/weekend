package personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class terrogence {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://codexapp.terrogence-global.com/latest");
		driver.findElement(By.xpath("//input[@id=\"emailLoginInput\"]")).sendKeys("admin@terrogence.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"passLoginInput\"]")).sendKeys("ymgx9@Mt#$H%}v0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.=\"View All Reports\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id=\"image-result-tab\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id=\"video-result-tab\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id=\"doc-result-tab\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id=\"audio-result-tab\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"reportElement\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Discover']")).click();
		Thread.sleep(2000);
		//WebElement ele = driver.findElement(By.xpath("//button[@id=\"daterange-btn\"]"));
		
		driver.close();
		

		
	}
	
}
