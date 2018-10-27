package library.data;

public class Journal extends PrintMedium {

	private final String publisher;
	
	public Journal(long articleNumber, String title, String publisher, int pages) {
		super(articleNumber, title, pages);
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	@Override
	public String toString() {
		return "Journal [publisher=" + publisher + ", getPages()=" + getPages() + ", getArticlenumber()="
				+ getArticlenumber() + ", getTitle()=" + getTitle() + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Journal other = (Journal) obj;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		return true;
	}
	
}
