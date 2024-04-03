package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		//List<WebElement> links = driver.findElements(By.xpath("//a"));
		List<WebElement> textfield = driver.findElements(By.xpath("//input"));
		//int count = links.size();
		//System.out.println(count);
		/*for(WebElement link:links) {
			String an = link.getAttribute("href");
			driver.get(an);
			System.out.println(an);
		}*/
		for(WebElement a:textfield) {
			a.sendKeys("selenium");
		}
	}
}
