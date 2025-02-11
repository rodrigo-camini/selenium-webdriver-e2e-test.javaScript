Changes During the Course

This document contains the main modifications made during the course, including refactorings, improvements, and new approaches implemented.

Removal of Unnecessary Code

The main() method in the BaseTests class was removed because, with the introduction of TestNG, it is no longer needed.

// Before
public static void main(String[] args) {
    BaseTests test = new BaseTests();
    test.setUp();
}

Exercise 01: First Steps with WebDriver

The Exercise01.java class was created to:

Open the browser and maximize the window.

Count how many <a> links exist on the page.

Navigate to "Shifting Content" → "Example 1: Menu Element".

Count the number of menu items on the page.

public void setUp() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.manage().window().fullscreen();

    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println(links.size());
}

Improvements in Dropdown Tests

Refactoring in DropdownTests to avoid redundant code. Previously, the code was overly verbose and repetitive. Now, we use var to improve clarity.

var dropDownPage = homePage.clickDropDown();
String option = "Option 1"; 
dropDownPage.selectFromDropDown(option);
var selectedOptions = dropDownPage.getSelectedOptions();

assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
assertTrue(selectedOptions.contains(option), "Option not selected");

In DropdownPage, a helper method findDropDownElement() was created to avoid code duplication when interacting with the dropdown.

public void selectFromDropDown(String option){
    findDropDownElement().selectByVisibleText(option);
}

Additionally, the addMultipleAttribute() method was implemented to allow multiple selections via JavascriptExecutor.

public void addMultipleAttribute(){
    String script = "arguments[0].setAttribute('multiple','')";
    ((JavascriptExecutor)driver).executeScript(script, findDropDownElement());
}

Implementation of Wait Methods

To avoid Thread.sleep(), WebDriverWait was implemented in DynamicLoadingExample1Page, ensuring greater test stability.

public void clickStart(){
    driver.findElement(startButton).click();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.invisibilityOf(
        driver.findElement(loadingIndicator)
    ));
}

FluentWait was also added, allowing customization of wait times and ignoring specific exceptions.

FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
    .withTimeout(Duration.ofSeconds(5))
    .pollingEvery(Duration.ofSeconds(1))
    .ignoring(NoSuchElementException.class);

fluentWait.until(ExpectedConditions.invisibilityOf(
    driver.findElement(loadingIndicator)
));

Homepage Refactoring

Navigation was centralized in the clickLink(String linkText) method, avoiding the repetition of driver.findElement() in each click method.

public void clickLink(String linkText){
    driver.findElement(By.linkText(linkText)).click();
}

Now, methods like clickDropDown() use this approach:

public DropdownPage clickDropDown(){
    clickLink("Dropdown");
    return new DropdownPage(driver);
}

Implementation of WebDriverEventListener

The EventReporter.java class was created to capture WebDriver events and automatically log them. This improves debugging and allows tracking of which elements were found.

@Override
public void afterFindBy(By by, WebElement element, WebDriver driver) {
    String elementId = element.getAttribute("id");
    System.out.println("Element found: " + by.toString() + " | ID: " + (elementId != null ? elementId : "No ID"));
}

General Improvements

Various refactorings were made to improve code organization and make it more modular. Repetitive methods were extracted into helper functions, ensuring cleaner and easier-to-maintain code.

