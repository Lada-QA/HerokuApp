package tests2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownloadTest extends BaseTest {
    @Test
    public void downloadFile() {
        fileDownloadPage.openPage();
        fileDownloadPage.downloadElementByIndex(2);
        fileDownloadPage.getExpectedLastFileName();
        Assert.assertEquals(fileDownloadPage.getExpectedLastFileName(), "logo.jpg");
    }
}
