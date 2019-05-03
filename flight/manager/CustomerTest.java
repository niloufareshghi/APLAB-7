package flight.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CustomerTest {
	static Customer customer;

	@BeforeAll
	public static void createCustomer() {
		customer = new Customer("Taghi","Tehrani","AB123");
	}

	@Test
	void testGetName() {
		assertNotNull(customer.getName());
		assertEquals("Taghi", customer.getName());
	}

	@Test
	void testGetFamilyName() {
		assertNotNull(customer.getFamilyName());
		assertEquals("Tehrani",customer.getFamilyName());
	}

	@Test
	void testGetID() {
		assertNotNull(customer.getID());
		assertEquals("AB123", customer.getID());
	}

	@Test
	void testGetReservedTickets() {
		assertNotNull(customer.getReservedTickets());
	}

}
