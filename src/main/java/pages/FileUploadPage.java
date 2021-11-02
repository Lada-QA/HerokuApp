package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    private static final By FILE_UPLOAD = By.xpath("//input[@id='file-upload']");
    private static final By CLICK_BUTTON_UPLOAD = By.xpath("//input[@class='button']");
    private static final By CHECK_DOCUMENT_ON_PAGE = By.xpath("//div[@id='uploaded-files']");

    public void setFileUpload() {
        driver.findElement(FILE_UPLOAD).sendKeys("C:\\Users\\100nout.by\\Downloads\\Допсоглашение 2-3279 Белстройсвязьдеталь плюс(1).docx");
        driver.findElement(CLICK_BUTTON_UPLOAD).click();
    }

    public String checkDocumentOnPage() {
        return driver.findElement(CHECK_DOCUMENT_ON_PAGE).getText();
    }
}
