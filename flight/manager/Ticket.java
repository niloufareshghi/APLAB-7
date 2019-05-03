package flight.manager;
/**
 * 
 * @author Niloufar Eshghi
 *
 */

public class Ticket {
	private Flight flight;
	private Seat seat;
	private int getMaxLuggageWeight;
	private boolean hasFood;
	/**
	 * 
	 * @param flight
	 * @param seat
	 * @param getMaxLuggageWeight
	 * @param hasfood
	 */
	public Ticket(Flight flight , Seat seat , int getMaxLuggageWeight , boolean hasfood) {
		this.flight = flight;
		this.seat =seat;
		this.getMaxLuggageWeight = getMaxLuggageWeight;
		this.hasFood = hasfood;
	}
	
	public String getFlightNo() {
		return flight.getID();
	}
	public String getSeatNo() {
		return seat.getSeatNo();
	}
	/**
	 * 
	 * @return the seat reserved in ticket
	 */
	public Seat getSeat() {
		return seat;
	}
}
