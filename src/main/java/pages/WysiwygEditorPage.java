package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorFrameId = "mce_0_ifr";
    //private By editorFrameId = By.id("mce_0_ifr"); 
    // The method frame(int) in the type WebDriver.TargetLocator is not applicable for the arguments (By)Java(67108979)
    private By textArea = By.id("tinymce");
    private By decreaseIdentButton = By.cssSelector("button[title='Increase indent']");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }
    
    private void switchToEditArea(){
        driver.switchTo().frame(editorFrameId);
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIdentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
