package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class abc {
 public static void main(String[] args) throws InterruptedException, FileNotFoundException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://codexapp.terrogence-global.com/latest");
FileInputStream fis = new FileInputStream("./excel/Data.xlsx");
workbook
driver.findElement(By.xpath("//input[@id=\"emailLoginInput\"]")).sendKeys("admin@terrogence.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id=\"passLoginInput\"]")).sendKeys("ymgx9@Mt#$H%}v0");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
String title = driver.getTitle();
System.out.println(title);
String url = driver.getCurrentUrl();
System.out.println(url);
driver.close();
}
	
	

}
