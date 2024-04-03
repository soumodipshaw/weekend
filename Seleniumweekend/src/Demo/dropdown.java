package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.Striped;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(ele);
		List<WebElement> aop = s.getOptions();
		for(WebElement op:aop) {
			String text = op.getText();
			//System.out.println(text);
		
		
	}
		System.out.println();
		ArrayList<String> l = new ArrayList<String>();
		for(WebElement r:aop)	{
			String txt1 = r.getText();
			l.add(txt1);
			
		}
		Collections.sort(l,Collections.reverseOrder());
		for(String r1:l) {
			System.out.println(r1);
		}
		/*System.out.println();
		Collections.reverse(l);
		for(String r2:l) {
			System.out.println(r2);
		}*/
		
		s.selectByIndex(0);
		s.deselectByIndex(0);
		
}
}
	
