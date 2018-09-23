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