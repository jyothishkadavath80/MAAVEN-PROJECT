package projecttestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class advancedformdatadriven4 {
	WebDriver driver;
	@Test (dataProvider="firstname")

	public void advancedform (String firstname,String lastname,String useremail,String website,String userpassword,String conformpassword,String textarea,String number,String inputbox) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/form-3/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_url")).sendKeys(website);
		driver.findElement(By.id("user_pass")).sendKeys(userpassword);
		driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		driver.findElement(By.xpath("//*[@id=\"check_box_1530100860_Choice1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1530100861_Male\"]")).click();
	
       WebElement countryDropdown=driver.findElement(By.id("country_1507714747"));
       
       Select select=new Select(countryDropdown);
       
        select.selectByVisibleText("India");
        
        WebElement selectedOption=select.getFirstSelectedOption();
        Assert.assertEquals(selectedOption.getText(), "India","Selected country should be India");
        
        driver.findElement(By.id("textarea_1507714757")).sendKeys(textarea);
        driver.findElement(By.id("number_box_1507716030")).sendKeys(number);
        
        WebElement dropdownElement = driver.findElement(By.id("select_1507714760"));

 
        Select dropdown = new Select(dropdownElement);

        dropdown.selectByVisibleText("Option 2");

        String selectedOption1 = dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption1, "Option 2", "Selected option is not Option 2");
  
        driver.findElement(By.id("input_box_1507714764")).sendKeys(inputbox);
        driver.findElement(By.cssSelector("#user-registration-form-20 > form > div.ur-button-container > button")).click();

        }
@AfterTest
	   public void datadriven1() {
		   driver.close();
       }
@DataProvider (name="firstname")
public Object[][] datadriven2() {
	  return new Object[][] {
		  {"vinu","raj","vinuraj@gmail.com","https://testmatick.com/","#$A1234567","#$A1234567","testing area","34","qwedsafg"},
		  {"anu","sonu","anusonu@gmail.com","https://testmatick.com/","#S09876554","#S0987654","TESTING AREA","55","asdfvcxz"}
	  
	
	  
	  };

}
}
