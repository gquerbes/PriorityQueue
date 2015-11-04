
/**
 * @author gabrielquerbes
 * * Gabriel Querbes GNUM: G008019490   email: Gquerbes@masonlive.gmu.edu
	 *Daniel de Souz   GNUM: GXXXXXX   email: XXXXXX.gmu.edu
	 *Ishan Shams   GNUM: GXXXXXX   email: XXXXXX.gmu.edu
	 *Jack Carrubba   GNUM: GXXXXXX   email: XXXXXX.gmu.edu
	 *Jake Rose    GNUM: GXXXXXX   email: XXXXXX.gmu.edu
 */
public class Flight {

    private String flightNumber;
    private boolean connectingFlight;
    private int connectionPeriod; 
    
    public Flight(String flightNumber, boolean connectingFlight){
        this.flightNumber = flightNumber;
        this.connectingFlight = connectingFlight;
    }
    public boolean setConnectionPeriod(int p){
    	if (p < PQEntry.DEFAULT_KEY) {
    		connectionPeriod = p;
    		return true;
    	}
    	else return false;
    }
    
    public boolean getConnectingFlight(){return connectingFlight;}//added to use in calcKey method
    public long getConnectionPeriod() { return connectionPeriod; }
    
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public boolean isConnectingFlight() {
        return connectingFlight;
    }
    public void setConnectingFlight(boolean connectingFlight) {
        this.connectingFlight = connectingFlight;
    }
    public String toString (){

        return "F#"+flightNumber;
    }



}