package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Shaw/Documents/abc.html");
		//List<WebElement> links = driver.findElements(By.xpath("//a"));
		List<WebElement> textfield = driver.findElements(By.xpath("//input"));
	
		for(WebElement a:textfield) {
			a.sendKeys("selenium");
			
		}
		for(WebElement a:textfield) {
			a.clear();
			
		}
		
		
	}
}
