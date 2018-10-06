
public class Book {
	
	private String title;
	private int ean;
	private int pages;
	private int year;
	private Writer writer;
				
	public Book(String title, int ean, int pages, int year, Writer writer) {
		this.title = title;
		this.ean = ean;
		this.pages = pages;
		this.year = year;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public int getEan() {
		return ean;
	}

	public int getPages() {
		return pages;
	}

	public int getYear() {
		return year;
	}

	public Writer getWriter() {
		return writer;
	}
	
}
