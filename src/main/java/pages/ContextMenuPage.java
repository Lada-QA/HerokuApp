package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    private static final By ELEMENT = By.cssSelector("#hot-spot");
    private static final By TEXT = By.xpath("//p[contains(text(),'Context menu items are custom ')]");

    public void rightClickOnElement() {
        WebElement link = driver.findElement(ELEMENT);
        actions.contextClick(link).perform();
    }

    public String getErrorValidationText() {
        waitForPageIsLoaded();
        return driver.switchTo().alert().getText();
    }

    public void closeContextMenu() {
        driver.switchTo().alert().accept();
    }

    public String getTextFromPage() {
     return driver.findElement(TEXT).getText();
    }
}
