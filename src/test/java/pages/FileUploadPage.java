package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;

import java.io.File;

public class FileUploadPage extends BasePage{
    public static final By SELECT_FILE_BUTTON = By.id("file-upload");
    public static final By UPLOAD_BUTTON = By.id("file-submit");
    public FileUploadPage(WebDriver driver) {

        super(driver);
    }
    public void openFileUploader(){
        driver.get(URL+"upload");
    }
    public void downloadFile(){
        File file = new File("src/test/resources/i.webp");
        driver.findElement(SELECT_FILE_BUTTON).sendKeys(file.getAbsolutePath());
        driver.findElement(UPLOAD_BUTTON).click();
    }
    public  String getTextFileUploader(){
        return driver.findElement(By.id("uploaded-files")).getText();
    }
}
