//Uebungen1 Oliver Kunz

//--------------------------------------------------Uebung A1

import java.util.Arrays; 
public class A1 {
	
	
	public static void main(String[] args) {
		long a = 10;
		long b = 3;
		long c = 6;
		long kleinste = min(a,b,c);
		System.out.println(kleinste);
	}
	public static long min(long a, long b, long c) {
		long[] arr  = {a, b, c};
		Arrays.sort(arr);
		long kleinste = arr[0];
		
		return kleinste;
	}

}

//--------------------------------------------------Uebung A2

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


//--------------------------------------------------Uebung A3

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
		int restbetrag = (int)(d * 100);
		
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

//--------------------------------------------------Uebung A4

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

//--------------------------------------------------Uebung A5

import javax.swing.JOptionPane;

public class A5 {

	public static void main(String[] args) {
		int wert = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie einen Wert n < 10 ein"));
		pyramide(wert);
	}
	public static void pyramide ( int n ) {
		System.out.println("Pyramide bis " + n);
		int rows = n;
		
        for (int i = 1; i <= rows; i++) {

            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println("");
        }
		//https://www.mkyong.com/java/java-how-to-print-a-pyramid/
	}
}

//--------------------------------------------------Uebung A6

import javax.swing.JOptionPane;

public class A6 {

	public static void main(String[] args) {
		int[] array = {2,3,4,6,8};
		int target = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie einen Wert ein"));
		int[] result = findpair(array, target);
		JOptionPane.showMessageDialog(null, "Resultat ist: " + result[0] + " und " + result[1]);
	}
	public static int[] findpair(int[] array, int target) {
		int[] result = {-1,1};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] + array[j] == target) {
					result[0] = array[i];
					result[1] = array[j];
				}
			}
		}	
		return result;
	}
}

//--------------------------------------------------Uebung A7

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