package flight.manager;
/**
 * 
 * @author Niloufar Eshghi
 *
 */
public class Seat {
	private String seatNo;
	private String seatType;
	private Customer user;
	private boolean state;
	
	/**
	 * 
	 * @param seatNo
	 * @param seatType
	 */
	public Seat(String seatNo , String seatType) {
		this.seatNo = seatNo;
		this.seatType = seatType;
		state = false;
		
	}
	/**
	 * 
	 * @return seat number
	 */
	public String getSeatNo() {
		return seatNo;
	}
	/**
	 * sets a user to a certain seat number
	 * @param user
	 */
	public void setUser(Customer user) {
		this.user = user;
		state = true;
	}
	public Customer getUser() {
		return user;
	}
	public boolean getStatus() {
		return state;
	}

}
