package projecttestNG;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testngdemo1 {
	private static final WebElement secdropdownElement = null;

	@Test

	public void web() {
		// TODO Auto-generated method stub
		System.setProperty("webdrver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testmatick.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		WebElement dropdownElement= driver.findElement(By.xpath("//*[@id=\"mobile_menu\"]/ul/li[2]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdownElement).perform();
		WebElement secdropElement =driver.findElement(By.xpath("//*[@id=\"mobile_menu\"]/ul/li[1]/a"));
	    secdropdownElement.click();

	    
//        WebElement element= driver.findElement(By.xpath("//*[@id=\"mobile_menu\"]/ul/li[1]/a/span"));
//
//        // Create an instance of Actions class
//        Actions actions = new Actions(driver);
//
//        // Move to the element and perform the hover action
//        actions.moveToElement(element).perform();


	}

}
