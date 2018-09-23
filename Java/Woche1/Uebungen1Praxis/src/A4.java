import javax.swing.JOptionPane;

public class A4 {

	public static void main(String[] args) {
		sinValue();
	}
	public static void sinValue() {
		double eingabe = Double.parseDouble(JOptionPane.showInputDialog("Zahl eingeben, um Sinus zu berechnen"));
		
		double sinus = Math.sin(eingabe);
		//https://www.tutorialspoint.com/java/number_sin.htm
		
		if (eingabe < 0) {
			JOptionPane.showMessageDialog(null, "Ungültige Eingabe: " + eingabe + ", Wert negativ");
		} else if (sinus < 0) {
			JOptionPane.showMessageDialog(null, "Ungültige Eingabe: " + eingabe + ", Sinus Wert " + String.format("%1.2f", sinus) + " negativ");
		} else {
			JOptionPane.showMessageDialog(null, "Gültige Eingabe: " + eingabe + ", Sinus Wert: " + String.format("%1.2f", sinus));
		}
	}

}
