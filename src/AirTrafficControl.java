import javax.swing.JOptionPane;
public class AirTrafficControl {

	public static void main (String[] args){
		UnsortedPriorityQueue PQ = enterFlightInfo();
		getNextFlight(PQ);
		
	}
	
	public static UnsortedPriorityQueue enterFlightInfo(){
		
		UnsortedPriorityQueue PQ = new UnsortedPriorityQueue();
		
		boolean promptForMore = false;
		do{
			String flightNumber = JOptionPane.showInputDialog("Please enter the flight number");
			
			int isConnecting = JOptionPane.showConfirmDialog(null, "Connecting Flight?","", JOptionPane.YES_NO_OPTION);
			
			boolean connecting = false;
			
			if (isConnecting == JOptionPane.YES_OPTION){
				connecting = true;
			}
			
			Flight aFlight = new Flight(flightNumber, connecting);
			
			if (connecting){
				int connectionPeriod = Integer.parseInt(JOptionPane.showInputDialog("Enter connection period in minutes"));
				aFlight.setConnectionPeriod(connectionPeriod);
		
			}
			
			//add flight to pq
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
	
	public static void getNextFlight(UnsortedPriorityQueue PQ){
		JOptionPane.showMessageDialog(null, PQ.removeMin());
		
	}
	
	 
}
