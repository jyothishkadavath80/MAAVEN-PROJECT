package projecttestNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class column2datadriven6 {
	WebDriver driver;
	@Test (dataProvider="username")

	public void column2datadriven(String useremail,String username,String firstname,String lastname,String userpassword,String conformpassword,String nickname,String website) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-2/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("user_pass")).sendKeys(userpassword);
		driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		driver.findElement(By.id("nickname")).sendKeys(nickname);
		driver.findElement(By.id("user_url")).sendKeys(website);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-16\"]/form/div[5]/button")).click();
		
				
	}
	@AfterTest
	public void datadriven1() {
		driver.close();
	
	}
	@DataProvider(name="username")
      public Object[][] datadriven() {
		return new Object[][]{
		{"arunap@gmail.com","nadeemmn .n","nadeem","manu","321241","321241","monu","https://www.youtube.com/"},
		{"naseem@gmail.com","naseem.nm","naseem","sdf","221122","221122","vava","https://www.youtube.com/"},
		{"navab@gmail.com","navab.pp","navab","thambi","887766","887766","ponnu","https://www.youtube.com/"}
};
}
}
