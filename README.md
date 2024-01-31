
Framework Documentation:

Table of Contents:

Introduction
Framework Components
POM Classes and Modules
Test Scripts
Test Data
Screen Shots
Extent Report
XML Files
pom.xml
Conclusion
1. Introduction
This document provides a comprehensive overview of the test automation framework designed for the Vtiger CRM Application. The framework follows industry best practices and leverages Selenium WebDriver, TestNG, and other technologies to ensure efficient and maintainable automated testing.

2. Framework Components
The framework consists of the following key components:

Generic Utility: Utility classes containing reusable functions for handling common tasks, such as interacting with databases, working with Excel files, logging, etc.

POM Repository (Page Object Model): A collection of POM classes, each corresponding to a specific module in the Vtiger CRM application. These classes encapsulate the locators and methods related to the corresponding web pages.

Test Scripts: Automation scripts written in TestNG that leverage the methods defined in the POM classes to execute test scenarios.

Test Data: Externalized test data stored in Excel sheets. The framework utilizes this data for parameterization, allowing for easy modifications and data-driven testing.

Screen Shots: Utility to capture screenshots during test execution, aiding in debugging and documentation.

Extent Report: Integration with Extent Reports for generating detailed and visually appealing test reports.

XML Files: Configuration files specifying the test execution flow for different scenarios (e.g., Smoke Testing, Regression Testing).

pom.xml: Maven Project Object Model file containing project configuration details, dependencies, and build settings.

3. POM Classes and Modules
The framework is organized into modules, each represented by a Page Object Model (POM) class. The following is a list of modules and their corresponding POM classes:

Login Module

POM Class: LoginPage
Description: Contains elements and methods related to the login functionality.
Leads Module

POM Class: LeadsPage
Description: Includes elements and methods specific to managing leads.
Organizations Module

POM Class: OrganizationPage
Description: Handles interactions with the Organizations module.
Products Module

POM Class: ProductsPage
Description: Manages elements and methods for the Products module.
Contacts Module

POM Class: ContactsPage
Description: Handles interactions related to contacts.
Opportunities Module

POM Class: OpportunitiesPage
Description: Manages opportunities in the Opportunities module.
Campaign Module

POM Class: CampaignPage
Description: Interacts with the Campaign module.
Vendors Module

POM Class: VendorsPage
Description: Handles Vendors module interactions.
4. Test Scripts
Test scripts are written using TestNG and are designed to interact with the POM classes, invoking methods to perform actions on the application and validate expected outcomes.

5. Test Data
Test data is stored in external Excel sheets, facilitating easy maintenance and data-driven testing. Each module has its dedicated sheet within the Excel file.

Example Excel File: vtigerTestData.xlsx

6. Screen Shots
A utility captures screenshots during test execution. Screenshots are stored in a specified directory for debugging and documentation purposes.

7. Extent Report
The framework integrates with Extent Reports to generate detailed and visually appealing test reports. These reports provide a comprehensive overview of test execution results.

8. XML Files
Configuration XML files (e.g., SmokeTesting.xml, RegressionTesting.xml) specify the test execution flow for different scenarios. They define which test scripts to run and with what parameters.

9. pom.xml
The pom.xml file contains Maven project configuration details, dependencies, and build settings. It ensures consistency in the build process and facilitates easy dependency management.

10. Conclusion
The Vtiger CRM test automation framework provides a robust and scalable solution for testing various modules within the application. It adheres to industry best practices, ensuring maintainability, scalability, and ease of use. The framework's modular structure allows for easy integration of new modules and straightforward maintenance of existing ones.

This documentation serves as a comprehensive guide for understanding the framework's architecture, components, and usage. It is recommended to follow the outlined conventions and practices when contributing to or maintaining the framework. Regular updates to this documentation are encouraged to reflect any changes or enhancements made to the framework.
