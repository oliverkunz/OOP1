
public class Book {
	
	private int ean;
	private String title;
	private Writer writer;
	private int pages;
	private int year;
	
	public Book(int ean, String title, Writer writer, int pages, int year) {
		this.ean = ean;
		this.title = title;
		this.writer = writer;
		this.pages = pages;
		this.year = year;
	}

	public int getEan() {
		return ean;
	}

	public String getTitle() {
		return title;
	}

	public Writer getWriter() {
		return writer;
	}

	public int getPages() {
		return pages;
	}

	public int getYear() {
		return year;
	}
		
}
