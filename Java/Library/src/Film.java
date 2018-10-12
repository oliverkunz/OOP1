import java.util.Arrays;

public final class Film {
	
	private Actor[] actors;
	private final long articleNumber;
	private final String title;
	private final String publisher;
	private final int length;
	
	public Film(long articleNumber, String title, String publisher, int length) {
		this.articleNumber = articleNumber;
		this.title = title;
		this.publisher = publisher;
		this.length = length;
	}

	public Actor[] getActors() {
		return actors;
	}

	public long getarticelNumber() {
		return articleNumber;
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
	
	public void addActor(Actor actor, int i) {
		// TO DO
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		if (!Arrays.equals(actors, other.actors))
			return false;
		if (articleNumber != other.articleNumber)
			return false;
		if (length != other.length)
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
