package tests2;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTest {

    @Test
    public void contextMenu() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/context_menu");
        contextMenuPage.setRightClickOnElement();
        Assert.assertEquals(contextMenuPage.getErrorValidationText(), "You selected a context menu");
    }

    @Test
    public void closeContextMenu() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/context_menu");
        contextMenuPage.setRightClickOnElement();
        contextMenuPage.closeContextMenu();
    }
}