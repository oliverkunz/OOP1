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
					//muss das erste zurückgeben
					return result;
				}
			}
		}	
		return result;
	}
}
