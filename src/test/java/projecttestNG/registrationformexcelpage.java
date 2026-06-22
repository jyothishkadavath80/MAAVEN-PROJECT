package projecttestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class registrationformexcelpage {
	WebDriver driver;
	String excelFilePath = "C:\\Users\\Admin\\Desktop\\column.xlsx";
    @BeforeTest
	  
	public void setup() {
		// TODO Auto-generated method stub
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

    	String email= row.getCell(1).getStringCellValue();
    	 String firstname= row.getCell(2).getStringCellValue();
    	 String username= row.getCell(3).getStringCellValue();
    	 int password=(int) row.getCell(4).getNumericCellValue();
    	 int conformpassword=(int) row.getCell(5).getNumericCellValue();
    	 String userbio= row.getCell(6).getStringCellValue();
    	 String lastname= row.getCell(7).getStringCellValue();
    	 
        

    	driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");

    	driver.manage().window().maximize();

    	driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_email")).sendKeys(email);
		driver.findElement(By.id("user_pass")).sendKeys(String.valueOf(password));
		driver.findElement(By.id("user_confirm_password")).sendKeys(String.valueOf(conformpassword));
		driver.findElement(By.id("description")).sendKeys(userbio);
		driver.findElement(By.xpath("//*[@id=\"user-registration-form-105\"]/form/div[3]/button")).click();


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


