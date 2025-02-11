# Automated Testing Project with Selenium

## Overview
This project is part of a free Test Automation University course led by Angie Jones. It focuses on implementing automated tests with Selenium WebDriver, using the Page Object Model (POM) and TestNG to ensure structured and maintainable test automation.

## Features
- Automated UI tests using **Selenium WebDriver**.
- Test execution managed with **TestNG**.
- Page Object Model (POM) for maintainability.

## Project Structure
```
project-root
 ├── src
 │   ├── main
 │   │   ├── java
 │   │   │   ├── pages            # Page Object Model classes
 │   │   │   ├── utils            # Utility classes (waits, listeners, etc.)
 │   │   │   └── BasePage.java    # Common methods for all pages
 │   ├── test
 │   │   ├── java
 │   │   │   ├── tests            # Test cases
 │   │   │   └── BaseTests.java   # Base test setup
 ├── pom.xml                      # Maven dependencies
 ├── README.md                     # Project documentation
 └── CHANGES_DURING_COURSE.md       # Course modifications log
```


## Setup Instructions
### Prerequisites
- Java 11 or later
- Maven installed (`mvn -version` to check)
- ChromeDriver installed and set in the system path

### Installation
1. Clone this repository:
   ```
   git clone https://github.com/your-repo.git](https://github.com/rodrigo-camini/selenium-webdriver-e2e-test.javaScript.git
   ```
Navigate to the project directory:
```
cd project-root
```
Install dependencies:
```
mvn clean install
```

## Development Setup
This project is developed using **Visual Studio Code** with the following recommended extensions:

- **Java Extension Pack** (for Java development)
- **JavaDoc Generator** (to simplify documentation with JavaDoc)

Running the Tests

Using Maven

Run all tests with:
```
mvn test
```

Run a specific test class:
```
mvn -Dtest=DropdownTests test
```

Using TestNG
Run tests using TestNG XML configuration:

```
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml
```

Running Tests via UI

It is also possible to execute tests via the UI. When accessing a test class in Visual Studio Code or another compatible IDE, you can click on the Run/Play button next to the test method to execute it directly. This provides a quick and easy way to run individual test cases without needing to use the command line.
