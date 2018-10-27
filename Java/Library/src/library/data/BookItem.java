package library.data;

public class BookItem extends Item {
	private Book book;
	
	public BookItem(long id, Book book) {
		super(id);
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

	@Override
	public String toString() {
		return "BookItem [book=" + book + "]";
	}
	
}
