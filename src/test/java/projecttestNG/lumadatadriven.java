package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class lumadatadriven {
	
@Test
	public void lumademo() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		WebElement dropdownElementmenu=driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]"));
		actions.moveToElement(dropdownElementmenu).perform();
		WebElement secdropdownElement=driver.findElement(By.xpath("//*[@id=\"ui-id-21\"]"));
		secdropdownElement.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement element=driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
//		Actions actions=new Actions(driver);
//		actions.moveToElement(element).perform();
//		WebElement dropdownElementmenu = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
//		    actions.moveToElement(dropdownElementmenu).perform();
//		WebElement secdropdownElement = driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]"));
//		secdropdownElement.click();
//		
	//	WebElement element=driver.findElement(By.xpath("//*[@id=\"tab-label-reviews-title\"]")).click();		
	
	}

}
