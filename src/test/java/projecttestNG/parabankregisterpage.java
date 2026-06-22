package projecttestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import com.google.common.collect.Table.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class parabankregisterpage {
	WebDriver driver;
	 String excelFilePath = "C:\\Users\\Admin\\Documents\\parabankregister.xlsx";
	 
	 @BeforeTest
	public void parabank1() {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\Downloads\\msedgedriver.exe");
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
	      	                            
	           String firstname= row.getCell(0).getStringCellValue();
	           String lastname =row.getCell(1).getStringCellValue();
	           String  street=row.getCell(2).getStringCellValue();
	           String city=row.getCell(3).getStringCellValue();
	           String state =row.getCell(4).getStringCellValue();
	           int zipcode = (int) row.getCell(5).getNumericCellValue();   
	           int phonenumber=(int)row.getCell(6).getNumericCellValue();
	           int ssn=(int)row.getCell(7).getNumericCellValue();
	           String username =row.getCell(8).getStringCellValue();
	           int password=(int)row.getCell(9).getNumericCellValue();
	           int conformpassword=(int)row.getCell(10).getNumericCellValue();
	           	           
	           driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=8F1BE4666C6CFFD28BB6F9AFE28CD1D3");
	           driver.manage().window().maximize();
	           
	           driver.findElement(By.id("customer.firstName")).sendKeys(firstname);
	   		driver.findElement(By.id("customer.lastName")).sendKeys(lastname);
	   		driver.findElement(By.id("customer.address.street")).sendKeys(street);
	   		driver.findElement(By.id("customer.address.city")).sendKeys(city);
	   		driver.findElement(By.id("customer.address.state")).sendKeys(state);
	   		driver.findElement(By.id("customer.address.zipCode")).sendKeys(String.valueOf(zipcode));
	   		driver.findElement(By.id("customer.phoneNumber")).sendKeys(String.valueOf(phonenumber));
	   		driver.findElement(By.id("customer.ssn")).sendKeys(String.valueOf(ssn));
	   		driver.findElement(By.id("customer.username")).sendKeys(username);
	   		driver.findElement(By.id("customer.password")).sendKeys(String.valueOf(password));
	   		driver.findElement(By.id("repeatedPassword")).sendKeys(String.valueOf(conformpassword));

	}
	       FileOutputStream outputStream = new FileOutputStream(excelFilePath);
           workbook.write(outputStream);
	       workbook.close();
	       inputStream.close();
	       } catch (IOException e) {
	       e.printStackTrace();
	       }
	       driver.quit();
	       }
@AfterClass
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}
//public static void main(String[] args) {
//    ParabankRegisterPage test = new ParabankRegisterPage();
//    test.setUp();
//    try {
//        test.registerUsers();
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    } finally {
//        test.tearDown();
//    }
//}
}



