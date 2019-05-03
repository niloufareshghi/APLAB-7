 package flight.manager;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SeatTest {
	
	static Seat seat;
	static Customer user;

	@BeforeAll
	public static void testSeat() {
		seat = new Seat("10C","Economy");
		user = new Customer ("Taghi","Taheri","CD456");
		seat.setUser(user);
	}

	@Test
	void testGetSeatNo() {
		assertNotNull(seat.getSeatNo());
	}


	@Test
	void testGetUser() {
		assertNotNull(seat.getUser());
	}

}
