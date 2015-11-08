
/**
 * @author gabrielquerbes
 * * Gabriel Querbes GNUM: G008019490   email: Gquerbes@masonlive.gmu.edu
	 *Daniel de Souz   GNUM: G00623081   email: daniel.desouza18@gmail.com
	 *Ishan Shams   GNUM:  G00936815   email: ishams@masonlive.gmu.edu
	 *Jack Carrubba   GNUM: G00740902   email: jcarrubb@masonlive.gmu.edu
	 *Jake Rose    GNUM: G00709889   email: jrose12@masonlive.gmu.edu
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