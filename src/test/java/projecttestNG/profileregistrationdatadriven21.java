package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class profileregistrationdatadriven21 {
	WebDriver driver;
	@Test( dataProvider="firstname")

	public void profiledatadriven(String firstname,String lastname,String displayname,String email,String username,String password) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/profile-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys(lastname);
		driver.findElement(By.xpath("//*[@id=\"display_name\"]")).sendKeys(displayname);
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-329\"]/form/div[3]/button")).click();

}
	@AfterTest
	public void datadriven1() {
		driver.close();
	}
	@DataProvider (name="firstname")
	public Object[][]datadriven2(){
		return new Object[][] {
			{"arun","prabaker","jorjutty","arunprabakar@gmail.com","arun prabakar","enne kollalle"}
		};
	}
	}
