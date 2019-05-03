package flight.manager;

import java.util.ArrayList;
/**
 * 
 * @author Niloufar Eshghi
 *
 */
public class TravelManagement {
	private ArrayList<Flight> flights;
	private ArrayList<Customer> customers;
	
	public TravelManagement() {
		
	}
	/**
	 * adds a flight to the list of flights created
	 * @param flight
	 */
	public void addFlights(Flight flight) {
		flights.add(flight);
		
	}
	/**
	 * removes a flight from the flights that the management has
	 * @param flight
	 */
	public void removeFlight(Flight flight) {
		flights.remove(flight);
	}
	
	public ArrayList getFlights() {
		return flights;
	}
	public ArrayList getCustomers() {
		return customers;
	}

}
