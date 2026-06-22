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

public class conditinalregistrdatadriven9 {
	
	WebDriver driver;
	@Test(dataProvider="testtttest")

	public void conditinaldatadriven(String phonenumber,String website,String email,String password) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/conditional-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"radio_1569481639_Supplier\"]")).click();
		driver.findElement(By.name("phone_1569482700")).sendKeys(phonenumber);
		driver.findElement(By.id("user_url")).sendKeys(website);
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		
		  WebElement countryDropdown=driver.findElement(By.id("country_1569483038"));
	        Select select=new Select(countryDropdown);
	        select.selectByVisibleText("Canada");
	         WebElement selectedOption=select.getFirstSelectedOption();
	        Assert.assertEquals(selectedOption.getText(), "Canada","Selected country should be Canada");
	        
	        driver.findElement(By.xpath("//*[@id=\"check_box_1569483464_Yes\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"user-registration-form-116\"]/form/div[5]/button")).click();
	        
	        		
		
	}
	@AfterTest
	public void datadriven(){
		driver.close();
		
	}
	@DataProvider(name="testtttest")
      public Object[][] datadriven1(){
    	  return new Object[][] {
    		  {"9876543201","https://www.youtube.com/","xavior@gmail.com","#*345627*#"},
    		  {"9876675445","https://www.saucedemo.com/v1/","asdfgh2@gmail.com","#*90908765"},
    		  {"9876454532","https://www.google.com/","zxcvbnm@gmail.com","#*890890*#"}
    	  };
      }
}
