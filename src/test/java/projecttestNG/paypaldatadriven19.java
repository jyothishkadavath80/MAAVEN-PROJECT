package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class paypaldatadriven19 {
	WebDriver driver;
	@Test(dataProvider="useremail")

	public void paypaldatadriven(String useremail,String password){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-310\"]/form/div[2]/button")).click();

	}
	@AfterTest
	public void datadriven() {
		driver.close();	
	}
	@DataProvider(name="useremail")
public Object[][] datadriven1(){
		return new Object[][] {
			{"brothers@gmail.com","90546789"},
			{"sisterss@gmail.com","12435643"}
		};
	}
}
