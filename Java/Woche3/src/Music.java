
public class Music {
	private long articelNumber;
	private String title;
	private String band;
	private int length;
	
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
	
}
