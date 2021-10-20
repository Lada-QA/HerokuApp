package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

    public class HerokuAppCheckBoxesTest {

    @Test
    public void herokuAppCheckBoxesTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checked = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
        WebElement checked2 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
        if (checked.isSelected()) {
            System.out.println("Check");
        } else
            System.out.println("UnCheck");
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).click();
        if (checked.isSelected()) {
            System.out.println("Check");
        } else
            System.out.println("UnCheck");
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
        if (checked2.isSelected()) {
            System.out.println("Check");
        } else
            System.out.println("UnCheck");
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).click();
        if (checked2.isSelected()) {
            System.out.println("Check");
        } else
            System.out.println("UnCheck");

        driver.quit();
    }
}
