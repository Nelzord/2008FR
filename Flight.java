
public class Flight 
{
	private Time departTime;
	private Time arriveTime;
	
	public Flight(Time time1, Time time2) 
	{
		departTime = time1;
		arriveTime = time2;
	}

	public Time getDepartureTime()
	{
		
		
		return departTime;
	}
	
	public Time getArrivalTime()
	{
		
		
		return arriveTime;
		
		
	}
	
}
