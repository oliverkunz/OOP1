
public class PrintMedium extends DataObject {
	private int pages;

	public PrintMedium(long articlenumber, String title,int pages) {
		super(articlenumber, title);
		this.pages = pages;		
	}

	public int getPages() {
		return pages;
	}

	@Override
	public String toString() {
		return "PrintMedium [pages=" + pages + ", getArticlenumber()=" + getArticlenumber() + ", getTitle()="
				+ getTitle() + "]";
	}

	/*@Override
	public String toString() {
		return super.toString() + "pages" + pages;
	}*/
	
		
}
