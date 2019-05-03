package flight.manager;

/**
 * 
 * @author Niloufar Eshghi
 *
 */
public class Flight {
	private String company;
	private String ID;
	private String dest;
	private String origin;
	private String time;
	private Airplane airplane;
	
	/**
	 * constructor
	 * 
	 * @param company
	 * @param ID
	 * @param Dest
	 * @param Origin
	 * @param Time
	 * @param airplane
	 */
	public Flight(String company , String ID , String Dest , String Origin , String Time , Airplane airplane) {
		this.ID = ID;
		this.airplane = airplane;
		this.company = company;
		this.dest = Dest ;
		this.origin = Origin;
		this.time = Time;
		
	}
	/**
	 * 
	 * @return flight ID
	 */
	public String getID() {
		return ID;
	}
	/**
	 * 
	 * @return company name
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * 
	 * @return flight destination
	 */
	public String getDest() {
		return dest;
	}
	public String getOrigin() {
		return origin;
	}
	public String getTime() {
		return time;
	}
	public Airplane getAirplane() {
		return airplane;
	}
	
	
		
	
}
