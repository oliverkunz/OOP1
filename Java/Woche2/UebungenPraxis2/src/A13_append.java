import javax.swing.JOptionPane;

public class A13_append {

    public static void main(String[] args) {
		String  s = "Hello";
		char[] c = {' ','W','o','r','l','d','!'};
		JOptionPane.showMessageDialog(null, append(s, c));
		
	}
	public static String append(String s, char[] c) {
		long start = System.nanoTime();
		
		for (int i = 0; i < c.length; i++) {
			s += c[i];
		}
		
		System.out.println("append() Dauer in ns: " + (System.nanoTime() - start));
		
		return s;	
	}
}
