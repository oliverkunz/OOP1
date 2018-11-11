package persistence.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Logger;

import library.data.Book;
import library.data.Writer;
import persistence.IBookDAO;

public class BookDAO implements IBookDAO {

	private File bookFile;
	private String delimiter;
	private Book[] books;
	private static final Logger logger = Logger.getLogger(CustomerDAO.class.getName());

	public BookDAO(File bookFile, String delimiter) {
		this.bookFile = bookFile;
		this.delimiter = delimiter;
		loadBooks();
	}

	private void loadBooks() {
		books = new Book[15];
		log("load books");
		try (Scanner scanner = new Scanner(new FileReader(bookFile))) {
			int nr = 0;
			Writer[] w = createWriters();
			while (scanner.hasNextLine()) {
				String[] tokens = scanner.nextLine().split(delimiter);
				int ean = Integer.parseInt(tokens[0]);
				int pages = Integer.parseInt(tokens[2]);
				Book book = new Book(ean, tokens[1], pages);
				book.setWriter(w[Integer.parseInt(tokens[3])]);
				books[nr++] = book;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Book Datei nicht gefunden");
		} catch (NumberFormatException e) {
			System.out.println("Book Datei ist korrput");
		}
	}
	
	/* (non-Javadoc)
	 * @see persistence.file.IBookDAOtest#getBooks()
	 */
	@Override
	public Book[] getBooks() {
		if (books == null)
			loadBooks();
		return books;
	}

	private void log(String stmt) {
		String text = stmt.toString();
		logger.info(text.substring(text.indexOf(":") + 1));
	}

	private Writer[] createWriters() {
		Writer[] w = new Writer[7];
		w[0] = new Writer("Schreiberin", "Barbara");
		w[1] = new Writer("Schreiber", "Hans");
		w[2] = new Writer("Schreiber", "Peter");
		w[3] = new Writer("Schreiber", "Willi");
		w[4] = new Writer("Schreiberin", "Anna");
		return w;
	}

}
