# Tic-Tac-Toe Game using JavaFX

This Java-based Tic-Tac-Toe game employs JavaFX for its graphical user interface. It enables users to play the classic game of Tic-Tac-Toe with another player locally on the same machine.

## Overview

The project comprises a Java application that implements the rules and functionalities of the Tic-Tac-Toe game. The JavaFX-based user interface allows players to interact with the game board and tracks their scores.


### Getting Started

To use this application:

1. **Clone the Repository:** Clone this repository to your local machine.
2. **Compile Java Files:** Compile the Java files, including the JavaFX files.
3. **Run the Application:** Execute the `Main` class to start the JavaFX application.

### Game Interface

The JavaFX interface presents a simple layout with buttons representing the Tic-Tac-Toe grid, score labels, and a reset button:

- **Game Board:** Buttons (`button1` to `button9`) representing the Tic-Tac-Toe grid cells.
- **Score Labels:** Labels displaying the scores for both players (`X` and `O`).
- **Reset Button:** Clicking this button resets the game board and scores for a new game.

### Gameplay

- Players take turns clicking on the grid cells to place their respective symbols (`X` for Player 1 and `O` for Player 2).
- The game automatically determines if a player wins by achieving three symbols in a row horizontally, vertically, or diagonally.
- When a player wins, their respective score increases, and the game board is reset for a new round.
- Players can play multiple rounds without restarting the application.

### Note

- The game is designed for two players to play locally on the same device.
- The score labels track the wins for each player throughout multiple rounds.
- Enjoy the classic Tic-Tac-Toe experience with this simple yet engaging JavaFX game!


