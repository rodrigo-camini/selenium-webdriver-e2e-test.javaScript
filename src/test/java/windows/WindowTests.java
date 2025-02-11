package windows;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTests;

public class WindowTests extends BaseTests {
    
    @Test
    public void testWindowTabs(){
        var buttonPage = homePage.clickDynamicLoading().rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
