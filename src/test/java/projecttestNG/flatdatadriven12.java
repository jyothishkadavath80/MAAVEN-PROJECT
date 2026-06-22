package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class flatdatadriven12 {
	WebDriver driver;
	@Test(dataProvider="username")

	public void flatdatadriven(String username,String useremail,String userpassword,String conformpassword) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (7)\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/flat/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_email")).sendKeys(userpassword);
		driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-44\"]/form/div[2]/button")).click();

	}
	@AfterTest
      public void datadriven1() {
    	  driver.close();
      }
	@DataProvider( name="username")
	public Object[][] datadriven(){
    	  return new Object[][] {
    		  {"arundas","arundas@gmail.com","123456","123456"},
    		  {"VIJAYDAS","vijaydas@gmail.com","34567890","34567890"},
    		  {"vimaldas","vimaldas@gmail.com","0987654","0987654"}
    	  };
      }
}
