package Library;


public final class Book extends PrintMedium {
	
	private Writer writer;
	private int year;
	
	public Book(long articleNumber, String title, Writer writer, int pages, int year) {
		super(articleNumber, title, pages);
		this.writer = writer;
		this.year = year;
	}

	public Writer getWriter() {
		return writer;
	}

	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "Book [writer=" + writer + ", year=" + year + ", getPages()=" + getPages() + ", toString()="
				+ super.toString() + ", getArticlenumber()=" + getArticlenumber() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
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
