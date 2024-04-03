package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Shaw/Documents/abcd.html");
		//List<WebElement> links = driver.findElements(By.xpath("//a"));
		List<WebElement> textfield = driver.findElements(By.xpath("//input"));
	int count = textfield.size();
		for(WebElement a:textfield) {
			
			a.click();
			Thread.sleep(2000);
		}
		for(int i = count-1; i>=0 ; i--) {
			WebElement check = textfield.get(i);
			
			check.click();
			Thread.sleep(2000);
		}
		
		
	}
}
