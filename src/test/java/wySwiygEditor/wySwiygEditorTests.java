package wySwiygEditor;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;

public class wySwiygEditorTests extends BaseTests {


//The test below will fail, due to the message below that is being displayed on the TAU website
//"TinyMCE is in read-only mode because you have no more editor loads available this month. Please request that the admin."

    @Test
    public void typeOnFrameArea(){
        var wySwiygEditor = homePage.clickWysiwygEditor();
        //wySwiygEditor.closeAlertTemporaryText();
        wySwiygEditor.clearTextArea();

        String text1 = "Hello";
        String text2 = "World";

        wySwiygEditor.setTextArea(text1);
        wySwiygEditor.decreaseIndention();
        wySwiygEditor.setTextArea(text2);
        assertEquals(wySwiygEditor.getTextFromEditor(), text1+text2, "Text from editor is incorrect");
    }
    
}
