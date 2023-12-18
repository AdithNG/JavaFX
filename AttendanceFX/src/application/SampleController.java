package application;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SampleController {
	AttendanceApp attendanceApp = new AttendanceApp();
	List<String> query = new ArrayList<>();
	String resultString = "";
	MenuItem prevInput;
	MenuItem currInput;
	
	@FXML private Button exitButton;
	@FXML private Button queryButton;
	@FXML private TextField logFile;
	@FXML private TextField rosterFile;
	@FXML private TextField name;	
	@FXML private TextField date;
	@FXML private TextField time;
	@FXML private TextField days;
	@FXML private TextArea queryField;
	@FXML private SplitMenuButton splitMenuButton;
	
	
	
    public void initialize() {
    	// Set up event handlers
    	logFile.setDisable(true);
    	rosterFile.setDisable(true);
    	name.setDisable(true);
    	date.setDisable(true);
    	time.setDisable(true);
    	days.setDisable(true);
    	queryField.setDisable(true);
    	
    	exitButton.setOnAction(event -> exitGame());
    	queryButton.setOnAction(event -> query(currInput));
    	
    	for (MenuItem menuItem : splitMenuButton.getItems()) {
            menuItem.setOnAction(event -> menuItemClicked(menuItem));
        }
    }
    
    private void menuItemClicked(MenuItem menuItem) {
    	splitMenuButton.setText(menuItem.getText());
    	currInput = menuItem;
    	
    	logFile.setDisable(true);
    	rosterFile.setDisable(true);
    	name.setDisable(true);
    	date.setDisable(true);
    	time.setDisable(true);
    	days.setDisable(true);
    	queryField.setDisable(true);
    	
    	if (menuItem.getId().equals("A")) {
    		logFile.setDisable(false);
    		
    	}else if (menuItem.getId().equals("D")) {
    		rosterFile.setDisable(false);
    		
    	}else if (menuItem.getId().equals("H")) {
    		name.setDisable(false);
    		
    	}else if (menuItem.getId().equals("J")) {
    		time.setDisable(false);
    		
    	}else if (menuItem.getId().equals("K") || menuItem.getId().equals("Q")) {
    		date.setDisable(false);
    		
    	}else if (menuItem.getId().equals("L")) {
    		name.setDisable(false);
    		
    	}else if (menuItem.getId().equals("M")) {
    		name.setDisable(false);
    		date.setDisable(false);
    		
    	}else if (menuItem.getId().equals("N")) {
    		date.setDisable(false);
    		
    	}else if (menuItem.getId().equals("O")) {
    		date.setDisable(false);
    		time.setDisable(false);
    		
    	}else if (menuItem.getId().equals("P")) {
    		days.setDisable(false);
    	
    	}
    }
    
    private void query(MenuItem menuItem) {
    	
    	if (menuItem.getId().equals("A")) {
    		if (!(logFile.getText().equals(""))) {
    			attendanceApp.load_log(logFile.getText());
    			queryField.setDisable(false);
    			queryField.setText("Loading log...");
    		}
    		
    	}else if (menuItem.getId().equals("B")) {
    		query = attendanceApp.print_log();
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("C")) {
    		resultString  = attendanceApp.count_log();
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("D")) {
    		if (!(rosterFile.getText().equals(""))) {
    			attendanceApp.load_roster(rosterFile.getText());
    			queryField.setDisable(false);
    			queryField.setText("Loading roster...");
    		}
    		
    	}else if (menuItem.getId().equals("E")) {
    		query = attendanceApp.print_roster();
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("F")) {
    		resultString = attendanceApp.count_roster();
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("G")) {
    		query = attendanceApp.list_students_not_in_class();
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("H")) {
    		query = attendanceApp.list_all_times_checking_in_and_out(name.getText());
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("I")) {
    		query = attendanceApp.list_all_times_checked_in();
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("J")) {
    		query = attendanceApp.list_students_late_to_class(time.getText());
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("K") || menuItem.getId().equals("Q")) {
    		resultString = attendanceApp.get_first_student_to_enter(date.getText());
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("L")) {
    		resultString = attendanceApp.print_attendance_data_for_student(name.getText());
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("M")) {
    		resultString = attendanceApp.is_present(name.getText(), date.getText());
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("N")) {
    		query = attendanceApp.list_all_students_checked_in(date.getText());
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("O")) {
    		query = attendanceApp.list_all_students_checked_in_before(date.getText(), time.getText());
    		display_query_list();
    		
    	}else if (menuItem.getId().equals("P")) {
    		if (days.getText() != "") {
    			query = attendanceApp.list_students_attendance_count(Integer.parseInt(days.getText()));
    			display_query_list();
    		}else {
    			queryField.setDisable(false);
        		queryField.setText("Please enter number of days!!");
    		}
    		
    	}else if (menuItem.getId().equals("R")) {
    		display_query_list2();
    	
    	}else if (menuItem.getId().equals("S")) {
    		resultString = attendanceApp.print_count(query);
    		queryField.setDisable(false);
    		queryField.setText(resultString);
    		
    	}
    	prevInput = menuItem;
    }
    
    private void display_query_list() {
    	queryField.setDisable(false);
    	
	    if (currInput.getId().equals("C") || currInput.getId().equals("F") || currInput.getId().equals("K") || currInput.getId().equals("L") || currInput.getId().equals("M")){
			queryField.setText(resultString);
		}else {
			StringBuilder sb = new StringBuilder();
			for (String s : query) {
			    sb.append(s);
				sb.append("\n");
			}
			if (currInput.getId().equals("N") || currInput.getId().equals("O") || currInput.getId().equals("P")) {
				sb.append(attendanceApp.print_count(query));
			}
			queryField.setText(sb.toString());
		}
	        
    }
    
    private void display_query_list2() {
    	queryField.setDisable(false);
    	if (prevInput != null) {
	    	if (prevInput.getId().equals("C") || prevInput.getId().equals("F") || prevInput.getId().equals("K") || prevInput.getId().equals("L") || prevInput.getId().equals("M")){
				queryField.setText(resultString);
			}else {
				StringBuilder sb = new StringBuilder();
			    for (String s : query) {
			        sb.append(s);
			        sb.append("\n");
			    }
			    if (prevInput.getId().equals("N") || prevInput.getId().equals("O") || prevInput.getId().equals("P")) {
					sb.append(attendanceApp.print_count(query));
				}
			    queryField.setText(sb.toString());
			}
    	}
    }
    
    private void exitGame() {
        Platform.exit();
    }
}
