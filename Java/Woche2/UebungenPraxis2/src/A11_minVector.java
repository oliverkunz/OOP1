import java.util.Arrays;

import javax.swing.JOptionPane;

public class A11_minVector {

	public static void main(String[] args) {
		double[][] vectors = {
				{2.4, 5, 3},
				{2, 2.6, 5.6},
		};
		JOptionPane.showMessageDialog(null, Arrays.toString(minVector(vectors)));

	}
	public static double[] minVector(double[][] vectors) {
		double[] shortVector = null;
		double minLength = 0;
		
		for (int i = 0; i < vectors.length; i++) {
			double length = vectorLength(vectors[i]);
			
			if (length < minLength || minLength == 0) {
				minLength = length;
				shortVector = vectors[i];
			}
		}
		return shortVector;
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
