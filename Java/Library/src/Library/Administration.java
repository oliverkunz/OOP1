package Library;
import java.time.LocalDate;

public class Administration {
	private DataObject[] objects;
	private Lending[] lendings;
	private Reservation[] reservations;
	private Customer[] customers;

	public Administration() {
		objects = new DataObject[20];
		lendings = new Lending[20];
		reservations = new Reservation[20];
		customers = new Customer[20];
	};

	public Lending[] getLendings() {
		return lendings;
	}
	
	public Reservation[] getReservations() {
		return reservations;
	}

	public DataObject[] getDataObjects() {
		return objects;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void printDataObjects() {
		for (Object e : objects) {
			System.out.println(e.toString());
		}
	}

	public void printLendings() {
		for (Lending l : lendings) {
			System.out.println(l.toString());
		}
	}
	
	public static Administration testSetUp() {
		Administration admin = new Administration();
		DataObject[] objects = admin.getDataObjects();
		int counter = 1;
		Writer[] w = new Writer[7];
		w[0] = new Writer("Schreiberin", "Barbara");
		w[1] = new Writer("Schreiber", "Hans");
		w[2] = new Writer("Schreiber", "Peter");
		w[3] = new Writer("Schreiber", "Willi");
		w[4] = new Writer("Schreiber", "Rolf");
		w[5] = new Writer("Schreiberin", "Anna");
		w[6] = new Writer("Schreiberin", "Marie");
		objects[0] = new Book(counter++, "On the Road", w[0], 530, 1997);
		objects[1] = new Book(counter++, "The last Day", w[1], 650, 1891);
		objects[2] = new Book(counter++, "Behind the Moon", w[2], 300, 2005);
		objects[3] = new Book(counter++, "The Day after", w[3], 620, 2007);
		objects[4] = new Book(counter++, "The Hour", w[4], 510, 2012);
		objects[5] = new Book(counter++, "Kings Field", w[5], 320, 2015);
		objects[6] = new Book(counter++, "Why", w[6], 170, 2017);
		objects[7] = new Music(counter++, "The Best Of", "Abba", 68);
		objects[8] = new Music(counter++, "The Best Of", "Pink Floyd", 72);
		objects[9] = new Film(counter++, "Star Wars I", "Lucas Film", 145);
		((Film)objects[9]).addActor(new Actor("Norton","Edward" ), 0);
		((Film)objects[9]).addActor(new Actor("Bale","Christian" ), 1);
		objects[10] = new Film(counter++, "Star Wars II", "Lucas Film", 175);
		((Film)objects[9]).addActor(new Actor("Waltz","Christoph" ), 0);
		((Film)objects[9]).addActor(new Actor("Portman","Natalie" ), 1);
		objects[11] = new Journal(counter++, "Nature", "Springer", 108);
		objects[12] = new Journal(counter++, "GEO", "Gruner", 82);
		objects[13] = new Journal(counter++, "LNCS", "Springer", 98);
		objects[14] = new Journal(counter++, "Film heute", "Tack", 88);
		objects[15] = new Journal(counter++, "JSTOR", "Oldenburg", 78);
		objects[16] = new Journal(counter++, "Elemente", "Springer", 54);

		Customer leser = new Customer("Leser", "Bruno", "bruno@leser.com");
		Customer seher = new Customer("Seher", "Kurt", "kurt@seher.com");
		Customer hoerer = new Customer("Hörer", "Emma", "emma@hoerer.com");

		Lending[] lendings = admin.getLendings();

		lendings[0] = new Lending(leser, objects[1], LocalDate.of(2018, 9, 4));
		lendings[0].setReturnDate(LocalDate.of(2018, 9, 15));
		lendings[1] = new Lending(leser, objects[2], LocalDate.of(2018, 9, 4));
		lendings[1].setReturnDate(LocalDate.of(2018, 9, 16));
		lendings[2] = new Lending(leser, objects[12], LocalDate.of(2018, 9, 5));
		lendings[2].setReturnDate(LocalDate.of(2018, 9, 18));
		lendings[3] = new Lending(hoerer, objects[7], LocalDate.of(2018, 9, 6));
		lendings[3].setReturnDate(LocalDate.of(2018, 9, 17));
		lendings[4] = new Lending(hoerer, objects[8], LocalDate.of(2018, 9, 7));
		lendings[4].setReturnDate(LocalDate.of(2018, 9, 12));
		lendings[5] = new Lending(seher, objects[10], LocalDate.of(2018, 9, 8));
		lendings[5].setReturnDate(LocalDate.of(2018, 9, 18));
		lendings[6] = new Lending(seher, objects[9], LocalDate.of(2018, 9, 10));
		lendings[6].setReturnDate(LocalDate.of(2018, 9, 19));
		lendings[7] = new Lending(seher, objects[1], LocalDate.of(2018, 9, 20));
		lendings[8] = new Lending(leser, objects[2], LocalDate.of(2018, 9, 22));
		lendings[9] = new Lending(leser, objects[3], LocalDate.of(2018, 9, 20));
		lendings[9].setReturnDate(LocalDate.of(2018, 9, 25));
		lendings[10] = new Lending(leser, objects[12], LocalDate.of(2018, 9, 21));
		lendings[11] = new Lending(hoerer, objects[7], LocalDate.of(2018, 9, 23));
		lendings[12] = new Lending(hoerer, objects[8], LocalDate.of(2018, 9, 23));
		lendings[13] = new Lending(seher, objects[10], LocalDate.of(2018, 9, 24));
		lendings[14] = new Lending(seher, objects[9], LocalDate.of(2018, 9, 24));
		lendings[15] = new Lending(seher, objects[1], LocalDate.of(2018, 10, 1));
		lendings[16] = new Lending(hoerer, objects[11], LocalDate.of(2018, 10, 2));
		lendings[17] = new Lending(hoerer, objects[14], LocalDate.of(2018, 10, 4));
		lendings[18] = new Lending(leser, objects[15], LocalDate.of(2018, 10, 3));
		lendings[19] = new Lending(leser, objects[16], LocalDate.of(2018, 10, 6));

		admin.getReservations()[0] = new Reservation(leser, objects[12], LocalDate.of(2018, 10, 1));
		admin.getReservations()[1] = new Reservation(leser, objects[7], LocalDate.of(2018, 10, 2));
		return admin;
		
	}
	public DataObject findDataObject(long articleNumber) {
		for (DataObject dataObject : this.objects) {
			if (dataObject instanceof DataObject) {
				if (articleNumber == ((DataObject)dataObject).getArticlenumber()) {
					return (DataObject) dataObject;
				}
			}
		}
		return null;
	}
	
	public DataObject findDataObject(String title) {
		for (DataObject dataObject : this.objects) {
			if (dataObject instanceof DataObject) {
				if (title == ((DataObject)dataObject).getTitle()) {
					return (DataObject) dataObject;
				}
			}
		}
		return null;
	}
	
	public Journal findJournal(long articleNumber) {
		for (DataObject journal : this.objects) {
			if (journal instanceof Journal) {
				if (articleNumber == ((Journal)journal).getArticlenumber()) {
					return (Journal) journal;
				}
			}
		}
		return null;
	}
	
	public Journal findJournal(String title) {
		for (DataObject journal : this.objects) {
			if (journal instanceof Journal) {
				if (title == ((Journal)journal).getTitle()) {
					return (Journal) journal;
				}
			}
		}
		return null;
	}
	
	public Book findBook(String title) {
		for (DataObject book : this.objects) {
			if (book instanceof Book) {
				if (title == ((Book)book).getTitle()) {
					return (Book) book;
				}
			}
		}
		return null;
	}
	
	public Book findBook(Writer writer) {
		for(DataObject book : this.objects) {
			if(book instanceof Book && ((Book) book).getWriter().equals(writer)) {
				return (Book)book;
			}
		}
		
		return null;
	}
	
	public Film findFilm(String title) {
		for (DataObject film : this.objects) {
			if (film instanceof Film) {
				if (title == ((Film)film).getTitle()) {
					return (Film) film;
				}
			}
		}
		return null;
	}
	
	public Film findFilm(Actor searchActor) {
		for (DataObject film : this.objects) {
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
		for (DataObject music : this.objects) {
			if (music instanceof Music) {
				if (band == ((Music)music).getBand()) {
					return (Music) music;
				}
			}
		}
		return null;
	}
	
	public boolean isBookAvailable(Book book) {
		return this.isObjectAvailable(book);
	}
	
	public boolean isJournalAvailable(Journal journal) {
		return this.isObjectAvailable(journal);
	}
	
	public boolean isFilmAvailable(Film film) {
		return this.isObjectAvailable(film);
	}
	
	public boolean isMusicAvailable(Music music) {
		return this.isObjectAvailable(music);
	}
	
	private boolean isObjectAvailable(DataObject object) {
		for(Lending lending : this.lendings) {
			if(lending.getDataObject().equals(object) && lending.getReturnDate() == null) {
				return false;
			}
		}
		
		return true;
	}
	
	public LocalDate getLendingEndDate(DataObject object) {
		Lending lastLending = null;
		
		for(Lending lending : lendings) {
			if(lending.getDataObject().equals(object) && (lastLending == null || lending.getStartDate().isAfter(lastLending.getStartDate()))) {
				lastLending = lending;
			}
		}
		
		if(lastLending != null && lastLending.getReturnDate() != null) {
			return lastLending.getReturnDate();
		}
		
		if(lastLending != null && lastLending.getStartDate() != null) {
			return lastLending.getStartDate().minusMonths(-1);
		}		
		
		return LocalDate.now();
	}
	
}

