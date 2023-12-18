# Card Swipe Logs Categorization Project with JavaFX Integration

This Java-based project processes card swipe logs for attendance tracking in a class, now with an integrated JavaFX user interface. It offers functionalities to manage, analyze, and retrieve attendance data through a graphical interface.

## Overview

The project encompasses a Java application designed for handling card swipe records and student attendance tracking. The user interacts with the application through a JavaFX interface, allowing them to load logs, print records, count entries, and execute various attendance-related queries.


### Getting Started

To use this application, follow these steps:

1. **Clone the Repository:** Clone this repository to your local machine.
2. **Compile Java Files:** Compile the Java files, including the JavaFX files.
3. **Run the Application:** Execute the `Main` class to start the JavaFX application.

### JavaFX Components

The JavaFX components consist of:

- **Main.java:** This class initializes the JavaFX application and loads the `Sample.fxml` file for the graphical interface.
- **Sample.fxml:** This file contains the graphical layout of the user interface with buttons, text fields, and other UI elements.
- **SampleController.java:** The controller class for the JavaFX application. It manages user interactions, queries, and integrates with the main Java code (`AttendanceApp`) to execute various operations based on user input.

### Features and Options

The JavaFX interface presents a menu with different options corresponding to specific functionalities. Users can interact with the interface by:

- Choosing options from the dropdown menu in the SplitMenuButton.
- Inputting filenames, dates, times, or days in the provided text fields.
- Executing queries by clicking the "Query" button.

The application dynamically enables or disables input fields based on the selected operation to ensure proper user input.

### Note

Ensure valid file names, dates, and proper formats while inputting data to perform operations successfully.
