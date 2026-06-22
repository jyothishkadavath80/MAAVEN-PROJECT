package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class roundeddatadriven17 {
	WebDriver driver;
	@Test(dataProvider="username")

	public void rounderdatadriven(String username,String useremail,String password,String conformpassword) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.wpeverest.com/user-registration/rounded/");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-45\"]/form/div[2]/button")).click();

	}
	@AfterTest
         public void datadriven1() {
        	 driver.close();
         }
	@DataProvider(name="username")
	public Object[][] datadriven2(){
		return new Object[][] {
			{"manu","manu@gmail.com","78786565","78786565"},
			{"vinu","vinu@gmail.com","98980909","89890909"},
			{"anu","anu@gmail.com","21213454","21213454"}
		};
	}
}
