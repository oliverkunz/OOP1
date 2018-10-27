package library.admin;

import java.util.ArrayList;
import java.util.List;

import library.data.*;
import library.util.Util;

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
	
	public Item isDataObjectAvailable(DataObject obj) {
		Item[] items = Util.merge(bookItems, musicItems, filmItems, journalItems);
		for (Item item : items) {
			if(item.getDataObject().equals(obj)) {
				return item;
			}	
		}
		return null;
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
	
	public long[] findItems(String title) {
		List<Long> itemIds = new ArrayList<>();
		
		Item[] items = Util.merge(bookItems, musicItems, filmItems, journalItems);
		for (Item item : items) {
			if (item.getDataObject().getTitle().equals(title)) {
				itemIds.add(item.getId());
			}
		}
		return Util.listToArray(itemIds);
	}
	
	
	
	public long[] findBookItems(Writer writer) {
		List<Long> itemIds = new ArrayList<>();
		
		for (BookItem item : this.bookItems) {
			if (item.getBook().getWriter().equals(writer)) {
				itemIds.add(item.getId());
			}
		}
		return Util.listToArray(itemIds);
	}
	
	public long[] findFilmItems(Actor actor) {
		List<Long> itemIds = new ArrayList<>();
		
		for (FilmItem item : this.filmItems) {
			for(Actor itemActor : item.getFilm().getActors()) {
				if(itemActor != null && itemActor.equals(actor)) {
					itemIds.add(item.getId());
				}
			}
		}
		return Util.listToArray(itemIds);
	}
		
	public long[] findMusicItems(String band) {
		List<Long> itemIds = new ArrayList<>();
			
		for (MusicItem item : this.musicItems) {
			if (item.getMusic().getBand().equals(band)) {
				itemIds.add(item.getId());
			}
		}
		return Util.listToArray(itemIds);
	}	
	
}
