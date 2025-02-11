package horizontalSlider;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;

public class HorizontalSliderTests extends BaseTests{

    @Test
    public void testSliderPointer() throws InterruptedException{
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue("4");
        assertEquals(sliderPage.getSliderValue(), value,  "Slider value is incorrect");
    }
    
}
