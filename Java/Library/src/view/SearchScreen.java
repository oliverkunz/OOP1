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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class SearchScreen extends Pane implements ChangeListener<String> {
	
	private Controller controller;
	ObservableList<String> category;

	public SearchScreen() {
		this.setId("searchScreen");

		ImageView img = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("res/library.jpg")));
		img.setFitWidth(550);
		img.setFitHeight(200);
		img.setX(125);
		img.setPreserveRatio(false);
		
	    GridPane grid = new GridPane();
	    grid.setPadding(new Insets(250, 25, 25, 100)); //(top/right/bottom/left)
	     
	    category = FXCollections.observableArrayList("Buch", "Film", "Musik", "Zeitschrift");
	    
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
	    ChoiceBox<String> c1 = new ChoiceBox<String>(category);
	    c1.itemsProperty().bindBidirectional(controller.getCategories());
	    TextField t2 = new TextField();
	    TextField t3 = new TextField();
	    TextField t4 = new TextField();
	    RadioButton r1 = new RadioButton("Nur Verfügbare");
	    RadioButton r2 = new RadioButton("Alle");
	    
	    grid.add(l1,0,1); grid.add(c1,1,1);
	    grid.add(l2,0,2); grid.add(t2,1,2);
	    grid.add(l3,0,3); grid.add(t3,1,3); grid.add(t4,2,3);
	    grid.add(r1,1,4); grid.add(r2,2,4);
	    
		getChildren().addAll(grid,img);

	}

	@Override
	public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

}
