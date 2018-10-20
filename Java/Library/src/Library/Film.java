import java.util.Arrays;

public final class Film extends DataObject{
	private Actor[] actors;
	private final String publisher;
	private final int length;
	
	public Film(long articleNumber, String title, String publisher, int length) {
		super(articleNumber, title);
		this.publisher = publisher;
		this.length = length;
	}
	
	public Actor[] getActors() {
		return actors;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getLength() {
		return length;
	}
	
	public void addActor(Actor actor, int i) {
		this.actors[i] = actor;
	}

	@Override
	public String toString() {
		return "Film [actors=" + Arrays.toString(actors) + ", publisher=" + publisher + ", length=" + length
				+ ", getArticlenumber()=" + getArticlenumber() + ", getTitle()=" + getTitle() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		if (!Arrays.equals(actors, other.actors))
			return false;
		if (length != other.length)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		return true;
	}

}
