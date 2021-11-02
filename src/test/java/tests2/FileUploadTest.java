package tests2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    @Test
    public void setFileUpload() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/upload");
        fileUploadPage.setFileUpload();
        Assert.assertEquals(fileUploadPage.checkDocumentOnPage(), "Допсоглашение 2-3279 Белстройсвязьдеталь плюс(1).docx");
    }
}
