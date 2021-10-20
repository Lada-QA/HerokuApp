package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HerokuElementsTest {

    @Test
    public void herokuAddRemoveElementsTest (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addRemoveElements = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        addRemoveElements.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        addRemoveElements.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        addRemoveElements.findElement(By.xpath("//*[@onclick='deleteElement()']")).click();
        int count = addRemoveElements.findElements(By.xpath("//*[@onclick='deleteElement()']")).size();
        System.out.println(count);

        driver.quit();
    }
}
