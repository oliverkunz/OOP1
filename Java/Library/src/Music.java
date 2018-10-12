
public final class Music {
	private final long articelNumber;
	private final String title;
	private final String band;
	private final int length;
	
	public Music(long articelNumber, String title, String band, int length) {
		this.articelNumber = articelNumber;
		this.title = title;
		this.band = band;
		this.length = length;
	}

	public long getArticelNumber() {
		return articelNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getBand() {
		return band;
	}

	public int getLength() {
		return length;
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		if (articelNumber != other.articelNumber)
			return false;
		if (band == null) {
			if (other.band != null)
				return false;
		} else if (!band.equals(other.band))
			return false;
		if (length != other.length)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
