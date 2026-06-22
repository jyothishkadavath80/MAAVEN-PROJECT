package projecttestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class multistepdatadiven15 {
	WebDriver driver;
	

	@Test(dataProvider="username")

	public void multystepdatadiven(String username,String useremail,String password,String conformpassword,String firstname,String lastname,String website,String phonenumber,String year,String month,String displayname,String textarea ){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/multi-step-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("user_confirm_password")).sendKeys(conformpassword);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-107\"]/form/div[8]/button[2]")).click();
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("user_url")).sendKeys(website);
		driver.findElement(By.id("radio_1569440596_Male")).click();
		driver.findElement(By.name("phone_1569440626")).sendKeys(phonenumber);
		
		driver.findElement(By.xpath("//*[@id=\"date_box_1569440641_field\"]/span/input[1]")).click();
		//driver.findElement(By.cssSelector("#date_box_1569440641_field > span > input.ur-flatpickr-field.regular-text.without_icon.flatpickr-input.active")).click();        
        WebElement yearDropdown = driver.findElement(By.xpath("//div[@class='numInputWrapper']//input")); 
        yearDropdown.click();
        WebElement yearValue = driver.findElement(By.xpath("//div[@class='numInputWrapper']//input")); 
        yearValue.sendKeys(year);
       
        WebElement monthDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")); 
       monthDropdown.sendKeys(month); 
        
       WebElement dateElement = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[26]")); 
       dateElement.sendKeys("21");
       dateElement.click();
       
       WebElement countryDropdown=driver.findElement(By.id("country_1569440636"));
       Select select=new Select(countryDropdown);
        select.selectByVisibleText("India"); 
        WebElement selectedOption=select.getFirstSelectedOption();
        Assert.assertEquals(selectedOption.getText(), "India","Selected country should be India");
      // WebElement countryDropdown = driver.findElement(By.xpath("//*[@id=\"country_1569440636\"]"));
       //Select selectCountry = new Select(countryDropdown);
       //selectCountry.selectByValue("India");
   driver.findElement(By.xpath("//*[@id=\"user-registration-form-107\"]/form/div[8]/button[2]")).click();
   
   driver.findElement(By.id("display_name")).sendKeys(displayname);
   driver.findElement(By.id("textarea_1569440681")).sendKeys(textarea);
   
   WebElement fileInput = driver.findElement(By.id("ur_file_1569440793"));
fileInput.click();
   // Provide the file path to be uploaded
   String filePath = "C:\\Users\\Admin\\Downloads\\Grammar.pdf";

   // Click on the file input element to open the file upload dialog
   fileInput.click();

   // Call the method to handle file upload dialog
  // uploadFile(filePath);


   
  // WebElement fileInput = driver.findElement(By.id("ur_file_1569440793"));
//fileInput.click();
   // Provide the file path to be uploaded
   //String filePath = "C:\\Users\\Admin\\Downloads\\Grammar.pdf";

   // Create a File instance for the file to be uploaded
   //File file = new File(filePath);

   // Enter the file path into the file input element
  // fileInput.sendKeys(file.getAbsolutePath());
   
  // WebElement uploadButton = driver.findElement(By.id("ur_file_1569440793"));
  // uploadButton.click();

   // Wait for the file dialog to appear (adjust this wait time as necessary)
   

   
  // String filePath = "C:\\Users\\Admin\\Downloads\\Grammar.pdf";
   
  // WebElement fileInput = driver.findElement(By.id("ur_file_1569440793"));
  // fileInput.click();
   
   // Provide the path of the file to be uploaded
  // String filePath = "C:\\Users\\Admin\\Downloads\\Grammar.pdf";

  

   // Send the file path to the file input element
  //fileInput.sendKeys(filePath);

   //driver.findElement(By.cssSelector("#ur_file_1569440793 > div > svg")).click();
   driver.findElement(By.xpath("//*[@id=\"privacy_policy_1569440721\"]")).click();
  driver.findElement(By.xpath("//*[@id=\"user-registration-form-107\"]/form/div[8]/button[3]")).click();


        
	}
	@AfterTest
      public void datadriven1() {
    	  driver.close();
      }
	@DataProvider(name="username")
      public Object[][]datadriven2(){
    	  return new Object[][] {
    		  {"das","das@gmail.com","mnb098","mnb098","lio","das","https://chromewebstore.google.com/?hl=en","9186734520","1999","july","liodas","testing"},
    		  {"harold","harold@gmail.com","jkhj89","jkhj89","harold","https://chromewebstore.google.com/?hl=en","9078234451","april","harolddas","testing testing"}
    			 
    		  };
    	  }
      }

