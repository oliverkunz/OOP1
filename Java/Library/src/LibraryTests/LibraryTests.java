package LibraryTests;
import Library.*;

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
	void testFindJournal() {
		assertEquals(admin.findJournal(17), objects[16]);
	}
	
	@Test
	void testFindBook() {
		Book obj = (Book)admin.findBook("Behind the Moon");
		Assertions.assertEquals(obj, objects[2]);
	}
	
	@Test
	void testFindMusic() {
		Music obj = (Music)admin.findMusic("Abba");
		Assertions.assertEquals(obj, objects[7]);
	}
	
	@Test
	void testFindJournal2() {
		Journal obj = (Journal)admin.findJournal("Nature");
		Assertions.assertEquals(obj, objects[11]);
	}
	
	@Test
	void testFindFilm() {
		Film obj = (Film)admin.findFilm("Star Wars I");
		Assertions.assertEquals(obj, objects[9]);
	}
	
	@Test
	void testFindBook2() {
		assertEquals(admin.findBook(new Writer("Schreiberin", "Barbara")), objects[0]);
	}
	
	/*@Test
	void testFindFilm2() {
		assertEquals(admin.findFilm(new Actor("Portmann", "Natalie")), objects[9]);
	}*/
	
	@Test
	void testAvailableBook() {
		assertFalse(admin.isBookAvailable((Book)objects[1]));
	}
	
	@Test
	void testAvailableBook2() {
		assertFalse(admin.isBookAvailable((Book)objects[2]));
	}
	
	@Test
	void testAvailableBook3() {
		assertTrue(admin.isBookAvailable((Book)objects[3]));
	}
	
	@Test
	void testAvailableMusic() {
		assertFalse(admin.isMusicAvailable((Music)objects[7]));
	}
	
	@Test
	void testAvailableMusic2() {
		assertFalse(admin.isMusicAvailable((Music)objects[8]));
	}
	
	@Test
	void testAvailableFilm() {
		Assertions.assertFalse(admin.isFilmAvailable((Film)objects[9]));
	}
	
	@Test
	void testAvailableFilm2() {
		Assertions.assertFalse(admin.isFilmAvailable((Film)objects[10]));
	}
	
	@Test
	void testAvailableJournal() {
		Assertions.assertFalse(admin.isJournalAvailable((Journal)objects[11]));
	}
	
	@Test
	void testAvailableJournal2() {
		Assertions.assertFalse(admin.isJournalAvailable((Journal)objects[12]));
	}
	
	@Test
	void testGetLendingEndDateBook() {
		assertEquals(admin.getLendingEndDate((Book) objects[0]), LocalDate.now());
	}
	
	@Test
	void testGetLendingEndDateBook2() {
		assertEquals(admin.getLendingEndDate((Book) objects[1]), LocalDate.of(2018, 11, 1));
	}
	
	@Test
	void testGetLendingEndDateMusic() {
		assertEquals(admin.getLendingEndDate((Music) objects[7]), LocalDate.of(2018, 10, 23));
	}
	
	@Test
	void testGetLendingEndDateFilm() {
		assertEquals(admin.getLendingEndDate((Film) objects[10]), LocalDate.of(2018, 10, 24));
	}
	
	@Test
	void testImmutableBook() {
		assertNotEquals(new Book(1, "", new Writer("", ""), 0, 0), new Book(1, "", new Writer("", ""), 0, 0));
	}
	
	@Test
	void testImmutableFilm() {
		assertNotEquals(new Film(1, "","",0), new Film(1, "","",0));
	}
	
	void testImmutableMusic() {
		assertNotEquals(new Music(1, "","",0), new Music(1, "","",0));
	}
	
	void testImmutableJournal() {
		assertNotEquals(new Journal(1, "","",0), new Journal(1, "","",0));
	}
}


