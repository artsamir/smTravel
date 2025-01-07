# smTravel Project

## Overview
The `smTravel` project is a travel booking automation application designed to assist users in booking bus tickets. It offers several functionalities, including finding buses, selecting passenger details, printing tickets, and viewing seat availability and prices.

The project follows a modular architecture with pages for each of the main functionalities. It also integrates testing for these features through `TestNG`.

## SM Travel Project TechStack

This document outlines the technology stack used in the **SM Travel Project**.

### Testing Frameworks

- **TestNG**: A testing framework designed for test configuration, prioritization, grouping, and parallel execution, making it easy to handle different kinds of testing scenarios.
- **Selenium**: A popular tool for automating web browsers, used for creating functional and regression tests for web applications.

### Programming Languages

- **Java**: The core programming language for implementing test cases and business logic, enabling efficient backend interaction and integration testing.

### Tools & Libraries

- **Maven**: For project management and building the application. It helps with dependency management and automating project build processes.
- **Git**: Version control system used to manage the codebase. It allows multiple developers to collaborate efficiently.

### Browser Automation

- **ChromeDriver**: A WebDriver for Chrome used in Selenium tests for automating interactions with Google Chrome.
- **FirefoxDriver**: Another WebDriver that can be used for Firefox browser automation with Selenium.


## Directory Structure
Below is the directory structure of the `smTravel` project:
![smtravel folder structure](https://github.com/user-attachments/assets/1622ae65-b229-4e66-8a56-528cdfed50d4)

## Pages Overview
### 1. FindABusPage.java
This page handles the functionality related to searching for buses. Users can enter their source and destination along with travel dates to find available buses.

### 2. PassengerDtsPage.java
This page collects the details of the passengers, such as names and number of seats.

### 3. PrintTicketPage.java
Once a booking is confirmed, the details are presented on this page, and a printable ticket is generated.

### 4. SitandPricePage.java
This page allows users to choose their seat preferences and view the pricing details.

## Test Directory Overview
- **TestBookATicket.java**: This test file includes automation scripts for booking a bus ticket.
- **baseTest.java**: A base test file for setting up common test configurations.
- **randomnumber.java**: A utility file for generating random numbers used in tests.

## Configuration
The project includes a `config.properties` file that holds various configuration settings used across the application.

---

## Screenshots

Below are some relevant screenshots from the project:

![image](https://github.com/artsamir/smTravel/assets/155747719/7073e053-17f1-4f64-93b3-6a1eea91e888)
![image](https://github.com/artsamir/smTravel/assets/155747719/43ac8b80-a861-404d-b003-1c53199e1ccd)
![image](https://github.com/artsamir/smTravel/assets/155747719/ff77d536-c047-490a-9b78-dfdb49c0bffa)

# Test Execution Status Report

## Test Execution Status

| **Test Case**              | **Status**    | **Description**                                                                 | **Execution Time** | **Notes**                             |
|----------------------------|---------------|---------------------------------------------------------------------------------|--------------------|---------------------------------------|
| `testsearchbus`             | ✅ Passed     | Tests the functionality of searching for a bus by selecting from and to stations, date, and clicking the search button. | [Time]             | No issues detected                   |
| `testSitandFeature`         | ✅ Passed     | Verifies the functionality of selecting seats, scrolling to view available seats, and choosing boarding and drop-off locations. | [Time]             | All interactions were successful      |
| `testPassengerDetsils`      | ✅ Passed     | Validates passenger details entry such as mobile number, name, email, age, gender, and acceptance of terms. | [Time]             | All fields entered correctly          |
| `testPrintTickets`          | ✅ Passed     | Verifies the printing of tickets by navigating back, accepting alerts, and retrieving PNR details. | [Time]             | Ticket details retrieved successfully |

---

## Summary of Test Execution:

| **Metric**                 | **Count**      |
|----------------------------|----------------|
| **Total Tests**             | 4              |
| **Passed**                  | 4              |
| **Failed**                  | 0              |
| **Skipped**                 | 0              |
| **Execution Status**        | ✅ All tests passed successfully!  |

---

## Execution Details:

- **Test Environment**: [Browser, OS Details]
- **Test Date**: [Execution Date]
- **Executed By**: [Your Name or Team]

---

## Conclusion:
All tests in this suite were executed successfully without any failures or skipped tests. The features for bus search, seat selection, passenger details entry, and ticket printing are working as expected.

---

### Attachments:
- [Log File / TestNG Report / Allure Report (if applicable)]


## Installation

To get started with smTravel, follow the steps below:

### Prerequisites

- **Java 11** or later
- **Maven** for project management
- **TestNG** for test execution

### Steps

1. **Clone the repository:**

    ```bash
    git clone https://github.com/artsamir/smTravel.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd smTravel
    ```

3. **Install dependencies using Maven:**

    ```bash
    mvn clean install
    ```

4. **Run the tests:**

    ```bash
    mvn test
    ```

   You can also configure TestNG settings and run tests in parallel for faster execution.

## How It Works

- The **Page Object Model (POM)** is implemented to separate the UI logic from test scripts. Each page has a corresponding page class, making the code easier to maintain and extend.
- **TestNG** handles test execution, parallelization, and generates comprehensive reports after each run.



