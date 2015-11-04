
public class PQEntry {
	private long key; 
	private Flight val; 
	public static final int DEFAULT_KEY = 1000000; //Indicates a very low priority --used for non-connective flights.
	
	public PQEntry() {}
	
	public void setValue(Flight p){ 
		val = p;
		calcKey();
	}
	
	
	/**
	 * Calculates and sets key based on the connection period based in minutes,
	 * If the flight does not connect it will be given the default key.
	 * Reasoning: connection period is the only metric used to determine the priority
	 * because connection period is only used if a flight is connecting.
	 */
	private void calcKey(){
		if(val.getConnectingFlight()){
			key = val.getConnectionPeriod();
		}
		else if (!val.getConnectingFlight()){
			key = DEFAULT_KEY;
		}
	}
	
	public Flight getValue() {return val; }
	
	public long getKey(){
		return key; 
	}
	
	public String toString() {
		return "Value: "+ val.toString() + ", key: "+ key;
	}
}