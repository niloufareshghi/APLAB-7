package flight.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FlightTest {
	
	static Flight flight;
	static Airplane airplane;

	@BeforeAll
	public static void createFlight() {
		airplane = new Airplane("B",220);
		flight = new Flight("Luftansa","3205A","Toronto","Paris","23:30 3/2/2020",airplane);
	}

	@Test
	void testGetID() {
		assertNotNull(flight.getID());
		assertEquals("3205A", flight.getID());
	}

	@Test
	void testGetCompany() {
		assertNotNull(flight.getCompany());
		assertEquals("Luftansa", flight.getCompany());
	}

	@Test
	void testGetDest() {
		assertNotNull(flight.getDest());
		assertEquals("Toronto", flight.getDest());
	}

	@Test
	void testGetOrigin() {
		assertNotNull(flight.getOrigin());
		assertEquals("Paris",flight.getOrigin());
	}

	@Test
	void testGetTime() {
		assertNotNull(flight.getTime());
		assertEquals("23:30 3/2/2020",flight.getTime());
	}

	@Test
	void testGetAirplane() {
		assertNotNull(flight.getAirplane());
		assertEquals(airplane, flight.getAirplane());
	}

}
