package application;

import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class SampleController {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button reset;
    @FXML
    private Label XLabel;
    @FXML
    private  Label OLabel;

    private boolean playerOneTurn = true;

    public void initialize() {
        // Set up event handlers for buttons
        button1.setOnAction(event -> handleButtonClick(button1));
        button2.setOnAction(event -> handleButtonClick(button2));
        button3.setOnAction(event -> handleButtonClick(button3));
        button4.setOnAction(event -> handleButtonClick(button4));
        button5.setOnAction(event -> handleButtonClick(button5));
        button6.setOnAction(event -> handleButtonClick(button6));
        button7.setOnAction(event -> handleButtonClick(button7));
        button8.setOnAction(event -> handleButtonClick(button8));
        button9.setOnAction(event -> handleButtonClick(button9));
        reset.setOnAction(event -> handleResetClick(reset));
    }

    private void handleButtonClick(Button button) {
        if (!button.isDisabled()) {
            // Determine the color and symbol to use for this player's turn
            String color = playerOneTurn ? "cyan" : "yellow";
            String symbol = playerOneTurn ? "X" : "O";

            // Update the button's style and text to reflect the player's turn
            button.setStyle("-fx-background-color: " + color + ";");
            button.setText(symbol);

            // Disable the button so it cannot be selected again
            button.setDisable(true);

            // Check if the game has been won
            if (checkForWin()) {
            
            	//Increment counter
            	if (playerOneTurn) {
            		int newValue = Integer.parseInt(XLabel.getText())+1;
                	String newString = newValue + "";
            		XLabel.setText(newString);
            	}else { 
            		int newValue = Integer.parseInt(OLabel.getText())+1;
                	String newString = newValue + "";
            		OLabel.setText(newString);
            	}
            
                // Disable all buttons if the game has been won
                button1.setDisable(true);
                button2.setDisable(true);
                button3.setDisable(true);
                button4.setDisable(true);
                button5.setDisable(true);
                button6.setDisable(true);
                button7.setDisable(true);
                button8.setDisable(true);
                button9.setDisable(true);
            } else {
                // If the game has not been won, switch to the next player's turn
                playerOneTurn = !playerOneTurn;
            }
        }
    }

    private boolean checkForWin() {
    	if (button1.getStyle().equals(button2.getStyle()) && button2.getStyle().equals(button3.getStyle()) && !button1.getText().isEmpty()) {
            return true;
        }
    	if (button4.getStyle().equals(button5.getStyle()) && button5.getStyle().equals(button6.getStyle()) && !button4.getText().isEmpty()) {
            return true;
        }
    	if (button7.getStyle().equals(button8.getStyle()) && button8.getStyle().equals(button9.getStyle()) && !button7.getText().isEmpty()) {
            return true;
        }
    	if (button1.getStyle().equals(button4.getStyle()) && button4.getStyle().equals(button7.getStyle()) && !button1.getText().isEmpty()) {
            return true;
        }
    	if (button2.getStyle().equals(button5.getStyle()) && button5.getStyle().equals(button8.getStyle()) && !button2.getText().isEmpty()) {
            return true;
        }
    	if (button3.getStyle().equals(button6.getStyle()) && button6.getStyle().equals(button9.getStyle()) && !button3.getText().isEmpty()) {
            return true;
        }


    	return false;
    }
    
    private void handleResetClick(Button button) {
    	// Set button color to white and disable it
        button1.setStyle("");
        button2.setStyle("");
        button3.setStyle("");
        button4.setStyle("");
        button5.setStyle("");
        button6.setStyle("");
        button7.setStyle("");
        button8.setStyle("");
        button9.setStyle("");
        
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        
        
        button1.setDisable(false);
        button2.setDisable(false);
        button3.setDisable(false);
        button4.setDisable(false);
        button5.setDisable(false);
        button6.setDisable(false);
        button7.setDisable(false);
        button8.setDisable(false);
        button9.setDisable(false);
        
    };
}
 