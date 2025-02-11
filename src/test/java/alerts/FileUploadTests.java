package alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUplaod();
        uploadPage.uploadFile("C:\\Users\\PC\\Documents\\test-automation-university-e2e-teste.slenium\\src\\main\\resources\\chromedriver.exe");

        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Upload files incorrect");
    }
    
}
