package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class HerokuAppTyposTest {

    @Test
    public void herokuAppTyposTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/typos");
        List<WebElement> text = driver.findElements(By.cssSelector("#content > div > p:nth-child(3)"));
        for (WebElement checkText : text) {
            Assert.assertEquals(checkText.getText(),
                    "Sometimes you'll see a typo, other times you won't.");
            driver.quit();
        }
    }
}
