package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    private WebDriver driver;
    private By sentEmailText = By.id("content");

    public EmailSentPage (WebDriver driver){
        this.driver = driver;
    }

    public String getEmailText () {
        return driver.findElement(sentEmailText).getText();

    }
}
