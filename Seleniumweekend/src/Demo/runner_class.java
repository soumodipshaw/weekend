package Demo;

import java.sql.Driver;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class runner_class extends baseclass
{
	@Test
	public void test() throws InterruptedException
	{
		pom p= new pom(driver);
		p.user().sendKeys("abc");
		p.psw().sendKeys("123");
		p.log().click();
	
	}

}
