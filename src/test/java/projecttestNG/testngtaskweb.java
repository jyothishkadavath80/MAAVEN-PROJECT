package projecttestNG;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngtaskweb {
	@Test

	public void web1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("APjFqb"));
		Thread.sleep(3000);
		element.sendKeys("spider man");
		element.sendKeys(Keys.ENTER);
		driver.close();

	}
	@Test
        public void web2() {
        	System.setProperty("webdrver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");
    		WebDriver driver=new ChromeDriver();
    		driver.get("https://testmatick.com/");
    		driver.manage().window().maximize();
    		//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
    		//WebElement element= driver.findElement(By.xpath("//*[@id=\"mobile_menu\"]/ul/li[2]/a"));
    		//Actions actions=new Actions(driver);
    		//actions.moveToElement(element).perform();
    		
    		driver.get("https://testmatick.com/contact-us/");
    		driver.findElement(By.xpath("//*[@id=\"nf-field-1\"]")).sendKeys("shahul naseem");
    	    driver.findElement(By.xpath("//*[@id=\"nf-field-2\"]")).sendKeys("shahulnaseem@gmail.com");
    		driver.findElement(By.id("nf-field-304")).sendKeys("7034703470");
    		driver.findElement(By.xpath("//*[@id=\"nf-field-3\"]")).sendKeys("testing testing");
    		driver.findElement(By.xpath("//*[@id=\"nf-field-4\"]")).click();
    		driver.navigate().back();
    		driver.get("https://testmatick.com/about-us/");
    		driver.navigate().back();
    		driver.get("https://testmatick.com/service-plans/");
    		driver.navigate().back();
    		driver.get("https://testmatick.com/careers/");
    		driver.navigate().back();
    		driver.get("https://testmatick.com/our-skills-expertise/");
    		driver.navigate().back();
    	    driver.get("https://blog.testmatick.com/");
    		driver.findElement(By.xpath("//*[@id=\"herald-module-0-0\"]/div/div/div/div/article[1]/header/span/a[2]")).click();
    		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/nav/a[2]")).click();
    		driver.navigate().back();
    		driver.get("https://testmatick.com/testmatick-as-qa-partner/");
    		driver.navigate().back();
    		driver.get("https://testmatick.com/why-outsource-qa/");
    		driver.findElement(By.xpath("//*[@id=\"post-26632\"]/div/div/div/div[3]/div[1]/div/div/a/span")).click();
    		driver.findElement(By.id("nf-field-222")).sendKeys("shahul naseem");
    		driver.findElement(By.id("nf-field-227")).sendKeys("ABCD Company");
    		driver.findElement(By.xpath("//*[@id=\"nf-field-223\"]")).sendKeys("shahulnaseem@gmail.com");
    		driver.findElement(By.xpath("//*[@id=\"nf-field-229\"]")).sendKeys("7034703470");
    		driver.findElement(By.xpath("//*[@id=\"nf-field-231\"]")).click();
    		driver.findElement(By.xpath("//*[@id=\"nf-field-230-2\"]")).click();
    		driver.findElement(By.xpath("//*[@id=\"nf-field-224\"]")).sendKeys("Requirements");
    		driver.findElement(By.xpath("//*[@id=\"nf-field-225\"]")).click();
    		driver.navigate().back();
    		driver.get("https://testmatick.com/why-outsource-qa/");
    		driver.findElement(By.xpath("//*[@id=\"post-26632\"]/div/div/div/div[5]/div[2]/div/div/a")).click();
    		driver.findElement(By.id("nf-field-287")).sendKeys("shahul naseem");
    		driver.findElement(By.id("nf-field-292")).sendKeys("ABCD Company");
    		driver.findElement(By.id("nf-field-288")).sendKeys("shahulnaseem@gmail.com");
    		driver.findElement(By.xpath("//*[@id=\"nf-field-293\"]")).click();
    		driver.findElement(By.id("nf-field-289")).sendKeys("A few words about your project and objectives");
    		driver.findElement(By.xpath("//*[@id=\"nf-field-290\"]")).click();
    		driver.get("https://testmatick.com/");
    		driver.get("https://testmatick.com/how-to-start/");
    		driver.navigate().back();
    		driver.get("https://testmatick.com/faq/");
    		driver.navigate().back();
    		driver.get("https://testmatick.com/testimonials/");
    		driver.navigate().back();
    		driver.get("https://testmatick.com/case-studies/");
    		driver.findElement(By.xpath("//*[@id=\"current_filter\"]")).click();

    		driver.findElement(By.xpath("//*[@id=\"filter_list\"]/li[1]/div")).click();
    		driver.navigate().refresh();
    		
    		//driver.findElement(By.xpath("//*[@id=\"filter_list\"]/li[3]/div")).click();
    		//driver.findElement(By.xpath("//*[@id=\"filter_list\"]/li[4]/div")).click();
    		//driver.findElement(By.xpath("//*[@id=\"filter_list\"]/li[5]/div")).click();
    		driver.get("https://testmatick.com/knowledge-center/");
    		driver.get("https://testmatick.com/knowledge-center/testing-materials/");
    		driver.get("https://testmatick.com/software-testing-tools/");
    		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[2]/div[1]/div/div[1]/div/a[1]")).click();
    		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[2]/div[1]/div/div[1]/div/a[3]")).click();
    		driver.get("https://testmatick.com/testing-glossary/");
    		driver.get("https://testmatick.com/sample-deliverables/");
    		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[2]/div[1]/div/div[1]/div/a[1]")).click();
    		driver.get("https://testmatick.com/");
    		driver.findElement(By.xpath("//*[@id=\"s\"]")).sendKeys("testing");
    		driver.findElement(By.xpath("//*[@id=\"subheader\"]/div/div[2]/div/form/button")).click();
    		driver.get("https://testmatick.com/");

        }
}
