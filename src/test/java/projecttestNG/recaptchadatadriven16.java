package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class recaptchadatadriven16 {
	WebDriver driver;
	@Test(dataProvider="firstname")

	public void recaptchadatadriven(String firstname,String lastname,String useremail,String password,String displayname,String phonenumber) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\Chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://demo.wpeverest.com/user-registration/recaptcha-registration-form/");
       driver.manage().window().maximize();
       driver.findElement(By.id("first_name")).sendKeys(firstname);
       driver.findElement(By.id("last_name")).sendKeys(lastname);
       driver.findElement(By.id("user_email")).sendKeys(useremail);
       driver.findElement(By.id("user_pass")).sendKeys(password);
       driver.findElement(By.id("display_name")).sendKeys(displayname);
       driver.findElement(By.name("phone_1623134125")).sendKeys(phonenumber);
      // driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border")).click();
       
       WebElement checkbox = driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border"));

       // Perform actions using Actions class to simulate human-like interaction
       Actions actions = new Actions(driver);
       actions.moveToElement(checkbox).click().build().perform();
       
       driver.findElement(By.xpath("//*[@id=\"user-registration-form-306\"]/form/div[3]/button")).click();
       
	}@AfterTest
   public void datadriven1() {
	   driver.close();
   }
	@DataProvider(name="firstname")
	public Object[][] datadriven2(){
		return new Object[][] {
			{"lio","das","liodas@gmail.com","90909090","liodas","9078563412"},
//			{"harold","das","harolddas@gmail.com","89089078","harolddas","9078456321"},
//			{"arun","das","arundas@gmail.com","8756432198","arundas","2234576890"}
//			
		};
	}
}
	
