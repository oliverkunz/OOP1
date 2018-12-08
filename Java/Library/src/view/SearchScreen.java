package view;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import library.admin.Administration;

public class SearchScreen extends Pane implements ChangeListener<String> {
	
	private Controller controller;

	public SearchScreen() {
		this.setId("searchScreen");
		
		Administration admin = Administration.getInstance();
		controller = admin.getController();

		ImageView img = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("res/library.jpg")));
		img.setFitWidth(550);
		img.setFitHeight(200);
		img.setX(125);
		img.setPreserveRatio(false);
		
	    GridPane grid = new GridPane();
	    grid.setPadding(new Insets(250, 25, 25, 100)); //(top/right/bottom/left)
	    
	    ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(3);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(5);
		ColumnConstraints col3 = new ColumnConstraints();
		col3.setPercentWidth(5);
		grid.getColumnConstraints().addAll(col1, col2, col3);
		grid.setGridLinesVisible(false);
		
		
	    Label l1 = new Label("Kategorie");
	    Label l2 = new Label("Suchtext");
	    Label l3 = new Label("Schauspieler/in");
	    
	    ChoiceBox<String> c1 = new ChoiceBox<>(controller.getCategories());
		c1.getSelectionModel().selectedItemProperty().addListener(this);

		c1.setTooltip(new Tooltip("Kategorie wählen"));
		c1.setMinWidth(300);
		
	    TextField t2 = new TextField();
	    t2.textProperty().bindBidirectional(controller.getTitle());
	    TextField t3 = new TextField();
	    t3.textProperty().bindBidirectional(controller.getWriterFirstName());
	    t3.textProperty().bindBidirectional(controller.getActorFirstName());
	    TextField t4 = new TextField();
	    t4.textProperty().bindBidirectional(controller.getWriterLastName());
	    t4.textProperty().bindBidirectional(controller.getActorLastName());
	    
	    ToggleGroup group = new ToggleGroup();
		RadioButton rb1 = new RadioButton();
		rb1.setToggleGroup(group);
		rb1.setText("Nur Verfügare");
		rb1.setSelected(true);
		RadioButton rb2 = new RadioButton();
		rb2.setText("Alle");
		rb2.setToggleGroup(group);
	    
	       
	    
	    grid.add(l1,0,1); grid.add(c1,1,1);
	    grid.add(l2,0,2); grid.add(t2,1,2);
	    grid.add(l3,0,3); grid.add(t3,1,3); grid.add(t4,2,3);
	    grid.add(rb1,1,4); grid.add(rb2,2,4);
	    
		getChildren().addAll(grid,img);

		@Override
		public void changed(ObservableValue<? extends String> arg0, String oldValue, String newValue) {
			controller.setCategory(newValue);
			if(newValue == "Buch") {
				l4.setText("Schriftsteller/in");
				getChildren().remove(t3,t4);
				add(box1, 1, 5, 2, 1);
			}
			else if(newValue == "Film") {
				l4.setText("Schauspieler/in");
				getChildren().remove(box1);
				add(box2, 1, 5, 2, 1);
			}
			else {
				l4.setText("  ");
				getChildren().remove(box2);
				getChildren().remove(box1);
			}
		}
	}

	@Override
	public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}
}
