import javax.swing.JOptionPane;

public class A15_caeserChiffre {

	public static void main(String[] args) {
		String s = "Hello";
		int n = 3;
		JOptionPane.showMessageDialog(null,s + " wird zu: " +  caesarChiffre(s, n));

	}
	public static String caesarChiffre(String s, int n) {
		char[] sArr = s.toCharArray();
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < sArr.length; i++) {
			int charCode = (int) sArr[i];
			
			if (charCode >= 120) {
				charCode -= 23;
			} else {
				charCode += 3;
			}
			result.append((char)charCode);
		}
		
		return result.toString();
	}
}
