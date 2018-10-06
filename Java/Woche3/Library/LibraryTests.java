
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import library1.data.Administration;
import library1.data.Book;
import library1.data.Journal;
import library1.data.Lending;
import library1.data.Music;
import library1.data.Reservation;

class Library1Tests {
	private Administration admin;

	@BeforeEach
	private void setUp() {
		admin = new Administration();
		admin.testSetUp();
	}

	@Test
	void test1() {
		assertNotNull(admin.getObjects()[0]);
	}

}
