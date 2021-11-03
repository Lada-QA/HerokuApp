package tests2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.HashMap;


public class BaseTest {
    WebDriver driver;
    ContextMenuPage contextMenuPage;
    FramePage framePage;
    FileUploadPage fileUploadPage;
    DynamicControlsPage dynamicControlsPage;
    FileDownloadPage fileDownloadPage;

    @BeforeMethod
    public void initTest() {
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory", System.getProperty("user.dir"));
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
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
