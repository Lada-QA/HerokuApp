package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Взять все элементы дроп-дауна и проверить их наличие.
 * Выбрать первый, проверить, что он выбран.
 * Выбрать второй, проверить, что он выбран
 * Локатор By.id("dropdown")
 */

public class HerokuAppDropdownTest {

    @Test
    public static void herokuAppDropdownTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        List<WebElement> listOfElements = driver.findElements(By.xpath("//*[@id=\"dropdown\"]"));
        for (WebElement elements : listOfElements) {
            System.out.print(elements.getText());
        }
        WebElement element = driver.findElement(By.id("dropdown"));
        Actions action = new Actions(driver).contextClick(element).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER).click();
        action.build().perform();
        if(element.isEnabled()) {
            System.out.println("Yes");
        } else
            System.out.println("No");
        Actions action2 = new Actions(driver).contextClick(element).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click();
        action2.build().perform();
        if(element.isEnabled()) {
            System.out.println("Yes");
        } else
            System.out.println("No");
        driver.quit();
    }
}
