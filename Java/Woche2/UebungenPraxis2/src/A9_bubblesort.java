
public class A9_bubblesort {

	public static void main(String[] args) {
		double[] list = { 11, 4, 333, 5, 2, 100, 7653, 1 };


	}
	public static double[] bubbleSort(double[] list) {		
		for (int n = list.length; n > 1; --n) {
			for (int i = 0; i < n-1; ++i) {
				if (list[i] > list[i+1]) {
					list = swap(list, i, i + 1);
				}
			}
		}
		return list;
	}
	
	public static double[] swap(double[] list, int index1, int index2) {
		double[] newArray = new double[list.length];


		for (int i = 0; i < newArray.length; i++) {
			if(i == index1) {
				newArray[i] = list[index2];
			} else if (i == index2) {
				newArray[i] = list[index1];
			} else {
				newArray[i] = list[i];
			}
		}
		return newArray;
	}
}
