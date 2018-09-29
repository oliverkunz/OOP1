import java.util.Arrays;

import javax.swing.JOptionPane;

public class A8_swap {

	public static void main(String[] args) {
		double[] list = { 1, 2, 3, 4 };
		int index1 = 1;
		int index2 = 3;
		double[] result = swap(list, index1, index2);
		JOptionPane.showMessageDialog(null, Arrays.toString(result));

	    }

	    public static double[] swap(double[] list, int index1, int index2) {
		double[] newArray = new double[list.length];


		for (int i = 0; i < newArray.length; i++) {
			if(i == index1) {
				newArray[i] = list[index2];
			} else if (i == index2) {
				newArray[i] = list[index1];
			} else {
				newArray[i] = list[i];
			}
		}
		return newArray;
	    }
	}
