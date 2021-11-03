package tests2;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTest {

    @Test
    public void contextMenu() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/context_menu");
        contextMenuPage.rightClickOnElement();
        Assert.assertEquals(contextMenuPage.getErrorValidationText(), "You selected a context menu");
    }

    @Test
    public void closeContextMenu() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/context_menu");
        contextMenuPage.rightClickOnElement();
        contextMenuPage.closeContextMenu();
        Assert.assertEquals(contextMenuPage.getTextFromPage(), "Context menu items are custom additions that appear in" +
                " the right-click menu.");
    }
}