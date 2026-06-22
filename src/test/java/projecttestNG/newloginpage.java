package projecttestNG;

import java.io.FileInputStream;
import java.io.IOException;
//import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;


public class newloginpage {
	WebDriver driver;
	String excelFilePath = "C:\\Users\\Admin\\Desktop\\data.xlsx";
	@BeforeTest
	
    public void setup() {
        // Set up WebDriver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();   
    }
	@Test
	public void cls1() throws InterruptedException {
	try {
	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	Workbook workbook = new XSSFWorkbook(inputStream);
	Sheet sheet = workbook.getSheetAt(0);
	for (int i = 1; i <= sheet.getLastRowNum(); i++) {
		Row row = sheet.getRow(i);
	// Get data from the current row
	String user= row.getCell(0).getStringCellValue();
	String pass = row.getCell(1).getStringCellValue();
	
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(user);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	Thread.sleep(3000);
	}
	workbook.close();
	inputStream.close();
	} catch (IOException e) {
	e.printStackTrace();
	}
	// Close the browser
	driver.quit();
	}
	}




	