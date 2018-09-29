import javax.swing.JOptionPane;

public class A5_getLast {

    public static void main(String[] args) {
	double[] list = { 1, 2, 3 };
	double last = getLast(list);
	double first = getFirst(list);
	JOptionPane.showMessageDialog(null, "first: " + first + " last: " + last);

    }

    public static double getLast(double[] list) {
	return list[list.length - 1];
    }

    public static double getFirst(double[] list) {
	return list[0];
    }
}
