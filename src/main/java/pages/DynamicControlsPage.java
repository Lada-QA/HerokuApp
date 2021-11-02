package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlsPage extends BasePage {
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    private static final By FIND_CHECKBOX_CLICK = By.id("checkbox");
    private static final By CLICK_BUTTON_REMOVE = By.xpath("//*[contains (text(),'Remove')]//ancestor::*[@id='checkbox-example']/button");
    private static final By GET_MESSAGE_REMOVE = By.xpath("//p[@id='message']");
    private static final By FIND_INPUT = By.xpath("//input[@type='text']");
    private static final By CLICK_BUTTON_ENABLE = By.xpath("//*[contains (text(),'Enable')]//ancestor::*[@id='input-example']/button");
    private static final By GET_MESSAGE_ENABLE = By.xpath("//p[@id='message']");


    public void setFindCheckbox() {
        driver.findElement(FIND_CHECKBOX_CLICK).click();
    }

    public void setClickButtonRemove() {
        driver.findElement(CLICK_BUTTON_REMOVE).click();
        waitForElementLocated(GET_MESSAGE_REMOVE, 5);
    }

    public int isCheckboxDisplayed() {
        return driver.findElements(FIND_CHECKBOX_CLICK).size();
    }

    public boolean isInputDisableEnable() {
        return driver.findElement(FIND_INPUT).isEnabled();
    }

    public void setClickButtonEnable() {
        driver.findElement(CLICK_BUTTON_ENABLE).click();
        waitForElementLocated(GET_MESSAGE_ENABLE, 5);
    }
}
