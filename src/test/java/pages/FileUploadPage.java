package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;

import java.io.File;

public class FileUploadPage extends BasePage{
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }
    public void openFileUploader(){
        driver.get(URL+"upload");
    }
    public void downloadFile(){
        File file = new File("src/test/resources/i.webp");
        driver.findElement(By.id("file-upload")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
    }
    public  void equalsNames(){
        assertEquals(driver.findElement(By.id("uploaded-files")).getText(),"i.webp","Не верное название файла");
    }
}
