
public class Customer extends Person {
	private String email;
	
	
	public Customer(String firstname, String lastname, String email) {
		super(firstname, lastname);
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [email=" + email + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
				+ "]";
	}
	
}
