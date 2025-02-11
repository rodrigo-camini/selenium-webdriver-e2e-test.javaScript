Automated Testing Project with Selenium

Overview

This project implements automated tests using Selenium WebDriver to validate web application functionalities. The tests are structured following the Page Object Model (POM) and utilize TestNG as the test framework.

Features

Automated UI tests using Selenium WebDriver.

Test execution managed with TestNG.

Page Object Model (POM) for maintainability.

Modular test structure with reusable methods.

Project Structure

📦 project-root
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java
 ┃ ┃ ┃ ┣ 📂 pages            # Page Object Model classes
 ┃ ┃ ┃ ┣ 📂 utils            # Utility classes (waits, listeners, etc.)
 ┃ ┃ ┃ ┗ 📜 BasePage.java    # Common methods for all pages
 ┃ ┣ 📂 test
 ┃ ┃ ┣ 📂 java
 ┃ ┃ ┃ ┣ 📂 tests            # Test cases
 ┃ ┃ ┃ ┗ 📜 BaseTests.java   # Base test setup
 ┣ 📜 pom.xml                # Maven dependencies
 ┣ 📜 README.md              # Project documentation
 ┗ 📜 CHANGES_DURING_COURSE.md  # Course modifications log

Development Setup

This project is developed using Visual Studio Code with the following recommended extensions:

Java Extension Pack (for Java development)

JavaDoc Generator (to simplify documentation with JavaDoc)

Setup Instructions

Prerequisites

Java 11 or later

Maven installed (mvn -version to check)

ChromeDriver installed and set in the system path

Installation

Clone this repository:

git clone https://github.com/your-repo.git

Navigate to the project directory:

cd project-root

Install dependencies:

mvn clean install

Running the Tests

Using Maven

Run all tests with:

mvn test

Run a specific test class:

mvn -Dtest=DropdownTests test

Using TestNG

Run tests using TestNG XML configuration:

mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml

Key Implementations

Page Object Model (POM)

Contribution

Fork the repository.

Create a feature branch (git checkout -b feature-name).

Commit your changes (git commit -m 'Description of changes').

Push to the branch (git push origin feature-name).

Open a Pull Request.


