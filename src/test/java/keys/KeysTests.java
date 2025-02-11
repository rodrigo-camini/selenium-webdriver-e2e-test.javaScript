package keys;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import base.BaseTests;

public class KeysTests extends BaseTests{

    @Test
    public void testBackspace(){
        var KeyPage = homePage.clickKeyPresses();
        KeyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(KeyPage.getResult(), "You entered: BACK_SPACE");
    }

    //It doesnt work so well. 
    @Test
    public void testBeta() throws InterruptedException{
        var KeyPage = homePage.clickKeyPresses();
        KeyPage.enterBeta();
    }
    
}
