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

    public void  uploadFileFromFolder() {
        driver.findElement(FILE_UPLOAD).sendKeys("C:\\Users\\100nout.by\\Downloads\\Допсоглашение 2-3279 Белстройсвязьдеталь плюс(1).docx");
        driver.findElement(BUTTON_UPLOAD).click();
    }

    public String getUploadedFileText() {
        return driver.findElement(DOCUMENT).getText();
    }
}
