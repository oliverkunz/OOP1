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
