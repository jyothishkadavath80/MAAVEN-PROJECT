package projecttestNG;

import javax.management.ObjectName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class donationdatadriven13 {
	WebDriver driver;
	@Test(dataProvider="useremail")

	public void donationdatadriven(String useremail,String userpassword) {
		// TODO Auto-generated method stub
		System.setProperty("wwebdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/donation-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_pass")).sendKeys(userpassword);
		
        WebElement slider = driver.findElement(By.name("range_1641272276"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, 60, 0).build().perform();
        
		driver.findElement(By.cssSelector("#user-registration-form-311 > form > div.ur-button-container > button")).click();						
	}
	@AfterTest
     public void datadriven() {
    	 driver.close();
     }
	@DataProvider(name="useremail")
     public Object [][] datadriven1(){
		return new Object[][] {
			{"vinu@gmail.com","qwer1234"},
			{"arun@gmail.com","asdf1234"},
			{"anu@gmail.com","zxcv1234"}
		};
	}
}
