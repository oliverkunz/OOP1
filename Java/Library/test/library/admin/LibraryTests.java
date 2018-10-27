package library.admin;
import library.admin.Administration;
import library.data.Actor;
import library.data.Book;
import library.data.Customer;
import library.data.DataObject;
import library.data.Film;
import library.data.Item;
import library.data.Journal;
import library.data.Lending;
import library.data.Music;
import library.data.Person;
import library.data.PrintMedium;
import library.data.Writer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LibraryTests {
	private Administration admin;
	private DataObject[] objects;
	private Lending[] lendings;

	@BeforeEach
	private void setUp() {
		admin = TestSetUp.testSetUp();
		objects = admin.getDataObjects();
		lendings = admin.getLendings();
	}
	
	//----------------------------Uebung5
	
	@Test
	void FindJournal() {
		assertEquals(admin.findJournal(17), objects[16]);
	}
	
	@Test
	void FindBook() {
		Item obj = admin.findItems("Behind the Moon");
		Assertions.assertEquals(obj, objects[2]);
	}
	
	@Test
	void FindMusic() {
		Music obj = (Music)admin.findMusic("Abba");
		Assertions.assertEquals(obj, objects[7]);
	}
	
	@Test
	void FindJournal2() {
		Journal obj = (Journal)admin.findJournal("Nature");
		Assertions.assertEquals(obj, objects[11]);
	}
	
	@Test
	void FindFilm() {
		Film obj = (Film)admin.findFilm("Star Wars I");
		Assertions.assertEquals(obj, objects[9]);
	}
	
	@Test
	void FindBook2() {
		assertEquals(admin.findBookItems(new Writer("Schreiberin", "Barbara")),objects[0]);
	}
	
	@Test
	void FindFilm2() {
		assertEquals(admin.findFilm(new Actor("Portman", "Natalie")), objects[9]);
	}
	
	@Test
	void AvailableBook() {
		assertFalse(admin.isBookAvailable((Book)objects[1]));
	}
	
	@Test
	void AvailableBook2() {
		assertFalse(admin.isBookAvailable((Book)objects[2]));
	}
	
	@Test
	void AvailableBook3() {
		assertTrue(admin.isBookAvailable((Book)objects[3]));
	}
	
	@Test
	void AvailableMusic() {
		assertFalse(admin.isMusicAvailable((Music)objects[7]));
	}
	
	@Test
	void AvailableMusic2() {
		assertFalse(admin.isMusicAvailable((Music)objects[8]));
	}
	
	@Test
	void AvailableFilm() {
		Assertions.assertFalse(admin.isFilmAvailable((Film)objects[9]));
	}
	
	@Test
	void AvailableFilm2() {
		Assertions.assertFalse(admin.isFilmAvailable((Film)objects[10]));
	}
	
	@Test
	void AvailableJournal() {
		Assertions.assertFalse(admin.isJournalAvailable((Journal)objects[11]));
	}
	
	@Test
	void AvailableJournal2() {
		Assertions.assertFalse(admin.isJournalAvailable((Journal)objects[12]));
	}
	
	@Test
	void GetLendingEndDateBook() {
		assertEquals(admin.getLendingEndDate((Book) objects[0]), LocalDate.now());
	}
	
	@Test
	void GetLendingEndDateBook2() {
		assertEquals(admin.getLendingEndDate((Book) objects[1]), LocalDate.of(2018, 11, 1));
	}
	
	@Test
	void GetLendingEndDateMusic() {
		assertEquals(admin.getLendingEndDate((Music) objects[7]), LocalDate.of(2018, 10, 23));
	}
	
	@Test
	void GetLendingEndDateFilm() {
		assertEquals(admin.getLendingEndDate((Film) objects[10]), LocalDate.of(2018, 10, 24));
	}
	
	@Test
	void BookInheritance() {
		assertTrue(objects[0] instanceof PrintMedium);
	}
	
	@Test
	void BookInheritance2() {
		assertTrue(objects[0] instanceof DataObject);
	}
	
	@Test
	void JournalInheritance() {
		assertTrue(objects[11] instanceof PrintMedium);
	}
	
	@Test
	void FilmInheritance() {
		assertTrue(objects[9] instanceof DataObject);
	}
	
	@Test
	void MusicInheritance() {
		assertTrue(new Music(1234, "Survive", "Don Diablo", 200) instanceof DataObject);
	}
	
	@Test
	void WriterInheritance() {
		assertTrue(new Writer("Oliver", "Kunz") instanceof Person);
	}
	
	@Test
	void CustomerInheritance() {
		assertTrue(new Customer("Kunz", "Oliver", "oliver.kunz@test.com") instanceof Person);
	}
	
	@Test
	void ActorInheritance() {
		assertTrue(new Actor("Kunz", "Oliver") instanceof Person);
	}
	
	
	
}


