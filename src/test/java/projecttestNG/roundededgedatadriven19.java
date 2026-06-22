package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class roundededgedatadriven19 {
	WebDriver driver;
	@Test(dataProvider="username")

	public void roundededgedatadriven(String username,String useremail,String password,String conformpassword) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/rounded-edge/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-46\"]/form/div[2]/button")).click();
		
	   

	}
	@AfterTest
	public void datadriven1() {
		driver.close();
		
	}
	@DataProvider(name="username")
	public Object[][]datadriven2(){
		return new Object[][] {
			//{"sura","sura@gmail.com","mnbvcxz","mnbvcxz"},
			//{"suku","suku@gmail.com","lkjhgfd","lkjhgfd"},
			{"sonu","sonu@gmail.com","poiuytrnm","poiuytrnm"}
		};
	}
}
