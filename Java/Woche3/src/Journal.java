
public class Journal {
	private long articleNumber;
	private String title;
	private String publisher;
	private int pages;
	
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
	
	
	

}
