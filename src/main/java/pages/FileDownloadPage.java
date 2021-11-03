package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.List;


public class FileDownloadPage extends BasePage {
    public FileDownloadPage(WebDriver driver) {
        super(driver);
    }

    private static final String DOWNLOAD_FILES_URL = BASE_URL + "/download";

    public void openPage() {
        driver.get(DOWNLOAD_FILES_URL);
    }

    public List<WebElement> downloadFile() {
        return driver.findElements(By.xpath("//*[@class='example']/a"));
    }

    public void downloadElementByIndex(int index) {
        downloadFile().get(index).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public File getLatestFileFromDir() {
        File dir = new File(System.getProperty("user.dir"));
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            return null;
        }

        File lastModifiedFile = files[0];
        for (int i = 1; i < files.length; i++) {
            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                lastModifiedFile = files[i];
            }
        }
        return lastModifiedFile;
    }

    public String getExpectedLastFileName() {
        File getLatestFile = getLatestFileFromDir();
        String fileName = getLatestFile.getName();
        return fileName;
    }

}


