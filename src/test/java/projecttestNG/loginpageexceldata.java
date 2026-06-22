package projecttestNG;

import java.io.FileInputStream;
import java.io.IOException;
//import java.sql.Driver;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook
public class loginpageexceldata {
		WebDriver driver;
		 String excelFilePath = "C:\\Users\\Admin\\Desktop\\DATADRIVEN.xlsx";
		@BeforeTest
		public void before() {
			 
       System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\Downloads\\msedgedriver.exe");
		        EdgeOptions option=new EdgeOptions();
		       option.addArguments("--disable-web-security");
		       option.addArguments("--allow-running-insecure-content");
		        driver = new EdgeDriver();
		}
		@Test
		public void cls1() throws InterruptedException {
        //System.setProperty("webdrver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver-win64\\chromedriver.exe");
   		//WebDriver driver=new ChromeDriver();
        try {
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);  
       for (int i = 1; i <= sheet.getLastRowNum(); i++) { 
    	   Row row = sheet.getRow(i);
           String user= row.getCell(0).getStringCellValue();
           String pass =row.getCell(1).getStringCellValue();
          driver.get("https://www.saucedemo.com/v1/");
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user);
      	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
      	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
      	 String extraInfo;
         // Add extra column based on condition
         String result;
       // Thread.sleep(3000);
        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/")) {
            System.out.println("Login failed for user: " + user);
            extraInfo = "Pass";
            result = "Pass";
        } else {
            System.out.println("Login succesful for user: " + user);
            extraInfo = "fail";
            result = "fail";
        }

        // Write extraInfo back to Excel
        Cell extraInfoCell = row.createCell(2); // Assuming third column for extra info
        extraInfoCell.setCellValue(result);
        }
        workbook.close();
         inputStream.close();
       } catch (IOException e) {
         e.printStackTrace();
          }
      	driver.quit();
		}
		}



