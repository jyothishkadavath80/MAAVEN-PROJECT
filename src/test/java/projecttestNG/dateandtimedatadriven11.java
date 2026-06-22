package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
public class dateandtimedatadriven11 {
	
    

	@Test

	public void dateandtimedatadriven() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/date-and-time-form/");
		driver.manage().window().maximize();
		driver.findElement(By.id("first_name")).sendKeys("firstname");
		driver.findElement(By.id("last_name")).sendKeys("lastname");
		driver.findElement(By.id("user_email")).sendKeys("emailid");
		driver.findElement(By.id("user_pass")).sendKeys("password");
		
		 WebElement dayDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[21]"));
	        WebElement monthDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select"));
	        WebElement yearDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input"));

	        // Create Select instances for each dropdown
	        Select selectDay = new Select(dayDropdown);
	        Select selectMonth = new Select(monthDropdown);
	        Select selectYear = new Select(yearDropdown);

	        // Select the desired day, month, and year
	        selectDay.selectByVisibleText("15");     // Select 15th day
	        selectMonth.selectByVisibleText("August"); // Select August
	        selectYear.selectByVisibleText("2022");  // Select 2024 year
//	}
//	public dateandtimedatadriven11(WebDriver driver) {
//		this.driver = driver;
//        this.calendarLocator = By.xpath("//*[@id=\"date_box_1623131781_field\"]/span/input[1]"); // Replace with your locator strategy
//        this.previousYearButton  = By.xpath("/html/body/div[5]/div[1]/div/div/div/input");
//        this.monthDropdown  = By.xpath("//select[@name='month']"); // Modify xpath if needed
//        this.dayLocatorTemplate  = By.xpath("//td[@data-day='%s']"); // Template for day locator
//    
		 
//    public void navigateToPreviousYear(String targetYear) throws InterruptedException {
//        String currentYear = getCalendarYear();
//        while (Integer.parseInt(currentYear) > Integer.parseInt(targetYear)) {
//            driver.findElement(previousYearButton).click();
//            new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='calendar-year']"))); // Wait for year update
//            currentYear = getCalendarYear();
//        }
//    }
//
//    public void selectMonth(String monthName) {
//        try {
//            WebElement monthElement = driver.findElement(calendarLocator);
//            Select monthSelect = new Select(monthElement);
//            monthSelect.selectByVisibleText(monthName);
//        } catch (NoSuchElementException e) {
//            System.out.println("Month selection element not found.");
//        }
//    }
//
//    public void selectDay(String dayValue) {
//        driver.findElement(calendarLocator.formatted(dayValue)).click();
//    }
//
//    private String getCalendarYear() {
//        try {
//            WebElement yearElement = driver.findElement(By.xpath("//span[@class='calendar-year']"));
//            return yearElement.getText();
//        } catch (NoSuchElementException e) {
//            System.out.println("Year element not found in calendar.");
//            return null;
        //}
    //}
//}

//}

       // WebElement yearDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/span[2]")); 
        //yearDropdown.click();
        //WebElement yearValue = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input")); 
        //yearValue.sendKeys("2001");
       
        //WebElement monthDropdown = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")); 
       //monthDropdown.sendKeys("april"); 

        
       //WebElement dateElement = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[18]")); 
       //dateElement.sendKeys("3");
       //dateElement.click();

	        driver.findElement(By.id("radio_1623131945_yes")).click();   
	       
		driver.findElement(By.id("textarea_1623132039")).sendKeys("textarea");
        WebElement timeInput =driver.findElement(By.id("timepicker_1641276686"));
        //timeInput.clear();
        timeInput.sendKeys("10:00");
	}}