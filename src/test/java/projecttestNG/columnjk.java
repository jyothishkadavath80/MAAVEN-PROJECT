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

import com.google.common.collect.Table.Cell;

public class columnjk {
	WebDriver driver;
    String excelFilePath = "C:\\Users\\Admin\\Desktop\\column.xlsx";

    @BeforeTest
    public void setup() {
        // Set up WebDriver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\msedgedriver.exe");
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
                String useremail = row.getCell(0).getStringCellValue();
                String username = row.getCell(1).getStringCellValue();
                int userpassword = (int) row.getCell(2).getNumericCellValue();
                String firstname = row.getCell(3).getStringCellValue();
                String lastname = row.getCell(4).getStringCellValue();
                String nickname = row.getCell(5).getStringCellValue();
                String website = row.getCell(6).getStringCellValue();
                String textarea = row.getCell(7).getStringCellValue();

                driver.get("https://demo.wpeverest.com/user-registration/column-3/");
                driver.manage().window().maximize();

                driver.findElement(By.id("user_email")).sendKeys(useremail);
                driver.findElement(By.id("user_login")).sendKeys(username);
                driver.findElement(By.id("user_pass")).sendKeys(String.valueOf(userpassword));
                driver.findElement(By.id("first_name")).sendKeys(firstname);
                driver.findElement(By.id("last_name")).sendKeys(lastname);
                driver.findElement(By.id("nickname")).sendKeys(nickname);
                driver.findElement(By.id("user_url")).sendKeys(website);
                driver.findElement(By.id("textarea_1530101155")).sendKeys(textarea);

                // Assuming there's a submit button with id "submit_button"
                driver.findElement(By.xpath("//*[@id=\"user-registration-form-32\"]/form/div[5]/button")).click();

                Thread.sleep(3000);

                // Check for successful registration message
                // This should be adjusted according to the actual message/element on the site
                boolean isRegistered = driver.findElements(By.id("success_message")).size() > 0;

                // Use fully qualified name for Cell to avoid type mismatch
                org.apache.poi.ss.usermodel.Cell resultCell = row.createCell(8); // Assuming column 8 is for result
                if (isRegistered) {
                    resultCell.setCellValue("Pass");
                } else {
                    resultCell.setCellValue("Fail");
                }
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