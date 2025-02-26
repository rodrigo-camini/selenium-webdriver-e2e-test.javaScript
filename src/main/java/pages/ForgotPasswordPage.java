package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrieveButton = By.id("form_submit");


    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillEmailField(String email){
        driver.findElement(emailField).sendKeys(email);

    }

    public EmailSentPage clickRetrievePasswordButton(){
        driver.findElement(retrieveButton).click();
        return new EmailSentPage(driver);
    }

}
