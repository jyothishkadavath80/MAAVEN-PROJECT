package projecttestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class newdemositedrivenandexcel {
	WebDriver driver;
	String excelFilePath = "C:\\Users\\Admin\\Desktop\\newdemo.xlsx";
	@BeforeTest

	public void setup() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (10)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	@Test
	public void class1() throws InterruptedException{
		
		try {
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	    	Workbook workbook = new XSSFWorkbook(inputStream);
	    	Sheet sheet = workbook.getSheetAt(0);
	    	for (int i = 1; i <= sheet.getLastRowNum(); i++) {
	    		Row row = sheet.getRow(i);
	    		 String firstname= row.getCell(0).getStringCellValue();
	    		 String lastname= row.getCell(1).getStringCellValue();
	    		String email= row.getCell(2).getStringCellValue();
	       	 String password= row.getCell(3).getStringCellValue();
	       	 String conformpassword= row.getCell(4).getStringCellValue();	

		driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastname);
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys(conformpassword);
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
			
	    	}
	workbook.close();
	inputStream.close();
	} catch (IOException e) {
	e.printStackTrace();
	}
	// Close the browser
	//driver.quit();
	}
	@Test
	public void  demosite() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (10)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sureshramesh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Ram007sura");
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span")).click();
		
		driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
		driver.findElement(By.cssSelector("#search")).sendKeys("bags for men");
		driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/dl/dd[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span")).click();
		driver.findElement(By.linkText("Hoodies & Sweatshirts")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/div/div/a[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/div/div/a[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li/a")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li/a")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li/a")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[1]")).click();
		driver.navigate().refresh();
		driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[1]/div/a[2]/span/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div/div[1]/div[2]/div/div/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();	
	}
	@Test
	public void  demosite1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (10)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
		driver.findElement(By.id("email")).sendKeys("sureshramesh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Ram007sura");
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-id-8\"]/span")).click();
		driver.findElement(By.linkText("Women")).click();
		driver.findElement(By.linkText("Men")).click();
		driver.findElement(By.linkText("Gear")).click();
		driver.findElement(By.linkText("Training")).click();
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[1]/a[3]/span/span[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"wishlist-sidebar\"]/li[1]/div/div/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"wishlist-sidebar\"]/li/div/div/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
		driver.findElement(By.cssSelector("#reorder-validate-detail > div.actions-toolbar > div.secondary > a > span")).click();

	}
	@Test
public void  demosite2() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (10)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/training/training-video.html");
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys("sureshramesh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Ram007sura");
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		//Thread.sleep(3000);		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("My Orders")).click();
		driver.findElement(By.linkText("My Downloadable Products")).click();
		driver.findElement(By.linkText("My Wish List")).click();
		driver.findElement(By.linkText("Address Book")).click();
		driver.findElement(By.linkText("Account Information")).click();
		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[8]/a")).click();
		driver.findElement(By.linkText("My Product Reviews")).click();
		driver.findElement(By.xpath("//*[@id=\"reorder-item-30480\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"reorder-item-30479\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"reorder-validate-detail\"]/div[2]/div[1]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"reorder-validate-detail\"]/div[2]/div[2]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/div[2]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody[1]/tr[2]/td/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"item_7679\"]/div/strong/a")).click();
		driver.findElement(By.linkText("More Information")).click();
		driver.findElement(By.id("tab-label-reviews-title")).click();
				 
//driver.findElement(By.id("Rating_2_label")).click();
//		 List<WebElement> stars = driver.findElements(By.xpath("//*[@id=\"Rating_4_label\"]"));
//
//         // Click on the star to set the rating (e.g., 4 stars)
//         int rating = 4;
//         stars.get(rating - 1).click();
//
//         // Optionally, verify the rating was set correctly
//         for (int i = 0; i < rating; i++) {
//             if (!stars.get(i).getAttribute("class").contains("selected")) {
//                 throw new Exception("Star rating not set correctly");
//             }
//         }
//
//         System.out.println("Star rating set to " + rating);		
//		driver.findElement(By.id("summary_field")).sendKeys("dash digital watch");
//		driver.findElement(By.xpath("//*[@id=\"review_field\"]")).sendKeys("Good ");
//		driver.findElement(By.xpath("//*[@id=\"review-form\"]/div/div/button/span")).click();
}
	
	@Test
	public void demosite3() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (10)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://magento.softwaretestingboard.com/dash-digital-watch.html?qty=193");
		driver.findElement(By.xpath("//*[@id=\"tab-label-reviews-title\"]")).click();		
	

		  WebElement star5 = driver.findElement(By.xpath("//*[@id=\"Rating_1_label\"]"));

          // Optionally, wait until the element is visible and clickable
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(ExpectedConditions.visibilityOf(star5));
          wait.until(ExpectedConditions.elementToBeClickable(star5));

          // Hover over the element using Actions class
          Actions actions = new Actions(driver);
          actions.moveToElement(star5).perform();
          // Click the 5-star rating
          star5.click();
            
          driver.findElement(By.xpath("//*[@id=\"nickname_field\"]")).sendKeys("akshath");
         // Thread.sleep(3000);
          driver.findElement(By.id("summary_field")).sendKeys("dash digital watch");
  		driver.findElement(By.xpath("//*[@id=\"review_field\"]")).sendKeys("Good ");
  		driver.findElement(By.xpath("//*[@id=\"review-form\"]/div/div/button/span")).click();
  		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys("sureshramesh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Ram007sura");
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
	}
	}

//driver.findElement(By.xpath("//*[@id=\"sorter\"]")).click();
//driver.findElement(By.xpath("//*[@id=\"reorder-validate-detail\"]/div[2]/div[2]/a/span")).click();
//driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[1]/span")).click();
//driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/div[2]/div/a[1]/span")).click();
//driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.cart-container > div.cart-summary > ul > li > button > span")).click();
//driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li/button/span")).click();
//driver.findElement(By.cssSelector("#maincontent > div.columns > div > div.cart-container > div.cart-summary > ul > li > button > span")).click();
//driver.findElement(By.linkText("Proceed to Checkout")).click();	
//driver.findElement(By.id("maincontent")).click();
//driver.findElement(By.className("action primary checkout")).click();
//driver.findElement(By.partialLinkText("Proceed to Checkout")).click();


//address

//driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[4]/div/div/strong/a")).click();
//driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
//driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
//driver.findElement(By.name("firstname")).sendKeys("suresh");
//driver.findElement(By.name("lastname")).sendKeys("ramesh");
//driver.findElement(By.cssSelector("#EX3WC0Q")).sendKeys("ABC Company");
//driver.findElement(By.cssSelector("#LS9F5CX")).sendKeys("chemmrakatoor street address");
//driver.findElement(By.cssSelector("#RLM8AVO")).sendKeys("Bangalour city");
//driver.findElement(By.xpath("//*[@id=\"A6MQL3O\"]")).click();
//driver.findElement(By.xpath("//*[@id=\"checkout-step-shipping\"]/div[2]/button/span")).click();
//driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")).click();
//driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")).click();
//Thread.sleep(3000);



