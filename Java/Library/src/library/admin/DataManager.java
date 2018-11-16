package library.admin;

import java.util.ArrayList;
import java.util.List;

import library.data.Actor;
import library.data.BookItem;
import library.data.DataObject;
import library.data.Customer;
import library.data.FilmItem;
import library.data.Item;
import library.data.JournalItem;
import library.data.MusicItem;
import library.data.Writer;

public class DataManager {
	private Customer[] customers;
	private BookItem[] bookItems;
	private FilmItem[] filmItems;
	private MusicItem[] musicItems;
	private JournalItem[] journalItems;

	public DataManager() {
		customers = new Customer[20];
		bookItems = new BookItem[30];
		filmItems = new FilmItem[30];
		musicItems = new MusicItem[30];
		journalItems = new JournalItem[30];
	}

	public long[] findItemsByArticleNumber(long ean) throws NoItemsFoundException {
		List<Long> result = new ArrayList<>();
		Item[] items = Utils.merge(bookItems, musicItems, filmItems, journalItems);
		for (Item item : items) {
			if(item.getId() == ean) {
				result.add(item.getId());
			}
		}
		if (result.size() == 0) {
			throw new NoItemsFoundException("Keine Items gefunden");
		}
		return Utils.listToArray(result);
	}
	
	public long[] findItems(String s) throws NoItemsFoundException {
		long[] result = null;
		result = Utils.concat(result, findBookItems(s));
		result = Utils.concat(result, findMusicItems(s));
		result = Utils.concat(result, findFilmItems(s));
		result = Utils.concat(result, findJournalItems(s));
		if (result.equals(null)) {
			throw new NoItemsFoundException("Keine Items gefunden");
		}
		return result;
	}

	public Item findItem(long id) throws NoItemsFoundException {
		Item[] items = Utils.merge(bookItems, musicItems, filmItems, journalItems);
		for (Item item : items) {
			if (item.getId() == id) {
				return item;
			}
		}
		throw new NoItemsFoundException("Kein Item gefunden");
	}

	public <T> long[] findItems(Class<T> type, String string) throws NoItemsFoundException {
		List<Long> ids = new ArrayList<>();
		for (long id : this.findItems(string)) {
			
			DataObject object = this.findItem(id).getDataObject();
			
			if (type.isInstance(object)) {
				ids.add(id);
		    }
		}
		if (ids.size() == 0 ) {
			throw new NoItemsFoundException("Keine Items gefunden");
		}
		return Utils.listToArray(ids);
	}
	

	public long[] findItems(String title, Actor actor) throws NoItemsFoundException {
		List<Long> ids = new ArrayList<>();
		for (FilmItem film : filmItems) {
			if (film.getFilm().getTitle().equals(title) && film.getFilm().getActors().equals(actor)) {
				ids.add(film.getId());
			}
		}
		if (ids.size() == 0) {
			throw new NoItemsFoundException("Keine Items gefunden");
		}
		return Utils.listToArray(ids);
	}

	public long[] findItems(Writer writer) throws NoItemsFoundException {
		List<Long> ids = new ArrayList<>();
		for (BookItem book : bookItems) {
			if (book.getBook().getWriter().equals(writer)) {
				ids.add(book.getId());
			}
		}
		if (ids.size() == 0) {
			throw new NoItemsFoundException("Keine Items gefunden");
		}
		return Utils.listToArray(ids);
	}

	public long[] findItems(Actor actor) throws NoItemsFoundException {
		List<Long> ids = new ArrayList<>();
		for (FilmItem film : filmItems) {
			if (this.contains(film.getFilm().getActors(), actor)) {
				ids.add(film.getId());
			}
		}
		if (ids.size() == 0) {
			throw new NoItemsFoundException("Keine Items gefunden");
		}
		return Utils.listToArray(ids);
	}
	
	private long[] findBookItems(String title) {
		List<Long> ids = new ArrayList<>();
		for (BookItem book : bookItems) {
			if (book.getBook().getTitle().equals(title)) {
				ids.add(book.getId());
			}
		}
		return Utils.listToArray(ids);
	}

	private long[] findMusicItems(String s) {
		List<Long> ids = new ArrayList<>();
		for (MusicItem music : musicItems) {
			if (music.getMusic().getTitle().equals(s) || music.getMusic().getBand().equals(s)) {
				ids.add(music.getId());
			}
		}
		return Utils.listToArray(ids);
	}

	private long[] findFilmItems(String s) {
		List<Long> ids = new ArrayList<>();
		for (FilmItem film : filmItems) {
			if (film.getFilm().getTitle().equals(s) || film.getFilm().getPublisher().equals(s)) {
				ids.add(film.getId());
			}
		}
		return Utils.listToArray(ids);
	}

	private long[] findJournalItems(String s) {
		List<Long> ids = new ArrayList<>();
		for (JournalItem journal : journalItems) {
			if (journal.getJournal().getTitle().equals(s) || journal.getJournal().getPublisher().equals(s)) {
				ids.add(journal.getId());
			}
		}
		return Utils.listToArray(ids);
	}	

	private boolean contains(Actor[] actors, Actor actor) {
		for (Actor a : actors) {
			if (a != null && a.equals(actor))
				return true;
		}
		return false;
	}

	public void printItems() {
		for (BookItem e : bookItems) {
			System.out.println(e.toString());
		}
		for (MusicItem e : musicItems) {
			System.out.println(e.toString());
		}
		for (FilmItem e : filmItems) {
			System.out.println(e.toString());
		}
		for (JournalItem e : journalItems) {
			System.out.println(e.toString());
		}
	}
	
	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	    }

	public Customer[] getCustomers() {
		return customers;
	}

	public BookItem[] getBookItems() {
		return bookItems;
	}

	public FilmItem[] getFilmItems() {
		return filmItems;
	}

	public MusicItem[] getMusicItems() {
		return musicItems;
	}

	public JournalItem[] getJournalItems() {
		return journalItems;
	}
}
