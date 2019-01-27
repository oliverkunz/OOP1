package shape;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon {
	public Rectangle(Point[] points, Color color) {
		super(points, color);
		assert points.length == 4;
		assert angle(0,1,3) == 0;
		assert angle(3,0,2) == 0;
		assert angle(1,2,0) == 0;
	}
	
	protected int angle(int a, int b, int c)
	{
		int v1x = points[b].x - points[a].x;
		int v1y = points[b].y - points[a].y;
		int v2x = points[c].x - points[a].x;
		int v2y = points[c].y - points[a].y;
		return v1x * v2x + v1y * v2y;
	}
}