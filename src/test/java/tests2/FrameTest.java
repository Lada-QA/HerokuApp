package tests2;


import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

    @Test
    public void getFrameText() {
    contextMenuPage.openPage("http://the-internet.herokuapp.com/iframe");
    Assert.assertEquals(framePage.checkTextInFrame("Your content goes here."), "Your content goes here.");
    framePage.exitFrame();
    }
}
