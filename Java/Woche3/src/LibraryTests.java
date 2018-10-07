
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import library1.data.Administration;
//import library1.data.Book;
//import library1.data.Journal;
//import library1.data.Lending;
//import library1.data.Music;
//import library1.data.Reservation;

class LibraryTests {
	private Administration admin;

	@BeforeEach
	private void setUp() {
		admin = new Administration();
		admin.testSetUp();
	}
	
	@Test
	void TestBook() {
		assertNotNull(admin.getObjects()[0]);
	}
	
	@Test
	void TestBook2() {
		assertTrue(admin.getObjects()[0] instanceof Book);
	}
	
	@Test
	void TestFilm() {
		assertNotNull(admin.getObjects()[9]);
	}
	
	@Test
	void TestFilm2() {
		assertTrue(admin.getObjects()[9] instanceof Film);
	}
	
	@Test
	void TestJournal() {
		assertNotNull(admin.getObjects()[11]);
	}
	
	@Test
	void TestJournal2() {
		assertTrue(admin.getObjects()[11] instanceof Journal);
	}
	
	@Test
	void TestMusic() {
		assertNotNull(admin.getObjects()[7]);
	}
	
	@Test
	void TestMusic2() {
		assertTrue(admin.getObjects()[7] instanceof Music);
	}
	
	@Test
	void Test1() {
		Assertions.assertNotNull(((Book)admin.getObjects()[0]).getTitle());
	}
	
	@Test
	void Test1Teil2() {
		Assertions.assertNotEquals(((Book)admin.getObjects()[0]), "");
	}
	
	@Test
	void Test2() {
		Assertions.assertTrue(((Journal)admin.getObjects()[11]).getPages() > 100);
	}
	
	void Test3() {
		Assertions.assertEquals(((Music)admin.getObjects()[7]).getBand(), "Abba");
	}
	
	void Test4() {
		Assertions.assertEquals(((Journal)admin.getObjects()[12]).getPublisher(), "Gruner");
	}
	
	void Test5() {
		Assertions.assertEquals(((Lending)admin.getObjects()[4]).getCustomer(), "Seher");
	}
	
	void Test6() {
		Assertions.assertEquals(((Book)admin.getObjects()[1]).getWriter().getFirstname(), "Hans");
	}
	
	void Test7() {
		Assertions.assertTrue(((Lending)admin.getObjects()[3]).getStartDate().isBefore(LocalDate.now()));
	}
	
	void Test8() {
		Assertions.assertTrue(((Reservation)admin.getObjects()[0]).getReservationDate().isBefore(LocalDate.now()));
	}

}
