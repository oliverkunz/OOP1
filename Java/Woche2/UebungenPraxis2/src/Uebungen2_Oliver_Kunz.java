//Praktische Uebungen2 Oliver Kunz
//OOP1 

import java.util.Arrays;

public class Uebungen2_Oliver_Kunz {

	public static void main(String[] args) {
		System.out.println("### Praktische Uebungen2 Oliver Kunz ###");
		System.out.println("Uebung_A1_isEqual: " + isEqual(new double[]{1, 2, 3}, new double[]{1, 2, 3}));
		System.out.println("Uebung_A2_addLast: " + Arrays.toString(addLast(new double[] {1, 2, 3}, 4)));
		System.out.println("Uebung_A3_addFirst: " + Arrays.toString(addFirst(new double[] {1, 2, 3}, 0)));
		System.out.println("Uebung_A4_insert: " + Arrays.toString(insert(new double[] {1, 2, 3}, 4, 2)));
		System.out.println("Uebung_A5_getLast: " + (getLast(new double[] {1, 2, 3})));
		System.out.println("Uebung_A5_getFirst: " + (getFirst(new double[] {1, 2, 3})));
		System.out.println("Uebung_A6_removeFirst: " + Arrays.toString(removeFirst(new double[] {1, 2, 3})));
		System.out.println("Uebung_A6_removeLast: " + Arrays.toString(removeLast(new double[] {1, 2, 3})));
		System.out.println("Uebung_A7_remove: " + Arrays.toString(remove(new double[] {1, 2, 3}, 1)));
		System.out.println("Uebung_A8_swap: " + Arrays.toString(swap(new double[] {1, 2, 3}, 1, 2)));		
		System.out.println("Uebung_A9_bubblesort: " + Arrays.toString(bubbleSort(new double[] {11, 4, 333, 5, 2, 100, 7653, 1 })));
		System.out.println("Uebung_A10_vectorLength: " + vectorLength(new double[] {2.4, 5, 3}));
		System.out.println("Uebung_A11_minVector: " + Arrays.toString(minVector(new double[][] {{2.4, 5, 3},{2, 2.6, 5.6},})));
		System.out.println("Uebung_A12_addVector: " + Arrays.toString(addVectors(new double[] {2, 7, 3}, new double[] {1, 5, 3.3})));
		System.out.println("Uebung_A13_append: " + append("Hello", new char[] {' ','W','o','r','l','d','!'}));
		System.out.println("Uebung_A14_appendBuilder: " + append("Hello", new char[] {' ','W','o','r','l','d','!'}));
		System.out.println("Uebung_A15_caesarChiffre " + caesarChiffre("Hello World!", 3));
		System.out.println("Uebung_A16_removeVocals " + removeVocals("Schifffahrtsgesellschaft"));
	}
	
//-------------------Uebung_A1_isEqual	
	
	public static boolean isEqual(double[] arr1, double[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
	
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
			return false;
			}
		}
	
		return true;
    }
	
//-------------------Uebung_A2_addLast	

	public static double[] addLast(double[] list, double a) {
		double[] longArray = new double[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			longArray[i] = list[i];
		}
	
		longArray[longArray.length - 1] = a;
	
		return longArray;
    }
	
//-------------------Uebung_A3_addFirst

	public static double[] addFirst(double[] list, double a) {
		double[] longArray = new double[list.length + 1];
	
		longArray[0] = a;
	
		for (int i = 1; i <= list.length; i++) {
			longArray[i] = list[i - 1];
		}
		return longArray;
    }
	
//-------------------Uebung_A4_insert
	
	public static double[] insert(double[] list, double a, int index) {
		double[] longArray = new double[list.length + 1];
	
		longArray[index] = a;
		int j = 0;
		for (int i = 0; i < longArray.length; i++) {
			if (i == index) {
			continue;
			} else {
			longArray[i] = list[j];
			j++;
			}
		}
		return longArray;
    }
	
//-------------------Uebung_A5_getLast

	public static double getLast(double[] list) {
		return list[list.length - 1];
    }

    public static double getFirst(double[] list) {
		return list[0];
    }
	
	
//-------------------Uebung_A6_removeLF
	
	public static double[] removeLast(double[] list) {
		double[] shortArray = new double[list.length - 1];
		for (int i = 0; i < shortArray.length; i++) {
			shortArray[i] = list[i];
		}
		return shortArray;
    }

    public static double[] removeFirst(double[] list) {
		double[] shortArray = new double[list.length - 1];
		for (int i = 0; i < shortArray.length; i++) {
			shortArray[i] = list[i + 1];
		}
		return shortArray;
    }
	
	
//-------------------Uebung_A7_remove

	public static double[] remove(double[] list, int index) {
		double[] newArray = new double[list.length - 1];
	
		int j = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (j == index) {
				j++;
				i--;
			} else {
			newArray[i] = list[j];
			j++;
			}
		}
		return newArray;
    }
	
//-------------------Uebung_A8_swap
	
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
	
//-------------------Uebung_A9_bubblesort

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
	
//-------------------Uebung_A10_vectorLength
	
	public static double vectorLength(double[] vector) {
		double square = 0;
		
		for (int i = 0; i < vector.length; i++) {
			square += Math.pow(vector[i], 2);
		}
		
		double length = Math.sqrt(square);
		return length;
	}
	
//-------------------Uebung_A11_minVector

	public static double[] minVector(double[][] vectors) {
		double[] shortVector = null;
		double minLength = 0;
		
		for (int i = 0; i < vectors.length; i++) {
			double length = vectorLength(vectors[i]);
			
			if (length < minLength || minLength == 0) {
				minLength = length;
				shortVector = vectors[i];
			}
		}
		return shortVector;
	}
	
//-------------------Uebung_A12_addVector
	
	public static double[] addVectors(double[] a, double[] b) {
		double[] sumVectors = new double[a.length];
		
		for (int i = 0; i < a.length; i++) {
			sumVectors[i] = a[i] + b[i];
		}
		
		return sumVectors;
	}
	
//-------------------Uebung_A13_append

	public static String append(String s, char[] c) {
		long start = System.nanoTime();
		
		for (int i = 0; i < c.length; i++) {
			s += c[i];
		}
		
		System.out.println("Uebung A13_append Dauer in ns: " + (System.nanoTime() - start));
		
		return s;	
	}
	
//-------------------Uebung_A14_appendBuilder
	public static String appendBuilder(String s, char[] c) {
		long start = System.nanoTime();
		
		StringBuilder s1 = new StringBuilder(s);
		
		s1.append(c);
		
		System.out.println("Uebung A14_appendBuilder Dauer in ns: " + (System.nanoTime() - start));
		
		return s1.toString();	
	}
	
//-------------------Uebung_A15_caesarChiffre
	
		public static String caesarChiffre(String s, int n) {
		char[] sArr = s.toCharArray();
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < sArr.length; i++) {
			int charCode = (int) sArr[i];
			
			if (charCode >= 120) {
				charCode -= 23;
			//} else if (charCode == 32 || charCode == 33) {
			} else {
				charCode += 3;
			}
			result.append((char)charCode);
		}
		return result.toString();
	}
	
//-------------------Uebung_A16_removeVocals
	
	
	public static String removeVocals(String s) {
		return s.replaceAll("[AaEeIiOoUu]", "");		
	}
}	
	
	