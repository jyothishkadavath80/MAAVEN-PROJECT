package projecttestNG;

import java.sql.Driver;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven2 {
	WebDriver driver;
	@Test(dataProvider="rohith")

	public void parabank(String rohith,String sharmahit,String sathyamangalam,String mattupetty,String gujarath,String J,String GH,String ABCDEFG,String hitmansharma,String K,String abc ){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
   		driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=FC31E36C0DDFBD04CD3A9BE043D11444");
   		driver.manage().window().maximize();
   		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
   		driver.findElement(By.id("customer.firstName")).sendKeys(rohith);
   		driver.findElement(By.id("customer.lastName")).sendKeys(sharmahit);
   		driver.findElement(By.id("customer.address.street")).sendKeys(sathyamangalam);
   		driver.findElement(By.id("customer.address.city")).sendKeys(mattupetty);
   		driver.findElement(By.id("customer.address.state")).sendKeys(gujarath);
   		driver.findElement(By.id("customer.address.zipCode")).sendKeys(J);
   		driver.findElement(By.id("customer.phoneNumber")).sendKeys(GH);
   		driver.findElement(By.id("customer.ssn")).sendKeys(ABCDEFG);
   		driver.findElement(By.id("customer.username")).sendKeys(hitmansharma);
   		driver.findElement(By.id("customer.password")).sendKeys(K);
   		driver.findElement(By.id("repeatedPassword")).sendKeys(abc);
   		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
  
	}
	@AfterClass
	public void datadriven1(){
		driver.close();
	}
   @DataProvider(name="rohith")
   public Object[][] datadriven(){
	   return new Object[][] {
		   {"arjun","sharma","goa","thirur","rajas","3456","0987654","asdfghj","lfggakkuakvb","asdfg","asdfg"},
		   {"guru","shishya","annan","thambi","asw","jsw","hsw","jkl","hello","hai","hai"},
		   {"rohith","viny","kgr","kgf","jk","123","345","789","0987","hiii","hiii"}
		// TODO Auto-generated method stub

	};

}}
