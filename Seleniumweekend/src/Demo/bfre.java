package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class bfre {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://ec2-54-170-61-15.eu-west-1.compute.amazonaws.com/#");
	 
		Thread.sleep(2000);
      WebElement ele = driver.findElement(By.xpath("//input[@id='first_name_input']"));
    	Thread.sleep(2000);
    	ele.sendKeys("Noor",Keys.TAB+"ali",Keys.TAB+"mohammed",Keys.TAB+"test@gmail.com",Keys.TAB,Keys.TAB,Keys.TAB+"abc");
    	
    	Thread.sleep(2000);
		driver.close();
		
	}

}
