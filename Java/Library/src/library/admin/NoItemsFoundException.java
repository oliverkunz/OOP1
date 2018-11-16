package library.admin;

public class NoItemsFoundException extends Exception{

	private static final long serialVersionUID = 4286390550008191395L;
	private String message;

	public NoItemsFoundException(String message) {
		message = "Keine Items gefunden";
	}

	public NoItemsFoundException() {
		super();
	}

	public String getMessage() {
		return message;
	}	
}
