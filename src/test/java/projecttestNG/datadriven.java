package projecttestNG;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {
 
	WebDriver driver;
@Test(dataProvider="username")
               public void swaglabs(String username,String password) {
		// TODO Auto-generated method stub
            	   System.setProperty("webdrver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver-win64\\chromedriver.exe");
           		WebDriver driver=new ChromeDriver();
           		driver.get("https://www.saucedemo.com/v1/");
           		driver.manage().window().maximize();
           		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
           		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
           		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}
   @AfterClass 
   public void datadriven1() {
	   driver.close();
   }
  @DataProvider(name="username")
  public Object[][] datadriven2() {
	  return new Object[][] {
		  {"anjaydass","80248024"},
		  {"sreehari","963396"},
		  {"aattaamm","58545854"},
		  {"standard_user","secret_sauce"}
	  };
	  }
	  
	  }