import java.util.Arrays;

import javax.swing.JOptionPane;

public class A12_addVectors {

	public static void main(String[] args) {
		double[] vector1 = {2, 7, 3};
		double[] vector2 = {1, 5, 3.3};
		JOptionPane.showMessageDialog(null, Arrays.toString(addVectors(vector1, vector2)));

	}
	public static double[] addVectors(double[] a, double[] b) {
		double[] sumVectors = new double[a.length];
		
		for (int i = 0; i < a.length; i++) {
			sumVectors[i] = a[i] + b[i];
		}
		
		return sumVectors;
	}

}
