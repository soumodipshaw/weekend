package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//input[@id='firstName']"));
ele.sendKeys("soumodip",Keys.TAB+"shaw",Keys.TAB+"soumodip@gmail.com");
	driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='14']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\Shaw\\Music\\Soumodip shaw(Resume) (1).pdf");
	

	}
	
}
