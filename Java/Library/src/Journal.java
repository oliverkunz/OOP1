
public final class Journal {
	private final long articleNumber;
	private final String title;
	private final String publisher;
	private final int pages;
	
	public Journal(long articleNumber, String title, String publisher, int pages) {
		this.articleNumber = articleNumber;
		this.title = title;
		this.publisher = publisher;
		this.pages = pages;
	}

	public long getArticleNumber() {
		return articleNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPages() {
		return pages;
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Journal other = (Journal) obj;
		if (articleNumber != other.articleNumber)
			return false;
		if (pages != other.pages)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
	

}
