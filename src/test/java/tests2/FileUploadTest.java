package tests2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    @Test
    public void setFileUpload() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/upload");
        fileUploadPage.uploadFileFromFolder("C:\\Users\\100nout.by\\Downloads\\logo.jpg");
        Assert.assertEquals(fileUploadPage.getUploadedFileText(), "logo.jpg");
    }
}
