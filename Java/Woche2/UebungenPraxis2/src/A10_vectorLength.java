import java.util.Arrays;

import javax.swing.JOptionPane;

public class A10_vectorLength {

	public static void main(String[] args) {
		double[] vector = {2.4, 5, 3};
		JOptionPane.showMessageDialog(null, vectorLength(vector));		
	}
	public static double vectorLength(double[] vector) {
		double square = 0;
		
		for (int i = 0; i < vector.length; i++) {
			square += Math.pow(vector[i], 2);
		}
		
		double length = Math.sqrt(square);
		return length;
	}
}
