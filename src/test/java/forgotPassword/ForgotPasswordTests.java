package forgotPassword;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.EmailSentPage;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void checkSentEmail(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.fillEmailField("rodrigo.camini@gmail.com");
         EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
         assertTrue(emailSentPage.getEmailText()
         .contains("You will recived a email message"),
         "Alert text is incorrect");
    }
    
}
