package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage extends BasePage{
    public FramePage(WebDriver driver) {
        super(driver);
    }
    public void openAFrames(){
        driver.get(URL+"frames");
    }
    public void openAIFrame(){
        driver.findElement(By.xpath("//a[text()='iFrame']")).click();
    }
    public String getTextByFrame() {
        WebDriver frame = driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        return frame.findElement(By.xpath("//body[@id='tinymce']")).getText();

    }
}
