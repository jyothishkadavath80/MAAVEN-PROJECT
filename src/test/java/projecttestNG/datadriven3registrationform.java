package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven3registrationform {
	WebDriver driver;
@Test( dataProvider="first name")
	public void demoregistration (String firstname,String lastname,String username,String email,String userpassword,String conformpassword,String userbio) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys( firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_pass")).sendKeys(userpassword);
		driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		driver.findElement(By.id("description")).sendKeys(userbio);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-105\"]/form/div[3]/button")).click();
		
	}
      public void datadriven1() {
    	  driver.close();
      }
      @DataProvider(name="first name")
      public Object[][]datadriven(){
    	  return new Object[][] {
    		  {"vijay","kadavath","vijay kadavath","vijaykadavath@gmail.com","12341234","12341234","testing"},
    		  {"amal","kadavath","amal kadavath","amalkadavath@gmail.com","43214321","43214321","testing testing"},
    		  {"jyothish","kadavath","jyothish kadavath","jyothishkadavath@gmail.com","58545854","58545854","testing testing testing"}
    	  };
      }
}
