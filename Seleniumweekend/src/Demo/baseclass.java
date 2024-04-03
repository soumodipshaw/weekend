package Demo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class baseclass {
	WebDriver driver;
@BeforeTest
public void open()
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	}
@AfterTest
public void close ()
{
	driver.close();
}

}
