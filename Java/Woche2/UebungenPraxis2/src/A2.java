import java.util.Arrays;

import javax.swing.JOptionPane;

public class A2 {

    public static void main(String[] args) {
	double[] list = { 1, 2, 3 };
	double a = 4;
	double[] result = addlast(list, a);
	JOptionPane.showMessageDialog(null, Arrays.toString(result));

    }

    public static double[] addlast(double[] list, double a) {
	double[] longArray = new double[list.length + 1];
	for (int i = 0; i < list.length; i++) {
	    longArray[i] = list[i];
	}

	longArray[longArray.length - 1] = a;

	return longArray;
    }

}
