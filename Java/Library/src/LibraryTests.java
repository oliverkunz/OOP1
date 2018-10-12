

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


class LibraryTests {
	private Administration admin;
	private Object[] objects;

	@BeforeEach
	private void setUp() {
		admin = TestSetUp.testSetUp();
		objects = admin.getObjects();
		lendings = admin.getLendings();
	}

	@Test
	void test01() {
		Assertions.assertNotEquals(new Book(1, "", new Writer("", ""), 0, 0), 
			new Book(1, "", new Writer("", ""), 0, 0));
	}

	@Test
	void test05() {
		Book obj = (Book) objects[0];
		assertTrue(admin.isBookAvailable(obj));
	}
	
	@Test
	void test06() {
		Book obj = (Book) objects[1];
		assertFalse(admin.isBookAvailable(obj));
	}

	@Test
	void test15() {
		Book obj = (Book) objects[0];
		assertEquals(admin.getLendingEndDate(obj), LocalDate.now());
	}

	@Test
	void test25() {
		Film obj = (Film)admin.findFilm(new Actor("Portman", "Natalie"));
		assertEquals(obj, objects[9]);
	}
}
