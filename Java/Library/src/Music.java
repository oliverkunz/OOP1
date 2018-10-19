
public final class Music extends DataObject {
	private final String band;
	private final int length;
	
	public Music(long articleNumber, String title, String band, int length) {
		super(articleNumber, title);
		this.band = band;
		this.length = length;
	}

	public String getBand() {
		return band;
	}

	public int getLength() {
		return length;
	}

	@Override
	public String toString() {
		return "Music [band=" + band + ", length=" + length + ", getArticlenumber()=" + getArticlenumber()
				+ ", getTitle()=" + getTitle() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		if (band == null) {
			if (other.band != null)
				return false;
		} else if (!band.equals(other.band))
			return false;
		if (length != other.length)
			return false;
		return true;
	}

}
