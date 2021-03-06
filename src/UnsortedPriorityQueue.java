import java.util.*;

/**
 * @author gabrielquerbes
  * Gabriel Querbes GNUM: G008019490   email: Gquerbes@masonlive.gmu.edu
	 *Daniel de Souz   GNUM: G00623081   email: daniel.desouza18@gmail.com
	 *Ishan Shams   GNUM:  G00936815   email: ishams@masonlive.gmu.edu
	 *Jack Carrubba   GNUM: G00740902   email: jcarrubb@masonlive.gmu.edu
	 *Jake Rose    GNUM: G00709889   email: jrose12@masonlive.gmu.edu
 */
public class UnsortedPriorityQueue  {
	private LinkedList<PQEntry> queue;
	
	public UnsortedPriorityQueue(){
		queue = new LinkedList<PQEntry>(); 
	}
	
	public void add(Flight p){
		PQEntry entry = new PQEntry(); 
		entry.setValue(p); 
		queue.add(entry);
	}
	
	public PQEntry removeMin(){
		if(queue.isEmpty()){
			System.out.println("The queue is empty.");
			return null; 
		}
		else{
			int min = 0; 
			for(int i= 1; i<queue.size(); i++){
				if(queue.get(min).getKey() > queue.get(i).getKey()) 
					min =i;
				else if(queue.get(min).getKey() == queue.get(i).getKey()){
					if(min>i) min = i;
				}
				
			}
			
			PQEntry minEntry = queue.get(min);
			queue.remove(min);
			return minEntry;
		}
		
	}

	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	public int size(){
		return queue.size();
	}
	
	
}