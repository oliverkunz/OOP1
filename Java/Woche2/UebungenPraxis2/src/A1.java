import javax.swing.JOptionPane;

public class A1 {

    public static void main(String[] args) {
	double[] arr1 = { 1, 2, 3 };
	double[] arr2 = { 1, 2, 3 };
	boolean result = isEqual(arr1, arr2);
	JOptionPane.showMessageDialog(null, result);

    }

    public static boolean isEqual(double[] arr1, double[] arr2) {
	if (arr1.length != arr2.length) {
	    return false;
	}

	for (int i = 0; i < arr1.length; i++) {
	    if (arr1[i] != arr2[i]) {
		return false;
	    }
	}

	return true;
    }
}
