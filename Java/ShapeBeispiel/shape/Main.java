package shape;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame {

	class RectangleCanvas extends Canvas {
		public void paint(Graphics g) {
			Point[] points = { new Point(15, 15), new Point(200, 15), new Point(200, 160), new Point(15, 160) };
			Rectangle rectangle = new Rectangle(points, Color.red);
			rectangle.paint(g);
		}
	}

	class TriangleCanvas extends Canvas {
		public void paint(Graphics g) {
			Point[] points = { new Point(10, 130), new Point(200, 180), new Point(80, 14) };
			Triangle triangle = new Triangle(points, Color.blue);
			triangle.paint(g);
			Point[] points2 = { new Point(40, 130), new Point(200, 180), new Point(80, 14) };
			triangle = new Triangle(points2, Color.blue);
			triangle.paint(g, 3);
		}
	}

	class PolygonCanvas extends Canvas {
		public void paint(Graphics g) {
			Point[] points = { new Point(10, 10), new Point(10, 70), new Point(40, 100), new Point(70, 90) 
					, new Point(60, 60), new Point(90, 50), new Point(60, 20)};
			Polygon polygon = new Polygon(points, Color.green);
			polygon.paint(g);
		}
	}

	class CircleCanvas extends Canvas {
		public void paint(Graphics g) {
			Point[] points = { new Point(15, 15), new Point(170, 130) };
			Ellipse circle = new Ellipse(points, Color.orange);
			circle.paint(g);
		}
	}

	public static void main(String[] args) {
		new Main().paintShapes();
	}

	public void paintShapes() {
		getContentPane().add(new RectangleCanvas());
		getContentPane().add(new TriangleCanvas());
		getContentPane().add(new CircleCanvas());
		getContentPane().add(new PolygonCanvas());
		setLayout(new GridLayout(2, 2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 520, 420);
		setVisible(true);
	}
}
