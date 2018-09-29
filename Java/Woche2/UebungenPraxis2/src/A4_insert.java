import java.util.Arrays;

import javax.swing.JOptionPane;

public class A4_insert {

    public static void main(String[] args) {
	double[] list = { 1, 2, 3 };
	double a = 4;
	int index = 2;
	double[] result = insert(list, a, index);
	JOptionPane.showMessageDialog(null, Arrays.toString(result));

    }

    public static double[] insert(double[] list, double a, int index) {
	double[] longArray = new double[list.length + 1];

	longArray[index] = a;
	int j = 0;
	for (int i = 0; i < longArray.length; i++) {
	    if (i == index) {
		continue;
	    } else {
		longArray[i] = list[j];
		j++;
	    }
	}
	return longArray;
    }
}