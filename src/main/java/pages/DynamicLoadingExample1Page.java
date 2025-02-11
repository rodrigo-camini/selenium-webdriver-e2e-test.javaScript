package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By finish = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
    }
    
    public void clickStart(){
        driver.findElement(startButton).click();

        //Let's see if we can find a condition to say, “wait until that loading element is no longer there”.
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(
            driver.findElement(loadingIndicator)
        ));

        //Fluent Waits give you a little bit more flexibility in how you create this WebDriver “wait” object.
        //In addition to indicating the timeout, you can also tell it how often it should poll. And then also you can specify any exceptions that you want it to ignore.

        // FluentWait fluentWait = new FluentWait(driver)
        // .withTimeout(Duration.ofSeconds(5))
        // .pollingEvery(Duration.ofSeconds(1))
        // .ignoring(NoSuchElementException.class);

        // fluentWait.until(ExpectedConditions.invisibilityOf(
        //     driver.findElement(loadingIndicator)
        // ));
    }

    public String getLoadedText(){
        return driver.findElement(finish).getText();
    }


}
