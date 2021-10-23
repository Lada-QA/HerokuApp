package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Взять все элементы дроп-дауна и проверить их наличие.
 * Выбрать первый, проверить, что он выбран.
 * Выбрать второй, проверить, что он выбран
 * Локатор By.id("dropdown")
 */

public class HerokuAppDropdownTest {

    @Test
    public static void HerokuAppDropdownCheckElementsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement listOfDropDownElements = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
        Assert.assertEquals(listOfDropDownElements.getText(), "    Please select an option\n" +
                "    Option 1\n" +
                "    Option 2\n" +
                "  ");
        driver.quit();
    }

    @Test
    public void HerokuAppDropdownCheckOption1Test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        Actions action = new Actions(driver).contextClick(element).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ENTER).click();
        action.build().perform();
        Assert.assertTrue(element.isDisplayed());
        driver.quit();
    }

    @Test
    public void HerokuAppDropdownCheckOption2Test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement element = driver.findElement(By.id("dropdown"));
        Actions action2 = new Actions(driver).contextClick(element).sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click();
        action2.build().perform();
        Assert.assertTrue(element.isDisplayed());
        driver.quit();
    }
}
