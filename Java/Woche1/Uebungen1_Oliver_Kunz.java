//Uebungen1 Oliver Kunz

// Uebung A1

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

//Uebung A2

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


//Uebung A3
