package shape;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Ellipse extends Shape {
	protected int width = points[1].x - points[0].x;
	protected int height = points[1].y - points[0].y;
	
	public Ellipse(Point[] points, Color color) {
		super(points, color);
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(points[0].x, points[0].y, width, height);
		g.setColor(Color.black);
	}
	
	public void paint(Graphics g, int thickness) {
		this.paint(g);
		((Graphics2D)g).setStroke(new BasicStroke(thickness));
		g.drawOval(points[0].x, points[0].y, width, height);
	}
}
