import javax.swing.JOptionPane;

public class A7 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Geben Sie einen Text s sein");
		String t = JOptionPane.showInputDialog("Geben Sie einen Text t sein");
		String result = reverse(s,t);
		JOptionPane.showMessageDialog(null, "Resultat: " + result);
	}
	
	//https://mein-javablog.de/java-strings-umkehren/
	public static String reverse(String s, String t) {
		String s2 = "";
		for (int i = s.length()-1; i >= 0; i -- ) {
			s2 += (s.charAt(i));
		}
		String result = t + s2;		
		
		return result;
	}
}
