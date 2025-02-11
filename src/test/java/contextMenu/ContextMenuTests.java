package contextMenu;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;

public class ContextMenuTests extends BaseTests {

    @Test
    public void rightClickBox(){
        var contextMenuPage = homePage.clickContextMenu();

        contextMenuPage.rightClickInBox();
        String message = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Results text incorrect");
    }
    
}
