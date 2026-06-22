package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class date {
	@Test

	public void main() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (7)\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/date-and-time-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys("firstname");
		driver.findElement(By.id("last_name")).sendKeys("lastname");
		driver.findElement(By.id("user_email")).sendKeys("emailid");
		driver.findElement(By.id("user_pass")).sendKeys("password");
		
//		 WebElement dateInputField =driver.findElement(By.xpath("//*[@id=\"date_box_1623131781_field\"]/span/input[1]"));
//	        dateInputField.click();
//		WebElement dateElement = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[21]"));
//	        WebElement monthDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select"));
//	        WebElement yearValue = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input"));
//
//	        // Create Select instances for each dropdown
//	        Select selectDay = new Select(dateElement);
//	        Select selectMonth = new Select(monthDropdown);
//	        Select selectYear = new Select(yearValue);
//
//	        // Select the desired day, month, and year
//	        selectDay.selectByVisibleText("15");     // Select 15th day
//	        selectMonth.selectByVisibleText("August"); // Select August
//	        selectYear.selectByVisibleText("2022"); 
		
//		  WebElement dateInputField =driver.findElement(By.xpath("//*[@id=\"date_box_1623131781_field\"]/span/input[1]"));
//	        dateInputField.click();
//
//
//	        WebElement yearDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input")); 
//	        yearDropdown.click();
//	        WebElement yearValue = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input")); 
//	        yearValue.sendKeys(2004));
//	       
//	        WebElement monthDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")); 
//	       monthDropdown.sendKeys(month); 
//
          // driver.findElement(By.id("timepicker_1641276686")).click();
          // WebElement timeInput =driver.findElement(By.xpath("//*[@id=\"user-registration-form-336\"]/form/div[6]"));
           //timeInput.clear();
           //timeInput.sendKeys("10:00");
		
		WebElement dateInputField =driver.findElement(By.xpath("//*[@id=\"date_box_1623131781_field\"]/span/input[1]"));
        dateInputField.click();
        WebElement yearDropdown = driver.findElement(By.xpath("//div[@class='numInputWrapper']//input")); 
        yearDropdown.click();
		
		WebElement yearValue = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input"));
        yearValue.sendKeys("2020"); // Replace "2023" with the desired year

        // Find and select month
        WebElement monthDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText("June"); // Replace "June" with the desired month
       // WebElement daySelect = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div='" +22+ "']"));
        //daySelect.click();

        
        WebElement dateElement = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[1]")); 
	       dateElement.sendKeys("9");//div[@class='dayContainer']
	       dateElement.click();   


        // Find and select day
       // WebElement dayDropdown = driver.findElement(By.id("/html/body/div[5]/div[2]/div/div[2]/div"));
       // daySelect.selectByVisibleText("15"); // Replace "15" with the desired da
	       //driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button/span")).click();
			//driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")).click();
			//driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.cart-container > div.cart-summary > ul > li > button > span")).click();
			//driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")).click();

        
	}

	
		

}
