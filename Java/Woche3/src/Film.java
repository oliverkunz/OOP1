
public class Film {
	
	public String title;
	public int ean;
	public int length;
	public Actor[] actors;
		
	public Film(String title, int ean, int length, Actor[] actors) {
		this.title = title;
		this.ean = ean;
		this.length = length;
		this.actors = actors;
	}
	
	public String getTitle() {
		return title;
	}
	public int getEan() {
		return ean;
	}
	public int getLength() {
		return length;
	}
	public Actor[] getActors() {
		return actors;
	}
	
	

}
