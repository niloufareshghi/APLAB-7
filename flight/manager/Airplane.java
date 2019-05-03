package flight.manager;

import java.util.ArrayList;

/**
 * 
 * @author Niloufar Eshghi
 *
 */

public class Airplane {
	private String airCraftType;
	private int totalSeats;
	private Seat[] seats;
	int count =0;
	
	/**
	 * 
	 * @param airCraftType
	 * @param totalSeats
	 */
	public Airplane(String airCraftType , int totalSeats) {
		this.airCraftType = airCraftType;
		this.totalSeats = totalSeats;
		seats = new Seat[totalSeats];
	}
	/**
	 * 
	 * @return type of aircraft
	 */
	public String getAirCraftType() {
		return airCraftType;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	/**
	 * calculates number of seats that aren't reserved
	 * @return available seats
	 */
	public int getEmptySeats() {
		for(Seat s : seats)
			if(s.getStatus() == true)
				count++;
		return getTotalSeats() - count;
				
	}
	
}
