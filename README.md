# Atid Store Test Automation

This project automates the testing of the Atid store application using Selenium WebDriver and JUnit 5.

## Key Classes

- **`CreateDriverManager`**: Creates instances of `DriverManager` based on the specified browser.
- **`TestLifecycleManager`**: Manages WebDriver lifecycle, ensuring proper setup and teardown for tests.
- **`TestWatcherExtension`**: Logs test execution results and handles test events.
- **`TestBase`**: Base class for page objects, providing a common `WebDriver` instance.
- **Page Objects**: Classes like `Accessories`, `Checkout`, `HeaderLinks`, and `ShoppingBsket` represent specific pages and encapsulate interactions with their UI elements.
- **`DataReader`**: Reads JSON data for test input.
- **`RandomNumbers`**: Generates unique random numbers for product selection.
- **`Waiting`**: Contains methods for waiting on WebElements to be visible.

## SOLID Principles

1. **Single Responsibility Principle (SRP)**:
   - **Explanation**: A class should have one reason to change, meaning it should only have one responsibility.
   - **Usage**: Each class in the project is designed for a specific task (e.g., `TestWatcherExtension` handles logging, while `DataReader` focuses on data retrieval).

2. **Open/Closed Principle (OCP)**:
   - **Explanation**: Classes should be open for extension but closed for modification. New functionality should be added through new classes rather than altering existing ones.
   - **Usage**: `TestLifecycleManager` can be extended to support different lifecycle management strategies without changing its core functionality.

3. **Liskov Substitution Principle (LSP)**:
   - **Explanation**: Subtypes must be substitutable for their base types without altering the correctness of the program.
   - **Usage**: The `TestBase` class allows subclasses (like page objects) to be used interchangeably while maintaining expected behaviors.

4. **Interface Segregation Principle (ISP)**:
   - **Explanation**: Clients should not be forced to depend on interfaces they do not use. Instead, many client-specific interfaces are preferred over a one-size-fits-all interface.
   - **Usage**: While this principle is less explicitly represented, the design encourages specialized classes for specific tasks, promoting smaller interfaces.

5. **Dependency Inversion Principle (DIP)**:
   - **Explanation**: High-level modules should not depend on low-level modules; both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions.
   - **Usage**: The usage of interfaces for WebDriver allows for easier swapping of WebDriver implementations without impacting higher-level logic, promoting loose coupling.
