package hover;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import base.BaseTests;

public class HoverTests extends BaseTests {
    
    @Test
    public void testHoverUser1(){

        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect"); 
        assertEquals(caption.GetLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");

    }
}
