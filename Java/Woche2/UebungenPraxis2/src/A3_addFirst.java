import java.util.Arrays;

import javax.swing.JOptionPane;

public class A3_addFirst {

    public static void main(String[] args) {
	double[] list = { 1, 2, 3 };
	double a = 4;
	double[] result = addFirst(list, a);
	JOptionPane.showMessageDialog(null, Arrays.toString(result));

    }

    public static double[] addFirst(double[] list, double a) {
	double[] longArray = new double[list.length + 1];

	longArray[0] = a;

	for (int i = 1; i <= list.length; i++) {
	    longArray[i] = list[i - 1];
	}
	return longArray;
    }
}