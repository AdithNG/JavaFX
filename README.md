# JavaFX Projects Repository

Welcome to my JavaFX Projects Repository! This repository houses several JavaFX projects that I've developed using Java and JavaFX technology. Each project resides in its own subdirectory within this repository.

## How to Navigate:

To explore a specific JavaFX project, click on the respective project's link above. Each project directory contains its own README file with detailed information, including setup instructions, usage guidelines, and specific details about the project.

## Getting Started:

If you're interested in running or exploring any of these JavaFX projects, follow the instructions provided in each project's directory. You'll find detailed information on how to set up the project, required dependencies, and how to compile or execute the code.

### Error Handling:
You might encounter an error like this:

Error: Could not find or load main class application.Main <br>
Caused by: java.lang.NoClassDefFoundError: javafx/application/Application <br>

To resolve this issue, follow these steps:
1. Right-click on `Main.java`.
2. Click on `Run Configurations`.
3. Select your main file name to run.
4. Click on the `Arguments` tab.
5. In the `VM arguments` text box, paste the following:
```--module-path "C:\Users\adith\javafx-sdk-20.0.1\lib" --add-modules javafx.controls,javafx.fxml```
This will configure the necessary VM arguments to properly run JavaFX applications.


