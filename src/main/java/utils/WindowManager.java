package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    
    private WebDriver driver;
    //To make this simple we will create a navigate object to use for others methods like Forward, Refreshing so on.
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        //Then we will not called like this
        //driver.navigate().back();
        //We will called like this:
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();

        System.out.println("Number of open tabs: " + windows.size());

        System.out.println("Windows handles: ");
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());

            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void switchToNewTab(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }

}
