package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class column1datadriven5 {
	WebDriver driver;
	@Test(dataProvider="username")

	public void columndatadriven(String username,String useremail,String userpassword,String conformpassword) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/column-1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_pass")).sendKeys(userpassword);
		driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		driver.findElement(By.cssSelector("#user-registration-form-47 > form > div.ur-button-container > button")).click();

	}
@AfterTest
	public void datadriven1(){
	   driver.close();
}
@DataProvider(name="username")
	public Object[][] datadriven2() {
		return new Object[][] {
			{"anju pp","anjudass@gmai.com","#09870987#","#09870987#"},
			{"hariii","harridas@gmail.com","#567567#","#567567#"},
			{"varunnn","varundas@gmail.com","#678678#","#678678#"}

		// TODO Auto-generated method stub

	};

}
}
