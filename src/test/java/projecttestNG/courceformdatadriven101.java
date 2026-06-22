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

public class courceformdatadriven101 {
	WebDriver driver;
		@Test(dataProvider="firstname")

		public void courceregistration(String firstname,String lastname,String mailingaddress,String city,String state,String zipcode,String country,String phonenumber,String year,String month,String day,String emailaddress,String conformemail,String password,String conformpassword ) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.wpeverest.com/user-registration/course-registration-form/");
			driver.manage().window().maximize();
			driver.findElement(By.id("first_name")).sendKeys(firstname);
			driver.findElement(By.id("last_name")).sendKeys(lastname);
			driver.findElement(By.id("textarea_1623050614")).sendKeys(mailingaddress);
			driver.findElement(By.id("input_box_1623050696")).sendKeys(city);
			driver.findElement(By.id("input_box_1623050759")).sendKeys(state);
			driver.findElement(By.id("input_box_1623050879")).sendKeys(zipcode);
			
			 // WebElement countryDropdown=driver.findElement(By.xpath("//*[@id=\"country_1623050729\"]"));
		       
		       //Select select=new Select(countryDropdown);
		       // countryDropdown.sendKeys(country);
		        //select.selectByVisibleText(country);
		        
		        //WebElement selectedOption=select.getFirstSelectedOption();
		        //Assert.assertEquals(selectedOption.getText(), "India","Selected country should India");
		        
		        driver.findElement(By.xpath("//*[@id=\"phone_1623051660\"]/div/div/div/div[2]")).click();
		        driver.findElement(By.xpath("//*[@id=\"iti-0__item-lk\"]/span[1]")).click();
		      
		        WebElement phoneNumberField = driver.findElement(By.name("phone_1623051660"));
		       
		        String phoneNumber = phonenumber; 
		      phoneNumberField.sendKeys(phoneNumber);
		      
		         WebElement dateInputField =driver.findElement(By.xpath("//*[@id=\"date_box_1623051693_field\"]/span/input[1]"));
		        dateInputField.click();
                 WebElement yearDropdown = driver.findElement(By.xpath("//div[@class='numInputWrapper']//input")); 
		        yearDropdown.click();
		        WebElement yearValue = driver.findElement(By.xpath("//div[@class='numInputWrapper']//input")); 
		        yearValue.sendKeys(year);
		       
		        WebElement monthDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")); 
		       monthDropdown.sendKeys(month); 

		        WebElement dateElement = driver.findElement(By.cssSelector("body > div.flatpickr-calendar.animate.open.arrowBottom.arrowLeft > div.flatpickr-innerContainer > div > div.flatpickr-days > div")); 
		       dateElement.sendKeys(day);//div[@class='dayContainer']     ///html/body/div[5]/div[2]/div/div[2]/div
		       dateElement.click();   
		        driver.findElement(By.xpath("//*[@id=\"radio_1623051748_Male\"]")).click();
		        driver.findElement(By.id("user_email")).sendKeys(emailaddress);
		        driver.findElement(By.id("user_confirm_email")).sendKeys(conformemail);
		        driver.findElement(By.id("user_pass")).sendKeys(password);
		        driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		        
		        driver.findElement(By.xpath("//*[@id=\"user-registration-form-303\"]/form/div[7]/button")).click();
		         
		}
		@AfterTest

	public void datadriven1() {
			driver.close();
		
	}
		@DataProvider(name="firstname")
		public Object[][] datadriven2(){
			return new Object[][] {
		
			{"kunju","kunjava","kunjukunjava@gmail.com","zxcv","asdfg","1234567","india","1212123121","2000","may","5","kunjukunjava@gmail.com","kunjukunjava@gmail.com","81818181","81818181"},
//			{"kunjan","kunji","kunjankunji@gmail.com","mnbvcx","lkjhgf","09876542","canada","9876543210","1998","march","4","kunjankunji@gmail.com","kunjankunji@gmail.com","87658765","87658765"},
//			{"sonu","kunjava","sonukunjava@gmail.com","poiuytt","qwwerty","879045","india","9876231565","1999","november","9","sonukunjava@gmail.com","sonukunjava@gmal.com","45456787","45456787"}
	};

		}		
		
}