package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Shape {
	protected Point[] points;
	protected Color color;

	protected Shape(Point[] points, Color color) {
		this.points = points;
		this.color = color;
	}
	
	public abstract void paint(Graphics g);
	public abstract void paint(Graphics g, int thickness);
}

