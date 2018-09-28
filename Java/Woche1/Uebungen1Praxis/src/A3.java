import javax.swing.JOptionPane;

public class A3 {

	public static void main(String[] args) {
		double betrag = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie einen Betrag ein"));
		change(betrag);

	}
	public static void change( double d) {
		int [][] anzahlMuenzen = {
				{500,0},
				{200,0},
				{100,0},
				{50,0},
				{20,0},
				{10,0},
				{5,0},
		};
		int restbetrag = (int)Math.round(d * 100);
		
		while (restbetrag != 0) {
			if (restbetrag >= 500) {
				anzahlMuenzen[0][1] += restbetrag / 500;
				restbetrag %= 500;
			} else if (restbetrag >= 200) {
				anzahlMuenzen[1][1] += restbetrag / 200;
				restbetrag %= 200;
			} else if (restbetrag >= 100) {
				anzahlMuenzen[2][1] += restbetrag / 100;
				restbetrag %= 100;
			} else if (restbetrag >= 50) {
				anzahlMuenzen[3][1] += restbetrag / 50;
				restbetrag %= 50;
			} else if (restbetrag >= 20) {
				anzahlMuenzen[4][1] += restbetrag / 20;
				restbetrag %= 20;
			} else if (restbetrag >= 10) {
				anzahlMuenzen[5][1] += restbetrag / 10;
				restbetrag %= 10;
			} else if (restbetrag >= 5) {
				anzahlMuenzen[6][1] += restbetrag / 5;
				restbetrag %= 5;
			} else {
				JOptionPane.showMessageDialog(null, "Ungueltiger Betrag");
				break;
			}
		}
			
		JOptionPane.showMessageDialog(null, String.format(d + " =" + "\n"+ anzahlMuenzen[0][1] + " x 5.00" + "\n"+ anzahlMuenzen[1][1] + " x 2.00" + "\n"+ anzahlMuenzen[2][1] + " x 1.00" + "\n"+ anzahlMuenzen[3][1] + " x 0.50" + "\n"+ anzahlMuenzen[4][1] + " x 0.20" + "\n"+ anzahlMuenzen[5][1] + " x 0.10" + "\n"+ anzahlMuenzen[6][1] + " x 0.05"  ));
		//https://stackoverflow.com/questions/4945655/how-to-add-a-linebreak-n-to-a-string-format-with-fixed-string-as-format	
	}	
}

