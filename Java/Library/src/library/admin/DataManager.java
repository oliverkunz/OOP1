package library.admin;

import library.data.*;

public class DataManager {
	private DataObject[] dataObjects;
	private Customer[] customers;
	private BookItem[] bookItems;
	private MusicItem[] musicItems;
	private FilmItem[] filmItems;
	private JournalItem[] journalItems;
	
	public DataManager() {
		this.customers = new Customer[3];
		this.dataObjects = new DataObject[44];
		this.bookItems = new BookItem[14];
		this.musicItems = new MusicItem[12];
		this.filmItems = new FilmItem[6];
		this.journalItems = new JournalItem[12];		
	}
	
	public DataObject[] getDataObjects() {
		return this.dataObjects;
	}
	
	public Customer[] getCustomers() {
		return this.customers;
	}
	
	public BookItem[] getBookItems() {
		return this.bookItems;
	}
	
	public FilmItem[] getFilmItems() {
		return this.filmItems;
	}
	
	public MusicItem[] getMusicItems() {
		return this.musicItems;
	}
	
	public JournalItem[] getJournalItems() {
		return this.journalItems;
	}
	
	public DataObject findDataObject(long articleNumber) {
		for (DataObject dataObject : this.dataObjects) {
			if (dataObject instanceof DataObject) {
				if (articleNumber == ((DataObject)dataObject).getArticlenumber()) {
					return (DataObject) dataObject;
				}
			}
		}
		return null;
	}
	
	public DataObject findDataObject(String title) {
		for (DataObject dataObject : this.dataObjects) {
			if (dataObject instanceof DataObject) {
				if (title == ((DataObject)dataObject).getTitle()) {
					return (DataObject) dataObject;
				}
			}
		}
		return null;
	}
	
	public Journal findJournal(long articleNumber) {
		for (DataObject journal : this.dataObjects) {
			if (journal instanceof Journal) {
				if (articleNumber == ((Journal)journal).getArticlenumber()) {
					return (Journal) journal;
				}
			}
		}
		return null;
	}
	
	public Journal findJournal(String title) {
		for (DataObject journal : this.dataObjects) {
			if (journal instanceof Journal) {
				if (title == ((Journal)journal).getTitle()) {
					return (Journal) journal;
				}
			}
		}
		return null;
	}
	
	public Book findBook(String title) {
		for (DataObject book : this.dataObjects) {
			if (book instanceof Book) {
				if (title == ((Book)book).getTitle()) {
					return (Book) book;
				}
			}
		}
		return null;
	}
	
	public Book findBook(Writer writer) {
		for(DataObject book : this.dataObjects) {
			if(book instanceof Book && ((Book) book).getWriter().equals(writer)) {
				return (Book)book;
			}
		}
		
		return null;
	}
	
	public Film findFilm(String title) {
		for (DataObject film : this.dataObjects) {
			if (film instanceof Film) {
				if (title == ((Film)film).getTitle()) {
					return (Film) film;
				}
			}
		}
		return null;
	}
	
	public Film findFilm(Actor searchActor) {
		for (DataObject film : this.dataObjects) {
			if (film instanceof Film) {
				for(Actor actor : ((Film) film).getActors()) {
					if(actor.equals(searchActor)) {
						return (Film)film;
					}
				}
			}
		}
		return null;
	}
	
	public Music findMusic(String band) {
		for (DataObject music : this.dataObjects) {
			if (music instanceof Music) {
				if (band == ((Music)music).getBand()) {
					return (Music) music;
				}
			}
		}
		return null;
	}

}
