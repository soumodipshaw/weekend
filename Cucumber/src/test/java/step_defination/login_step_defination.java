package step_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_step_defination {
WebDriver driver;
	@Given("open the application and enter the url")
	public void open_the_application_and_enter_the_url() {
	  driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@When("enter the valid UN and psw and click om ligin button")
	public void enter_the_valid_un_and_psw_and_click_om_ligin_button() {
	    driver.findElement(By.name("email")).sendKeys("abc");
	    driver.findElement(By.name("pass")).sendKeys("123");
	    driver.findElement(By.name("login")).click();


	}

	@Then("homne page should be displayed")
	public void homne_page_should_be_displayed() {
	    String title = driver.getTitle();
	    System.out.println(title);
	}

	@Then("verify the title")
	public void verify_the_title() {
	  System.out.println("home is verified");  
	}


	
}
