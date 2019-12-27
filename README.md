# Java Selenium cucumber-framework


1. This framework contains Selenium code to drive the browser and test the web application.
2. Uses a Maven project structure and written in Java.
3. Tests are written in Gherkin and are stored in feature files.
4. The framework utilizes the Page Object pattern.
5. Cucumber report is used for reporting
6. junit is used to run and annotate the tests.

# Pre-requisites
- Java
- Maven
- Eclipse
- Eclipse Plugins
  - Maven 
  - Cucumber
  
# Setting up ShoppingAutomation
- Install Java and set path.
- Install Maven and set path.
- Clone respective repository or download zip.
	- maven : https://github.com/vijayaprakash1407/ShoppingAutomation.git

# Running features
- Goto project directory.
- Use "mvn test" command to run features.
- Use mvn test -Dcucumber.options="classpath:features/register.feature" to run specific feature if you have multiple feature files.

