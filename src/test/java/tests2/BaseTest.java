package tests2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;


public class BaseTest {
    WebDriver driver;
    ContextMenuPage contextMenuPage;
    FramePage framePage;
    FileUploadPage fileUploadPage;
    DynamicControlsPage dynamicControlsPage;
    FileDownloadPage fileDownloadPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        contextMenuPage = new ContextMenuPage(driver);
        framePage = new FramePage(driver);
        fileUploadPage = new FileUploadPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        fileDownloadPage = new FileDownloadPage(driver);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
