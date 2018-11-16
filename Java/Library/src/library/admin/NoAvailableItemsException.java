package library.admin;

public class NoAvailableItemsException extends Exception {

	private static final long serialVersionUID = -198475044848431842L;
	private String message;

	public NoAvailableItemsException(String message) {
		message = "Keine Items sind verfügbar";
	}

	public NoAvailableItemsException() {
		super();
	}
	
	public NoAvailableItemsException(long[] ids) {
		super();
	}

	public String getMessage() {
		return message;
	}

	
	
	
	
	
}
