package library.data;


public final class Book extends PrintMedium {
	
	private Writer writer;
	
	public Book(long articleNumber, String title, Writer writer, int pages) {
		super(articleNumber, title, pages);
		this.writer = writer;
	}

	public Writer getWriter() {
		return writer;
	}

	@Override
	public String toString() {
		return "Book [writer=" + writer + "]";
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
		return true;
	}
		
}
