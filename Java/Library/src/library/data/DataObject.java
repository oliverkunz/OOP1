package library.data;

public class DataObject {
	private long articlenumber;
	private String title;
	
	public DataObject(long articlenumber, String title) {
		this.articlenumber = articlenumber;
		this.title = title;
	}

	public long getArticlenumber() {
		return articlenumber;
	}

	public void setArticlenumber(long articlenumber) {
		this.articlenumber = articlenumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataObject other = (DataObject) obj;
		if (articlenumber != other.articlenumber)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}




