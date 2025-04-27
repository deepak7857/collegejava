# Project Overview

This project encompasses a variety of Java applications and utility classes designed for different purposes, including unit conversions, employee management, and data structure implementations. Here's a detailed breakdown of each component:

## 1. Converter Application (`curr.java`)

This application serves as a versatile command-line tool for performing conversions across three different domains: currency, distance, and time. It's structured around a main menu that allows users to select the type of conversion they want to perform.

### Core Functionality:

-   **Main Menu**: Presents options to choose between currency, distance, and time conversions, or to exit the application.
-   **Input Handling**: Uses the `Scanner` class to take user input for choices and values to be converted.
-   **Conversion Logic**: Delegates the actual conversion tasks to separate utility classes within their respective packages.

### Packages and Classes:

-   **`currency` Package**:
    -   `CurrencyConverter.java`: Contains static methods for converting between different currencies (Dollar, Euro, Yen, and INR). Conversions include Dollar to INR, Euro to INR, Yen to INR, and vice versa.
-   **`distance` Package**:
    -   `DistanceConverter.java`: Provides static methods for converting between distance units (Meters, Kilometers, and Miles). Conversions include Meter to KM, Miles to KM, and vice versa.
-   **`time` Package**:
    -   `TimeConverter.java`: Includes static methods for converting between time units (Hours, Minutes, and Seconds). Conversions include Hours to Minutes, Hours to Seconds, and vice versa.

### Usage:

1.  Run the `curr.java` file.
2.  Select a conversion category from the main menu (1 for Currency, 2 for Distance, 3 for Time, 0 to Exit).
3.  Follow the prompts to select a specific conversion type within the chosen category.
4.  Enter the amount/distance/time you wish to convert.
5.  The application will display the converted value.

## 2. Employee Application (`EmployeeApp` Directory)

This application simulates a basic employee management system focused on generating pay slips for different types of employees. It demonstrates inheritance and polymorphism.

### Core Functionality:

-   **Employee Hierarchy**: Defines a class hierarchy with a base `Employee` class and subclasses representing different employee roles.
-   **Pay Slip Generation**: Each employee type has its own logic for calculating salary and generating pay slips.
-   **Data Input**: Takes employee details as input to create employee objects and generate pay slips.

### Classes:

-   **`Employee.java`**:
    -   Base class for all employees.
    -   Contains common attributes like `name`, `employeeId`, `address`, and `contactNumber`.
    -   May include methods for basic employee information management.
-   **Role-Specific Subclasses (`Programmer.java`, `AssistantProfessor.java`, `AssociateProfessor.java`, `Professor.java`)**:
    -   Inherit from the `Employee` class.
    -   Include additional attributes specific to each role (e.g., programming languages for programmers, academic qualifications for professors).
    -   Override methods to implement role-specific pay slip generation logic.
-   **`Main.java`**:
    -   The main entry point of the application.
    -   Collects employee details via user input.
    -   Creates instances of the appropriate employee subclass based on the provided information.
    -   Calls the pay slip generation method for the employee object.
    -   Displays the generated pay slip.

### Usage:

1.  Navigate to the `EmployeeApp` directory.
2.  Compile and run the `Main.java` file.
3.  Follow the prompts to enter employee details, including their role.
4.  The application will generate and display the pay slip for the employee.

## 3. Electricity Bill Generator (`ElectricityBillGenrate.java`)

This application calculates and displays electricity bills based on consumer information and energy consumption.

### Core Functionality:

-   **Bill Calculation**: Calculates the electricity bill amount based on the number of units consumed and the connection type (domestic or commercial).
-   **Tariff Structure**: Applies different tariff rates based on the connection type and consumption slabs.
-   **Bill Display**: Presents a formatted electricity bill with consumer details and the calculated amount.

### Classes:

-   **`ElectricityBill.java`**:
    -   Represents an electricity bill.
    -   Attributes include `consumerNumber`, `consumerName`, `previousReading`, `currentReading`, and `connectionType`.
    -   The `calculateBill()` method calculates the bill amount based on the connection type and units consumed.
    -   The `displayBill()` method formats and prints the bill details.
-   **`ElectricityBillGenrate.java`**:
    -   The main entry point of the application.
    -   Collects consumer details and meter readings via user input.
    -   Creates an `ElectricityBill` object.
    -   Calls the `displayBill()` method to display the generated bill.

### Usage:

1.  Run the `ElectricityBillGenrate.java` file.
2.  Enter the required consumer details and meter readings when prompted.
3.  The application will calculate and display the electricity bill.

## 4. Stack Implementation (`StackMain.java`)

This file demonstrates a basic stack data structure implemented using an array.

### Core Functionality:

-   **Stack Operations**: Implements the fundamental stack operations: `push`, `pop`, `peek`, `isEmpty`, and `isFull`.
-   **Exception Handling**: Includes exception handling for stack overflow and underflow conditions.

### Classes:

-   **`StackADT`**:
    -   An interface defining the contract for a stack data structure.
    -   Declares the methods `push`, `pop`, `peek`, `isEmpty`, and `isFull`.
-   **`StackArray`**:
    -   Implements the `StackADT` interface using an array as the underlying data storage.
    -   Maintains a `top` index to track the top of the stack.
    -   Implements the stack operations, ensuring proper handling of stack overflow and underflow conditions.
-   **`StackMain`**:
    -   Contains the `main` method to demonstrate the usage of the `StackArray` class.
    -   Creates a `StackArray` object.
    -   Performs push and pop operations.
    -   Handles exceptions that may occur during stack operations.

### Usage:

1.  Run the `StackMain.java` file.
2.  The `main` method demonstrates the basic stack operations, including pushing elements onto the stack, popping elements off the stack, and peeking at the top element.
3.  The output will show the results of these operations and any exceptions that occur.