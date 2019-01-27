package shape;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Polygon extends Shape {

	public Polygon(Point[] points, Color color) {
		super(points, color);
	}
	
	public void paint(Graphics g) {
		g.setColor(color);
		java.awt.Polygon p = createPolygon();
		g.fillPolygon(p);
		g.setColor(Color.black);
	}
	
	public void paint(Graphics g, int thickness) {
		this.paint(g);
		((Graphics2D)g).setStroke(new BasicStroke(thickness));
		java.awt.Polygon p = createPolygon();
		g.drawPolygon(p);
	}
	
	private java.awt.Polygon createPolygon(){
		java.awt.Polygon p = new java.awt.Polygon();
		for (Point point : super.points)
			p.addPoint(point.x, point.y);
		return p;
	}
}
