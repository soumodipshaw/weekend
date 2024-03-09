package personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_runner extends Base_class 
{
/*@Test(dataProvider ="auto")
public void test(String un,String pw)
{
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://facebook.com");
	driver.findElement(By.name("email")).sendKeys(un);
	driver.findElement(By.name("pass")).sendKeys(pw);
	driver.findElement(By.name("login")).click(); 
	

	 
}*/
	@Test(dataProvider ="auto")
	public void test1(String un,String pw)
	{
		driver.findElement(By.name("email")).sendKeys(un);
		test.log(LogStatus.PASS, "pass");
		driver.findElement(By.name("pass")).sendKeys(pw);
		test.log(LogStatus.PASS,"pass");
		driver.findElement(By.name("login")).click(); 
		Assert.assertEquals(driver.getTitle(),true);
	    test.log(LogStatus.PASS,"login page is verified");
		

		 
	}

}
