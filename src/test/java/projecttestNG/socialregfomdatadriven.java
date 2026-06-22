package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class socialregfomdatadriven {
	WebDriver driver;
	@Test(dataProvider="firstname")

	public void socialregform(String firstname,String lastname,String email,String password,String username,String phonenumber) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/social-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.name("phone_1623133256")).sendKeys(phonenumber);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-305\"]/form/div[2]/button")).click();

	}
	@AfterTest
	public void datadriven1() {
		driver.close();
	}
	@DataProvider(name="firstname")
      public Object[][] datadriven2(){
    	  return new Object[][] {
    		  { "akshay","kumar","akshaykumar@gmail.com","nmkj9809","akshay kumar","8765897645"},
    		  {"vijay","kumar","vijaykumar@gmail.com","kluity6789","vijay kumar","9867452310"},
    		  {"abhishek","kumar","abhishekkumar@gmail.com","abhi8907","abhishek kumar","8905673421"}
      };
	}
	}
