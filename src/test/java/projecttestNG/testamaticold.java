package projecttestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testamaticold {

	public class website {
		@BeforeTest
		public void maven() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64 (7)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.google.com/");
		WebElement element= driver.findElement(By.id("APjFqb"));
		element.sendKeys("mohanlal");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();

		}


		@Test
		public void maven1() throws InterruptedException{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64 (8)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testmatick.com/");
		driver.manage().window().maximize();

		WebElement element=driver.findElement(By.linkText("HOME"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		WebElement dropdownElementmenu = driver.findElement(By.xpath("//*[@id=\"menu-item-26483\"]/a/span"));
		    actions.moveToElement(dropdownElementmenu).perform();
		WebElement secdropdownElement = driver.findElement(By.xpath("//*[@id=\"menu-item-26663\"]/a/span"));
		secdropdownElement.click();
		
		driver.get("https://testmatick.com/");
		WebElement dropdownElementmenu2 = driver.findElement(By.xpath("//*[@id=\"menu-item-26346\"]/a"));
		actions=new Actions(driver);
		    actions.moveToElement(dropdownElementmenu2).perform();
		WebElement secdropdownElement2 = driver.findElement(By.xpath("//*[@id=\"menu-item-26359\"]/a/span"));
		secdropdownElement2.click();
		Thread.sleep(3000);

		driver.get("https://testmatick.com/");
		WebElement dropdownElementmenu3 = driver.findElement(By.linkText("HAPPY CLIENTS"));
		actions=new Actions(driver);
		    actions.moveToElement(dropdownElementmenu3).perform();
		WebElement secdropdownElement3 = driver.findElement(By.xpath("//*[@id=\"menu-item-26349\"]/a/span"));
		secdropdownElement3.click();
		Thread.sleep(3000);
		
		driver.get("https://testmatick.com/");
		driver.findElement(By.linkText("CASE STUDIES")).click();
		Thread.sleep(3000);
		
		driver.get("https://testmatick.com/");
		WebElement dropdownElementmenu5 = driver.findElement(By.linkText("KNOWLEDGE CENTER"));
		actions=new Actions(driver);
		    actions.moveToElement(dropdownElementmenu5).perform();
		WebElement secdropdownElement5 = driver.findElement(By.xpath("//*[@id=\"menu-item-26358\"]/a/span"));
		secdropdownElement5.click();
		Thread.sleep(3000);
		
		driver.get("https://testmatick.com/");
		WebElement dropdownElementmenu4 = driver.findElement(By.linkText("CONTACT US"));
		actions=new Actions(driver);
		    actions.moveToElement(dropdownElementmenu4).perform();
		WebElement secdropdownElement4 = driver.findElement(By.xpath("//*[@id=\"menu-item-26630\"]/a"));
		secdropdownElement4.click();
		Thread.sleep(3000);
		
		driver.get("https://testmatick.com/");
		WebElement dropdownElementmenu6 = driver.findElement(By.linkText("KNOWLEDGE CENTER"));
		actions=new Actions(driver);
		    actions.moveToElement(dropdownElementmenu6).perform();
		WebElement secdropdownElement6 = driver.findElement(By.xpath("//*[@id=\"menu-item-26358\"]/a/span"));
		secdropdownElement6.click();
		driver.close();
		
		}
		}}


