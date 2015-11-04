import javax.swing.JOptionPane;
public class FlightImplementation {

	/**
	 * @param args
	 * 
	 * This application will prompt a user to enter the flight number and if the flight has a connection,
	 * if it does have a connection it will prompt the user to enter the connection period in minutes.
	 * 
	 * Once a user is done entering all the flight info, the system will print out the flights 
	 * as they are queued up
	 * Gabriel Querbes
	 *Daniel de Souz
	 *Ishan Shams
	 *Jack Carrubba
	 *Jake Rose
	 */
	public static void main (String[] args){
		UnsortedPriorityQueue PQ = enterFlightInfo();
		getNextFlight(PQ);
		
	}
	
	/**
	 * @return queue of flights
	 * 
	 * prompts user to enter flight information until they alert the system that they are done entering flights
	 */
	public static UnsortedPriorityQueue enterFlightInfo(){
		//create new priority queue
		UnsortedPriorityQueue PQ = new UnsortedPriorityQueue();
		
		//flag to determine if user wants to continue entering flights
		boolean promptForMore = false;
		
		
		do{
			//prompt for flight number
			String flightNumber = JOptionPane.showInputDialog("Please enter the flight number");
			
			//prompt for connection status
			int isConnecting = JOptionPane.showConfirmDialog(null, "Connecting Flight?","", JOptionPane.YES_NO_OPTION);
			
			//boolean to determine connecting flight
			boolean connecting = false;
			if (isConnecting == JOptionPane.YES_OPTION){
				connecting = true;
			}
			
			//create new flight and pass flight number and connecting boolean
			Flight aFlight = new Flight(flightNumber, connecting);
			
			//prompt user to enter connection time if their flight is connecting
			if (connecting){
				int connectionPeriod = Integer.parseInt(JOptionPane.showInputDialog("Enter connection period in minutes"));
				aFlight.setConnectionPeriod(connectionPeriod);
		
			}
			
			//add flight to PQ
			PQ.add(aFlight);
			
			// prompt for more flights
			int moreFlights = JOptionPane.showConfirmDialog(null," more flights to enter?","", JOptionPane.YES_NO_OPTION);
			if (moreFlights == JOptionPane.YES_OPTION){
				promptForMore = true;
			}
			else promptForMore = false;
			
		} while (promptForMore == true);
		
		return PQ;
	}
	
	
	/**
	 * 
	 * @param Priority Queue of flights
	 */
	public static void getNextFlight(UnsortedPriorityQueue PQ){
		JOptionPane.showMessageDialog(null,"The flights are prioritized as follows");
		
		//display current flight waiting
		while(!PQ.isEmpty()){
			JOptionPane.showMessageDialog(null, PQ.removeMin());
		}
		//alert user that no more flights are in queue
		JOptionPane.showMessageDialog(null, "No more flights are waiting");
		
	}
	
	 
}
