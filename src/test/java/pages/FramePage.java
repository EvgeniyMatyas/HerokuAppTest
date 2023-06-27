package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage extends BasePage{
    public static final By I_FRAME_BUTTON = By.xpath("//a[text()='iFrame']");
    public FramePage(WebDriver driver) {

        super(driver);
    }
    public void openAFrames(){
        driver.get(URL+"frames");
    }
    public void openAIFrame(){
        driver.findElement(I_FRAME_BUTTON).click();
    }
    public String getTextByFrame() {
        WebDriver frame = driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        return frame.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();

    }
}
