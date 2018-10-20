
public class Actor extends Person {
	
	public Actor(String firstname, String lastname) {
		super(firstname, lastname);	
	}

	@Override
	public String toString() {
		return "Actor [getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + "]";
	}
	
}

