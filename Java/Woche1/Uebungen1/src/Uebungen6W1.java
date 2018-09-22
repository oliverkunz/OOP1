
public class Uebungen6W1 {
	
	public static void main(String[] args ){
		double x= 3;
		double y= 4;
		swap(x, y);
		System.out.println (x+ " "+ y);
	}
	public static void swap(double x, double y) {
		double temp = x;
		x= y;
		y= temp ;
	}
	

}
