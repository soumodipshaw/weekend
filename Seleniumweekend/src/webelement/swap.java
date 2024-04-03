package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class swap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://mail.google.com/mail/&dsh=S1644901182:1703395804864239&ec=asw-gmail-globalnav-create&flowEntry=SignUp&flowName=GlifWebSignIn&service=mail&theme=glif&TL=AHNYTIR7x4336-35eOT40X_C99PVjkKnI6i9Ds1dSyMK2YQz4c5iF83HYMPf0Cn0");
	 
		Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
       WebElement ele1 = driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
       ele.sendKeys("SELENIUM");
       Thread.sleep(2000);
       ele.sendKeys(Keys.CONTROL+"a");
       Thread.sleep(2000);
       ele.sendKeys(Keys.CONTROL+"c");
       Thread.sleep(2000);
       ele1.sendKeys(Keys.CONTROL+"v");
       Thread.sleep(2000);
       ele.sendKeys(Keys.CONTROL+"a");
       Thread.sleep(2000);
       ele.sendKeys(Keys.DELETE);
       Thread.sleep(2000);

		driver.close();
		
	}
}
