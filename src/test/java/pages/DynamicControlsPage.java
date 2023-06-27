package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicControlsPage extends BasePage{
    public static final By REMOVE_BUTTON = By.xpath("//button[@type='button' and text()='Remove']");

    public DynamicControlsPage(WebDriver driver) {

        super(driver);
    }
    public void openDynamicControls() {

        driver.get(URL + "dynamic_controls");
    }
    public void removeButton(){

        driver.findElement(REMOVE_BUTTON).click();
    }
    public void expectation(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
    }
    public void checkBox(){
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    }
    //todo


}
