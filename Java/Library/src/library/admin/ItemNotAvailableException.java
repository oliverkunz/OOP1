package library.admin;

import library.data.Item;

public class ItemNotAvailableException extends Exception {

	private static final long serialVersionUID = 8756271925232032928L;
		private String message;

		public ItemNotAvailableException(String message) {
			message = "Item ist nicht verfügbar";
		}

		public ItemNotAvailableException() {
			super();
		}
		
		public ItemNotAvailableException(Item item) {
			super();
		}

		public String getMessage() {
			return message;
		}
}
