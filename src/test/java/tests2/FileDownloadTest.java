package tests2;

import org.testng.annotations.Test;

public class FileDownloadTest extends BaseTest {
    @Test
    public void downloadFile() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/download");
        fileDownloadPage.downloadFile();
    }
}
//TODO:скачать скачала, а проверить наличие не понимаю как, пробовала разные способы что нашала, но не идёт
