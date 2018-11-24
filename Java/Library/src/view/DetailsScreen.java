package view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class DetailsScreen extends Pane {
	public DetailsScreen() {
		this.setId("detailsScreen");

		ImageView img = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("res/library.jpg")));
		img.setFitWidth(550);
		img.setFitHeight(200);
		img.setX(125);
		img.setPreserveRatio(false);
		
		Label l1 = new Label("to be defined");
		l1.setPadding(new Insets(250, 25, 25, 100));

		getChildren().addAll(img, l1);
	}
}
