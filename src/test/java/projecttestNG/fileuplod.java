package projecttestNG;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileuplod {
	@Test

	public void clas1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win64\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/file-upload-form/");
		driver.manage().window().maximize();
        WebElement fileInput = driver.findElement(By.cssSelector("#ur_file_1641275829"));

        // Provide the file path to be uploaded
        String filePath = "C:\\Users\\Admin\\Downloads\\Grammar.pdf";

        // Use sendKeys() method to focus on the file input element
        fileInput.sendKeys("");

        // Call the method to handle file upload dialog
        uploadFile(filePath);

        // Optionally, you can add some delay to see the result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }

    public static void uploadFile(String fileLocation) {
        try {
            // Create object of Robot class
            Robot robot = new Robot();

            // Set clipboard with file location
            StringSelection stringSelection = new StringSelection(fileLocation);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

            // Paste the file location using Robot
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Press Enter key to confirm file upload
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//Make sure to replace "path_to_chromedriver" with the actual path to your 

	}


