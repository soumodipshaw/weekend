package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class child {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("puma sneckers",Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div/div/a[1]")).click();
	
	
	}
	
}
