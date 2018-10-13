
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LibraryTests {
	private Administration admin;
	private Object[] objects;
	private Lending[] lendings;

	@BeforeEach
	private void setUp() {
		admin = TestSetUp.testSetUp();
		objects = admin.getObjects();
		lendings = admin.getLendings();
	}
	
	//----------------------------Uebung4
	
	@Test
	void testFindJournal() {
		Journal obj = (Journal)admin.findJournal(17);
		Assertions.assertEquals(obj, objects[16]);
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
		Assertions.assertEquals((Book)admin.findBook(new Writer("Barbara", "Schreiberin")), objects[0]);
	}
	
	@Test
	void testFindFilm2() {
		Assertions.assertEquals((Film)admin.findFilm(new Actor("Portmann", "Natalie")), objects[9]);
	}
	//to do, muss noch gelöst werden...
	
	@Test
	void testAvailableBook() {
		Assertions.assertFalse(admin.isStuffAvailable((Book)objects[1]));
	}
	
	@Test
	void testAvailableBook2() {
		Assertions.assertFalse(admin.isStuffAvailable((Book)objects[2]));
	}
	
	@Test
	void testAvailableBook3() {
		Assertions.assertFalse(admin.isStuffAvailable((Book)objects[3]));
	}
	
	@Test
	void testAvailableMusic() {
		Assertions.assertFalse(admin.isStuffAvailable((Music)objects[7]));
	}
	
	@Test
	void testAvailableMusic2() {
		Assertions.assertFalse(admin.isStuffAvailable((Music)objects[8]));
	}
	
	@Test
	void testAvailableFilm() {
		Assertions.assertFalse(admin.isStuffAvailable((Film)objects[9]));
	}
	
	@Test
	void testAvailableFilm2() {
		Assertions.assertFalse(admin.isStuffAvailable((Film)objects[10]));
	}
	
	@Test
	void testAvailableJournal() {
		Assertions.assertFalse(admin.isStuffAvailable((Journal)objects[11]));
	}
	
	@Test
	void testAvailableJournal2() {
		Assertions.assertFalse(admin.isStuffAvailable((Journal)objects[12]));
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
		Assertions.assertNotEquals(new Book(1, "", new Writer("", ""), 0, 0), new Book(1, "", new Writer("", ""), 0, 0));
	}
	
	@Test
	void testImmutableFilm() {
		Assertions.assertNotEquals(new Film(1, "","",0), new Film(1, "","",0));
	}
	
	void testImmutableMusic() {
		Assertions.assertNotEquals(new Music(1, "","",0), new Music(1, "","",0));
	}
	
	void testImmutableJournal() {
		Assertions.assertNotEquals(new Journal(1, "","",0), new Journal(1, "","",0));
	}
}




















