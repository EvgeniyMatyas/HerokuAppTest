package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.DynamicControlsPage;
import pages.FileUploadPage;
import pages.FramePage;


import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    FramePage framePage;
    ContextMenuPage contextMenuPage;
    FileUploadPage fileUploadPage;
    DynamicControlsPage dynamicControlsPage;


    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
//        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        framePage = new FramePage(driver);
        contextMenuPage = new ContextMenuPage(driver);
        fileUploadPage = new FileUploadPage((driver));
        dynamicControlsPage = new DynamicControlsPage(driver);




    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){

        driver.quit();
    }
}

