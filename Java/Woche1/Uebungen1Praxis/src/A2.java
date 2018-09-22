import javax.swing.JOptionPane;
public class A2 {

	public static void main(String[] args) {
		String s = "5";
		square(s);
	}
	public static void square(String s) {
		int string = Integer.parseInt(s);
		JOptionPane.showMessageDialog(null, string + " * " + string + "=" + string*string );
	}

}
