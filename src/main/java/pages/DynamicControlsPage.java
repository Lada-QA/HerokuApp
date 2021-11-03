package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends BasePage {
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    private static final By CHECKBOX = By.id("checkbox");
    private static final By BUTTON_REMOVE = By.xpath("//*[contains (text(),'Remove')]//ancestor::*[@id='checkbox-example']/button");
    private static final By MESSAGE_REMOVE = By.xpath("//p[@id='message']");
    private static final By INPUT = By.xpath("//input[@type='text']");
    private static final By BUTTON_ENABLE = By.xpath("//*[contains (text(),'Enable')]//ancestor::*[@id='input-example']/button");
    private static final By MESSAGE_ENABLE = By.xpath("//p[@id='message']");


    public void setCheckbox() {
        driver.findElement(CHECKBOX).click();
    }

    public void setClickButtonRemove() {
        driver.findElement(BUTTON_REMOVE).click();
        waitForElementLocated(MESSAGE_REMOVE, 5);
    }

    public int isCheckboxDisplayed() {
        return driver.findElements(CHECKBOX).size();
    }

    public boolean isInputDisableEnable() {
        return driver.findElement(INPUT).isEnabled();
    }

    public void setClickButtonEnable() {
        driver.findElement(BUTTON_ENABLE).click();
        waitForElementLocated(MESSAGE_ENABLE, 5);
    }
}
