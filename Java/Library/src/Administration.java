import java.time.LocalDate;
import java.util.Date;

public class Administration {
	private Object[] objects;
	private Lending[] lendings;
	private Reservation[] reservations;
	private Customer[] customers;

	public Administration() {
		objects = new Object[20];
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

	public Object[] getObjects() {
		return objects;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void printObjects() {
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
		Object[] objects = admin.getObjects();
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
	
	public Journal findJournal(long articleNumber) {
		for (Object journal : this.objects) {
			if (journal instanceof Journal) {
				if (articleNumber == ((Journal)journal).getArticleNumber()) {
					return (Journal) journal;
				}
			}
		}
		return null;
	}
	
	public Journal findJournal(String title) {
		for (Object journal : this.objects) {
			if (journal instanceof Journal) {
				if (title == ((Journal)journal).getTitle()) {
					return (Journal) journal;
				}
			}
		}
		return null;
	}
	
	public Book findBook(String title) {
		for (Object book : this.objects) {
			if (book instanceof Book) {
				if (title == ((Book)book).getTitle()) {
					return (Book) book;
				}
			}
		}
		return null;
	}
	
	public Book findBook(Writer writer) {
		for (Object book : this.objects) {
			if (book instanceof Book) {
				if (writer == ((Book)book).getWriter()) {
					return (Book) book;
				}
			}
		}
		return null;
	}
	
	public Film findFilm(String title) {
		for (Object film : this.objects) {
			if (film instanceof Film) {
				if (title == ((Film)film).getTitle()) {
					return (Film) film;
				}
			}
		}
		return null;
	}
	
	public Film findFilm(Actor actor[]) {
		for (Object film : this.objects) {
			if (film instanceof Film) {
				if (actor == ((Film)film).getActors()) {
					return (Film) film;
				}
			}
		}
		return null;
	}
	
	public Music findMusic(String band) {
		for (Object music : this.objects) {
			if (music instanceof Music) {
				if (band == ((Music)music).getBand()) {
					return (Music) music;
				}
			}
		}
		return null;
	}
	
	private Lending getLastLending(Object object) {
        Lending lastLending = null;
        for (Lending lending : lendings) {
            if (object == lending.getObject()) {
                if (
                    lastLending == null ||
                    lending.getStartDate().isAfter(lastLending.getStartDate())
                ) {
                    lastLending = lending;
                }
            }
        }
        return lastLending;
    }
	
	public boolean isStuffAvailable(Object object) {
		for (Object stuff : this.lendings) {
			if (object == ((Lending)stuff).getObject()) {
				 return true;
			}
			if((getLastLending(object)).getReturnDate() != null) {
				return true;
			}
		}	
		return false;
	}
	
	public LocalDate getLendingEndDate(Object object) {
		LocalDate date = null;
		for (Object lending : this.lendings)
			if (object == ((Lending)lending).getObject()) {
				date = (getLastLending(object).getStartDate().minusMonths(-1));
			} else {
				date = LocalDate.now();
			}
		return date;	
	}
}

