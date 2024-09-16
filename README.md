
# Employee Management System

## Overview

This Employee Management System is a Java-based application developed as part of CST8288 Lab 1 at Algonquin College. The system demonstrates the use of the Singleton, Builder, and Factory design patterns to manage different types of employees (e.g., full-time, part-time) efficiently in an organization. Key features include employee management, creation, and tracking, with a focus on object-oriented design principles.

For more details on the project requirements, you can access the lab document [here](CST8288_Lab1_F24.pdf).

## Project Structure

The project is organized into the following key components:

- **Employee**: Abstract class representing the base structure of an employee with properties such as ID, Name, Department, Role, Working Hours Per Week, and Salary. It includes abstract methods like `clockIn()`, `clockOut()`, and `trackWorkHours()`.
- **EmployeeManager**: Singleton class that manages the addition, removal, and retrieval of employees.
- **EmployeeBuilder**: Interface for the Builder pattern to construct various types of employees.
- **FullTimeEmployeeBuilder** and **PartTimeEmployeeBuilder**: Concrete builder classes for constructing full-time and part-time employees, respectively.
- **EmployeeDirector**: Director class responsible for constructing employees using a builder.
- **EmployeeFactory**: Factory class for creating employee instances based on the type (e.g., full-time or part-time).
- **FullTimeEmployee** and **PartTimeEmployee**: Concrete implementations of employee types.
- **EMS**: Main class that simulates the system, using the Builder and Factory patterns to create employees and manage them through `EmployeeManager`.

## Design Patterns Used

- **Singleton Pattern**: Implemented in `EmployeeManager` to ensure that only one instance of the employee manager exists in the system.
- **Builder Pattern**: Used in the `EmployeeBuilder` interface and its concrete implementations to flexibly construct employee objects.
- **Factory Pattern**: Implemented in the `EmployeeFactory` class to create different types of employees based on input.

## How to Run

1. Ensure that you have the Java Development Kit (JDK) installed on your system.
2. Clone this repository to your local machine.
3. Navigate to the project directory in your terminal.
4. Compile the Java files:

   ```bash
   javac *.java
   ```

5. Run the EMS class to simulate the system:

   ```bash
   java EMS
   ```

## Key Features

- Efficient employee object creation using the Builder pattern.
- Centralized employee management through the Singleton pattern.
- Flexible employee type creation via the Factory pattern.
- Extensible design allowing for the easy addition of new employee types.

## Contributing

This project is part of an academic assignment, so it is not open for direct contributions. However, feedback and suggestions are welcome.

## License

[MIT License](LICENSE).
