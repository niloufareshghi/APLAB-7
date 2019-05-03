package flight.manager;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Niloufar Eshghi
 *
 */
public class Customer {
	private String name;
	private String familyName;
	private String ID;
	private ArrayList<Ticket> tickets;
	
	/**
	 *
	 *
	 * @param name
	 * @param familyName
	 * @param ID
	 */
	
	public Customer(String name , String familyName , String ID ) {
		this.name = name;
		this.familyName = familyName;
		this.ID = ID;
		tickets = new ArrayList<>();
	}
	/**
	 * 
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return familyName
	 */
	public String getFamilyName() {
		return familyName;
	}
	public String getID() {
		return ID;
	}
	/**
	 * allows customer to buy a ticket
	 * 
	 * creates new ticket and adds it to the tickets reserved by customer
	 * 
	 * @param flight
	 * @param seat
	 * @param getMaxWeight
	 * @param hasFood
	 * 
	 * 
	 */
	public void buyTicket(Flight flight , Seat seat , int getMaxWeight , boolean hasFood) {
		Ticket ticket = new Ticket(flight,seat,getMaxWeight,hasFood);
		tickets.add(ticket);
	}
	/**
	 * 
	 * @return arraylist of reserved  tickets 
	 */
	public ArrayList getReservedTickets() {
		return tickets;
	}
}
