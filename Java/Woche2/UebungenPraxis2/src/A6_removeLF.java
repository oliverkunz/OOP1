import java.util.Arrays;

import javax.swing.JOptionPane;

public class A6_removeLF {

    public static void main(String[] args) {
	double[] list = { 1, 2, 3 };
	double[] last = removeLast(list);
	double[] first = removeFirst(list);
	JOptionPane.showMessageDialog(null,
		"ohne first: " + Arrays.toString(first) + " ohne last: " + Arrays.toString(last));

    }

    public static double[] removeLast(double[] list) {
	double[] shortArray = new double[list.length - 1];
	for (int i = 0; i < shortArray.length; i++) {
	    shortArray[i] = list[i];
	}
	return shortArray;
    }

    public static double[] removeFirst(double[] list) {
	double[] shortArray = new double[list.length - 1];
	for (int i = 0; i < shortArray.length; i++) {
	    shortArray[i] = list[i + 1];
	}
	return shortArray;
    }
}