package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.bouncycastle.crypto.tls.ContentType.alert;

public class ContextMenuPage extends BasePage{
    public static final By HOT_SPOT = By.id("hot-spot");
    public ContextMenuPage(WebDriver driver) {

        super(driver);
    }
    public void openContextMenu(){
        driver.get(URL+"context_menu");
    }
    public void rightClickOnAnElement(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(HOT_SPOT)).build().perform();
    }
    public String getText(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
    public void alertAccept(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }



}
