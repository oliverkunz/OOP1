package library.data;

public class Writer extends Person{

	public Writer(String firstname, String lastname) {
		super(firstname, lastname);
	}

	@Override
	public String toString() {
		return "Writer [getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname() + "]";
	}

}
