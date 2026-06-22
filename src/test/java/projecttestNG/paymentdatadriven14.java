package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class paymentdatadriven14 {
	WebDriver driver;
	@Test(dataProvider="useremail")

	public void paymentdatadriven(String useremail,String userpassword) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/payment-with-stripe-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_pass")).sendKeys(userpassword);
		driver.findElement(By.id("multiple_choice_1641271687_LED Monitor")).click();
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-351\"]/form/div[2]/button")).click();
		}
	@AfterTest
      public void datadriven() {
    	  driver.close();
      }
	@DataProvider(name="useremail")
	public Object[][] datadriven1(){
	return new Object[][] {
		{"jyothi@gmail.com","98jk76ty"},
		{"aadhi@gmail.com","67er45df"}
	};
		
	}
	}


