package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import library.admin.Administration;

public class LoginScreen extends Pane  {
	
	Controller controller;

	public LoginScreen() {
		this.setId("loginScreen");

		ImageView img = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("res/library.jpg")));
		img.setFitWidth(550);
		img.setFitHeight(200);
		img.setX(125);
		img.setPreserveRatio(false);
		
		Administration admin = Administration.getInstance();
		controller = admin.getController();
		
	    GridPane grid = new GridPane();
	    grid.setAlignment(Pos.CENTER);
	    grid.setPadding(new Insets(250, 25, 25, 150)); //(top/right/bottom/left)
	     
	    ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(15);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(25);
		ColumnConstraints col3 = new ColumnConstraints();
		col3.setPercentWidth(45);
		grid.getColumnConstraints().addAll(col1, col2, col3);
		grid.setGridLinesVisible(false);
	    
	    Label l1 = new Label("Vorname");
	    Label l2 = new Label("Nachname");
	    Label l3 = new Label("Email");
	    Label l4 = new Label("Passwort");
	    Label l5 = new Label("");
	    l5.textProperty().bindBidirectional(controller.getMessage());
	    TextField t1 = new TextField();
	    t1.textProperty().bindBidirectional(controller.getFirstName());
	    TextField t2 = new TextField();
	    t2.textProperty().bindBidirectional(controller.getLastName());
	    TextField t3 = new TextField();
	    t3.textProperty().bindBidirectional(controller.getEmail());
	    PasswordField passwordField = new PasswordField();
	    passwordField.textProperty().bindBidirectional(controller.getPassword());
	    
	    grid.add(l1,0,1); grid.add(t1,1,1);
	    grid.add(l2,0,2); grid.add(t2,1,2);
	    grid.add(l3,0,3); grid.add(t3,1,3);
	    grid.add(l4,0,4); grid.add(passwordField,1,4);
	    grid.add(l5,1,5);	    

	    getChildren().addAll(grid,img);
	     
	}

}