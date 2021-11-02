package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FileDownloadPage extends BasePage {
    public FileDownloadPage(WebDriver driver) {
        super(driver);
    }

    private static final By CLICK_FILE_DOWNLOAD = By.xpath("//a[contains( text(), 'tcywgoc37u-1-1-2.pdf')]");

    public void downloadFile() {
        WebElement file = driver.findElement(CLICK_FILE_DOWNLOAD);
        file.click();
    }
}


