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

public class restricteddatadriven20 {
	WebDriver driver;
	@Test(dataProvider="email")

	public void restrictdatadriven(String email,String password,String firstname,String lastname,String age) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/restricted-registration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("radio_1623120379_Male")).click();
		//driver.findElement(By.xpath("(//div[@class='form-row validate-required user-registration-invalid user-registration-invalid-required-field']//input)[1]"));
		driver.findElement(By.id("number_box_1623120412")).sendKeys(age);

		 WebElement countryDropdown=driver.findElement(By.id("country_1629717450"));
	       
	       Select select=new Select(countryDropdown);
	       
	        select.selectByVisibleText("Cuba");
	        
	        WebElement selectedOption=select.getFirstSelectedOption();
	        Assert.assertEquals(selectedOption.getText(), "Cuba","Selected country should be Cuba");
	        driver.findElement(By.xpath("//*[@id=\"user-registration-form-304\"]/form/div[2]/button")).click();

	}
	@AfterTest
	public void datadriven1() {
	      driver.close();
	}
	@DataProvider(name="email")
	public Object[][]datadriven2(){
		return new Object[][] {
			{"vinu@gmail.com","#qwertyuiop#","vinu","raj","23"},
			{"anu@gmail.com","*asdfghjkl*","anu","subin","25"},
			{"subi@gmail.com","$zxcvbnm$","subi","anu","24"}
		};
	}

}
