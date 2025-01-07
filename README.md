# smTravel Project

## Overview
The `smTravel` project is a travel booking automation application designed to assist users in booking bus tickets. It offers several functionalities, including finding buses, selecting passenger details, printing tickets, and viewing seat availability and prices.

The project follows a modular architecture with pages for each of the main functionalities. It also integrates testing for these features through `TestNG`.

## Directory Structure
Below is the directory structure of the `smTravel` project:


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

### 1. Screenshot of FindABusPage:
![FindABusPage Screenshot](path/to/findabuspage_screenshot.png)

### 2. Screenshot of Passenger Details:
![Passenger Details Screenshot](path/to/passengerdts_screenshot.png)

### 3. Screenshot of Ticket Printing:
![Ticket Printing Screenshot](path/to/printticket_screenshot.png)

### 4. Screenshot of Seat and Price Page:
![Seat and Price Page Screenshot](path/to/sitandprice_screenshot.png)

## Dependencies
The project uses Maven for dependency management. Below is the basic configuration in `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.5.0</version>
        <scope>test</scope>
    </dependency>
    <!-- Other dependencies -->
</dependencies>



