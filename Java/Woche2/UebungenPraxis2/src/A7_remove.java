import java.util.Arrays;

import javax.swing.JOptionPane;

public class A7_remove {

    public static void main(String[] args) {
	double[] list = { 1, 2, 3, 4 };
	int index = 2;
	double[] result = remove(list, index);
	JOptionPane.showMessageDialog(null, Arrays.toString(result));

    }

    public static double[] remove(double[] list, int index) {
	double[] newArray = new double[list.length - 1];

	int j = 0;
	for (int i = 0; i < newArray.length; i++) {
	    if (j == index) {
	    	j++;
	    	i--;
	    } else {
		newArray[i] = list[j];
		j++;
	    }
	}
	return newArray;
    }
}