package view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class LoginScreen extends Pane {

	public LoginScreen() {
		this.setId("loginScreen");

		ImageView img = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("res/img.jpg")));
		//setAlignment(Pos.CENTER);
		//getChildren().addAll(img);
	      	    
	      GridPane pane = new GridPane ();
	      pane.setMaxWidth(600);
	      pane.setHgap(10); 
	      pane.setVgap(10);
	      pane.setAlignment(Pos.CENTER);
	      pane.setPadding(new Insets(25, 25, 25, 25));
	      
	      //ColumnConstraints col1 = new ColumnConstraints();
		  //col1.setPercentWidth(50);
		  //ColumnConstraints col2 = new ColumnConstraints();
		  //col2.setPercentWidth(25);
		  //ColumnConstraints col3 = new ColumnConstraints();
		  //col3.setPercentWidth(25);
		  //pane.getColumnConstraints().addAll(col1, col2, col3);
		  //pane.setGridLinesVisible(true);
		  
	      
	      Label l1 = new Label("Vorname");
	      Label l2 = new Label("Nachname");
	      Label l3 = new Label("Email");
	      Label l4 = new Label("Passowrt");
	      TextField t1 = new TextField();
	      TextField t2 = new TextField();
	      TextField t3 = new TextField();
	      PasswordField passwordField = new PasswordField();
	
	      pane.add(l1,0,1); pane.add(t1,1,1);
	      pane.add(l2,0,2); pane.add(t2,1,2);
	      pane.add(l3,0,3); pane.add(t3,1,3);
	      pane.add(l4,0,4); pane.add(passwordField,1,4);
	      
	      String password = passwordField.getText();
	      if (password.equals(t3.getText())) {
	    	  
	      } else {
	    	  //
	      }
	      //setTop(img);
	      //pane.setAlignment(Pos.CENTER);
	      //root.setCenter(pane);
	      getChildren().addAll(img, l1, l2, l3, l4, t1, t2, t3, passwordField);	
	      
	      

	}
}
