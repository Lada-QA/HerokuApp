package tests2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {
    @Test
    public void controlCheckboxForDynamics() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/dynamic_controls");
        dynamicControlsPage.setCheckbox();
        dynamicControlsPage.setClickButtonRemove();
        Assert.assertTrue(dynamicControlsPage.isCheckboxDisplayed() < 1);
    }

    @Test
    public void controlInputDisable() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/dynamic_controls");
        Assert.assertFalse(dynamicControlsPage.isInputDisableEnable());
    }

    @Test
    public void controlInputEnable() {
        contextMenuPage.openPage("http://the-internet.herokuapp.com/dynamic_controls");
        dynamicControlsPage.setClickButtonEnable();
        Assert.assertTrue(dynamicControlsPage.isInputDisableEnable());

    }
}
