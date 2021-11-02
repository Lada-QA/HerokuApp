package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    private static final By RIGHT_CLICK_ON_ELEMENT = By.cssSelector("#hot-spot");

    public void setRightClickOnElement() {
        WebElement link = driver.findElement(RIGHT_CLICK_ON_ELEMENT);
        actions.contextClick(link).perform();
    }

    public String getErrorValidationText() {
        waitForContextLoaded();
        return driver.switchTo().alert().getText();
    }

    public void closeContextMenu() {
        driver.switchTo().alert().accept();
    }
}
