import javax.swing.JOptionPane;

public class A14_appendBuilder {

    public static void main(String[] args) {
		String s = "Hello";
		char[] c = {' ','W','o','r','l','d','!'};
		JOptionPane.showMessageDialog(null, append(s, c));
		
	}
	public static String append(String s, char[] c) {
		long start = System.nanoTime();
		
		StringBuilder s1 = new StringBuilder(s);
		
		s1.append(c);
		
		System.out.println("append() Dauer in ns: " + (System.nanoTime() - start));
		
		return s1.toString();	
	}
}
