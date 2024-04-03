package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class traversing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://ec2-54-170-61-15.eu-west-1.compute.amazonaws.com/");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"google\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"first_name_input\"]")).sendKeys("ali");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"last_name_input\"]")).sendKeys("mohammed");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"csv_name_input\"]")).sendKeys("abc");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id=\"searchBtn\"]")).click();
							
	}
	

}
