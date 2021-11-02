package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }

    private static final By FRAME_DOCUMENT = By.id("mce_0_ifr");
    private static final String GET_FRAME_TEXT = "tinymce";

    public String checkTextInFrame(String getText) {
        driver.switchTo().frame(driver.findElement(FRAME_DOCUMENT));
        return driver.findElement(By.id(String.format(GET_FRAME_TEXT, getText))).getText();
    }

    public void exitFrame() {
        driver.switchTo().defaultContent();
    }
}
