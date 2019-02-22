import java.util.ArrayList;

public class Trip 
{
	
	private ArrayList<Flight> flights;
	
	
	public Trip() 
	{
		flights = new ArrayList<Flight>();
	}
	
	// Adds f as the next leg of this flight.
	public void addNextLeg(Flight f) 
	{
		flights.add(f);
	}
	
    // program the method below
    
    
		public int getShortestLayover()
	{
		if (flights.size() < 2)
		{
			return -1;
		
		}else{
			int shortest = getDuration(); 
		for(int i = 1; i < flights.size(); i++){
			Time departure = flights.get(i).getDepartureTime();
			Time arrival = flights.get(i-1).getArrivalTime();
			int layover = arrival.minutesUntil(departure);
			if (layover < shortest){
				shortest = layover;
				
				
			}
			
		}
		return shortest;
		}
		
	}
	
     // program the method below
    
	public int getDuration()
	{
			if(flights.size() > 0){
				Time departure = flights.get(0).getDepartureTime();
				Time arrival = flights.get(flights.size()-1).getArrivalTime();
				return departure.minutesUntil(arrival);
			}else{
				return 0;
			}
	}

	

}
