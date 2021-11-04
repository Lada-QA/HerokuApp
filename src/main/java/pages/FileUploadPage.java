package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    private static final By FILE_UPLOAD = By.xpath("//input[@id='file-upload']");
    private static final By BUTTON_UPLOAD = By.xpath("//input[@class='button']");
    private static final By DOCUMENT = By.xpath("//div[@id='uploaded-files']");

    public void  uploadFileFromFolder(String fileName) {
        driver.findElement(FILE_UPLOAD).sendKeys(fileName);
        driver.findElement(BUTTON_UPLOAD).click();
    }

    public String getUploadedFileText() {
        return driver.findElement(DOCUMENT).getText();
    }
}
