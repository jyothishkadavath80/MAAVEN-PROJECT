package projecttestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class column1excel {
	WebDriver driver;
    String excelFilePath = "C:\\Users\\Admin\\Desktop\\column1.xlsx";

    @BeforeTest
    public void setup() {
        // Set up WebDriver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @Test
    public void cls1() throws InterruptedException {
        FileInputStream inputStream = null;
        Workbook workbook = null;

        try {
            inputStream = new FileInputStream(new File(excelFilePath));
            workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                // Get data from the current row
                String username = row.getCell(0).getStringCellValue();
                String useremail = row.getCell(1).getStringCellValue();
                int userpassword = (int) row.getCell(2).getNumericCellValue();
                int conformpassword = (int) row.getCell(3).getNumericCellValue();

                driver.get("https://demo.wpeverest.com/user-registration/column-1/");
                driver.manage().window().maximize();

                driver.findElement(By.id("user_login")).sendKeys(username);
                driver.findElement(By.id("user_email")).sendKeys(useremail);
                driver.findElement(By.id("user_pass")).sendKeys(String.valueOf(userpassword));
                driver.findElement(By.id("user_confirm_password")).sendKeys(String.valueOf(conformpassword));
                driver.findElement(By.cssSelector("#user-registration-form-47 > form > div.ur-button-container > button")).click();

                Thread.sleep(3000);

                // Check for successful registration message
                // Assuming the message has an id "success_message"
                boolean isRegistered = driver.findElements(By.id("success_message")).size() > 0;

                // Use fully qualified name for Cell to avoid type mismatch
                org.apache.poi.ss.usermodel.Cell resultCell = row.createCell(4); // Assuming column 8 is for result
                if (isRegistered) {
                    resultCell.setCellValue("Pass");
                } else {
                    resultCell.setCellValue("Fail");
                }
                System.out.println("Excel data updated");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }

                if (workbook != null) {
                    FileOutputStream outputStream = new FileOutputStream(new File(excelFilePath));
                    workbook.write(outputStream);
                    outputStream.close();
                    workbook.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}