
public class A16_removeVocals {

	public static void main(String[] args) {
		String s = "Schifffahrtsgesellschaft";
		System.out.println(removeVocals(s));

	}
	public static String removeVocals(String s) {
		return s.replaceAll("[AaEeIiOoUu]", "");		
	}
}
