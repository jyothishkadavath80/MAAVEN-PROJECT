package projecttestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class column3datadriven8 {
	WebDriver driver;
	@Test (dataProvider="useremail")

	public void columndatadriven3(String useremail,String username,String userpassword,String firstname,String lastname,String nickname,String website,String textarea,String date,String year,String month) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.wpeverest.com/user-registration/column-3/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_email")).sendKeys(useremail);
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(userpassword);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("nickname")).sendKeys(nickname);
		driver.findElement(By.id("user_url")).sendKeys(website);
		driver.findElement(By.id("textarea_1530101155")).sendKeys(textarea);
		
		driver.findElement(By.xpath("//*[@id=\"date_box_1530101157_field\"]/span/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input")).sendKeys(year);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")).sendKeys(month);
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[8]")).click(); 
        driver.findElement(By.xpath("//*[@id=\"user-registration-form-32\"]/form/div[4]/button")).click();

	}

@AfterClass
	public void datadriven1() {
	driver.close();	
	}
@DataProvider(name="useremail")
   public Object[][] datadriven(){
	return new Object[][] {
		{"sukuppp@gmail.com","sukum.ppp","000000","suku","poiuytr","mon","https://www.youtube.com/","testing","15","2021997","november"},
		{"jayanpp@gmail.com","jayank.pp","111111","jayan","ponnu","minnu","https://www.youtube.com/","testing","20","2021997","januvary"},
		{"harshu@gmail.com","harsha.pp","222222","harshu","vava","appu","https://www.youtube.com/","testing testing","25","2021998","may"}
		
		};
}
}
