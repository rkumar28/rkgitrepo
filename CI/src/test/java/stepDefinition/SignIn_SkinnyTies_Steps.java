package stepDefinition;

import static org.junit.Assert.assertTrue;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn_SkinnyTies_Steps {
	public static WebDriver wDriver;
	
	@Given("SkinnyTies SignIn Page is Active")
	public void skinnyties_SignIn_Page_is_Active() {
		String geckodriverpath="C:\\HCL-All-Items\\rkgitrepo\\CI\\WebDriver\\geckodriver-v0.21.0-win64\\geckodriver.exe";
	    System.setProperty("webdriver.gecko.driver", geckodriverpath);
	    //Then create a new instance on firefox driver
	    wDriver = new FirefoxDriver();	    
	    wDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		wDriver.manage().window().maximize();
		
		System.out.println("Opened the Browser - Local Test Mode.");
		wDriver.get("https://skinnyties.com");
		assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isDisplayed());
		assertTrue(wDriver.findElement(By.xpath("//*[@id='search']")).isEnabled());
		
		//Click SignIn Link from Landing page.
		WebElement signinLink = wDriver.findElement(By.xpath("//*[@id='header-account']/ul/li[1]/a"));
		assertTrue(signinLink.isDisplayed());
		signinLink.click();	
		
		//Verify email_id field is displayed and enabled.
		WebElement email_field = wDriver.findElement(By.id("email"));
		assertTrue(email_field.isEnabled());
		assertTrue(email_field.isDisplayed());
	}

	@When("I Enter Invalid emailid")
	public void i_Enter_Invalid_emailid() {
		WebElement  emailid_filed = wDriver.findElement(By.id("email"));
		WebElement  password_filed = wDriver.findElement(By.id("pass"));
		emailid_filed.sendKeys("ab@abc.com");
		password_filed.sendKeys("abc.com");		
	}

	@When("Click SignIn_Button")
	public void click_SignIn_Button() {
		WebElement SignIn_Button = wDriver.findElement(By.xpath("//*[@id='login-form']/div/button"));
		SignIn_Button.click();
	}

	@Then("Error Message should be displayed in the Page")
	public void error_Message_should_be_displayed_in_the_Page() {
		WebElement WarningMsgPanel = wDriver.findElement(By.xpath("//*[@id='matter']/div[2]/div/ul/li/ul/li/span"));
		assertTrue(WarningMsgPanel.isDisplayed());
	}
	
	@When("I Enter Invalid emailid and password")
	public void i_Enter_Invalid_emailid_and_password(DataTable dtUsers) {
		WebElement  emailid_filed = wDriver.findElement(By.id("email"));
/*		WebElement  password_filed = wDriver.findElement(By.id("pass"));
		for(Map<String, String> data : dtUsers.asMaps(String.class, String.class)){
			//usercredentials.asMaps(String.class, String.class)){
			emailid_filed.sendKeys(data.get("Username")); 
			password_filed.sendKeys(data.get("Password"));
			 //driver.findElement(By.id("login")).click();
			 }
	*/	
	}
}
