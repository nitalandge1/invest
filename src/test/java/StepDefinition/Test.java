package StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Test {
	WebDriver driver;
	@Given("open browser")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhand\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		 driver=new ChromeDriver();
	    
	}

	@And("open App")
	public void open_app() {
		driver.get("https://kite.zerodha.com/");
		System.out.println("i am opening");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	}

	@When("User enter un and pwd")
	public void user_enter_un_and_pwd() {
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}


	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		String actID = driver.findElement(By.xpath("//span[text()='DPG458']")).getText();
		String expID="DPG458";
		Assert.assertEquals(actID, expID);
	}
}
