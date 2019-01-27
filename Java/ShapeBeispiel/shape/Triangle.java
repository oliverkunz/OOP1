package shape;

import java.awt.Color;
import java.awt.Point;

public class Triangle extends Polygon {
	public Triangle(Point[] points, Color color) {
		super(points, color);
		assert points.length == 3;
	}
}
