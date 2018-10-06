import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	Person p1,p2;

	@BeforeEach  //--------- räumt vor dem testen auf
	void setUp() throws Exception {
		
		p1 = new Person("Peter", "Muster", 1980, 10 ,15);
		p1.setEmail("peter.muster@bfh.ch");
		p2 = new Person("Petra", "Muster", 1980, 11 ,2);
		p2.setEmail("petra.muster@bfh.ch");
				
	}

	@Test
	void testPerson1() {
		Assertions.assertNotNull(p1);

	}
	
	@Test
	void testPerson2() {
		Assertions.assertNotEquals(p1, p2);

	}

	@Test
	void testGetName() {
		Assertions.assertEquals("Peter Muster", p1.getName());
	}

	@Test
	void testGetFirstName() {
		Assertions.assertEquals("Petra", p2.getFirstName());
	}

	@Test
	void testGetLastName() {
		Assertions.assertEquals("Muster", p1.getLastName());
	}

	@Test
	void testGetDateOfBirth() {
		Assertions.assertTrue(p1.getDateOfBirth().getYear() < 2018);
	}

	@Test
	void testGetEmail() {
		Assertions.assertTrue(p1.getEmail().contains("@"));
	}

	@Test
	void testToString() {
		Assertions.assertEquals("Peter Muster 15.10.80", p1.toString());
	}

	@Test
	void testEqualsObject() {
		Assertions.assertFalse(p1.equals(p2));
	}

}
