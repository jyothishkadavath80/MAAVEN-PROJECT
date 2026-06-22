package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registrationformdatadriven18 {
	WebDriver driver;
	@Test(dataProvider="firstname")

	public void registrationform(String firstname,String lastname,String username,String email,String password,String conformpassword,String userbio){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		driver.findElement(By.id("description")).sendKeys(userbio);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-105\"]/form/div[3]/button")).click();

	}
	@AfterTest
   public void datadriven1() {
	   driver.close();
	   
   }
	@DataProvider(name="firstname")
	public Object[][] datadriven2(){
		return new Object[][] {
			{"naseem","mnm","naseem mnm","naseemmnm@gmail.com","uiouioio","uiouioio","treeeee"},
			{"arjyu","kaku","arjyukaku","arjyukaku@gmail.com","qwerqwer","qwerqwer","mango"},
			{"abhu","dabi","abudabi","abudabi@gmail.com","asdfasdf","asdfasdf","apple"}
			};
	}
}
