
/**
 * @author gabrielquerbes
 *
 * * Gabriel Querbes GNUM: G008019490   email: Gquerbes@masonlive.gmu.edu
	 *Daniel de Souz   GNUM: G00623081   email: daniel.desouza18@gmail.com
	 *Ishan Shams   GNUM:  G00936815   email: ishams@masonlive.gmu.edu
	 *Jack Carrubba   GNUM: G00740902   email: jcarrubb@masonlive.gmu.edu
	 *Jake Rose    GNUM: G00709889   email: jrose12@masonlive.gmu.edu
 */
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