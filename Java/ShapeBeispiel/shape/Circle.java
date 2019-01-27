package shape;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Ellipse{

	public Circle(Point[] points, Color color) {
		super(points, color);
		assert width ==  height;
	}
}

