package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class size {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://ec2-54-170-61-15.eu-west-1.compute.amazonaws.com/#");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
	Dimension d = new Dimension(700,445);
	Dimension d1 = new Dimension(940,540);
	//Dimension d2 = new Dimension(2560,1600);
	driver.manage().window().setSize(d);
	Thread.sleep(5000);
	driver.manage().window().setSize(d1);
	Thread.sleep(5000);
	//driver.manage().window().setSize(d2);
	Thread.sleep(5000);
	
		driver.close();
		
	}
}
