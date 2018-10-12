
public final class Book {
	
	private final long articelNumber;
	private final String title;
	private final Writer writer;
	private final int pages;
	private final int year;
	
	public Book(long articelNumber, String title, Writer writer, int pages, int year) {
		this.articelNumber = articelNumber;
		this.title = title;
		this.writer = writer;
		this.pages = pages;
		this.year = year;
	}

	public long getarticelNumber() {
		return articelNumber;
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


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (articelNumber != other.articelNumber)
			return false;
		if (pages != other.pages)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
