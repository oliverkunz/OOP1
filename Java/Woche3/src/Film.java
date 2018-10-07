
public class Film {
	
	private Actor[] actors;
	private int ean;
	private String title;
	private String publisher;
	private int length;
	
	public Film(int ean, String title, String publisher, int length) {
		super();
		this.ean = ean;
		this.title = title;
		this.publisher = publisher;
		this.length = length;
	}

	public Actor[] getActors() {
		return actors;
	}

	public int getEan() {
		return ean;
	}

	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getLength() {
		return length;
	}

}
