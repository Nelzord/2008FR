
public class Time 
{
	private int hour;
	private int min;
	
	public Time(int time1, int time2)
	{
		hour = time1;
		min = time2;
	}
	
	
    // program the method below
    
	public int minutesUntil (Time other)
	{
	    int totalMinutes = other.getMinutes() + (other.getHours() * 60);
	    int secondMinutes = (this.hour*60) + this.min;
	    return totalMinutes - secondMinutes;
		
	    
	    
	
	}
	
	public int getMinutes()
	{
		return min;
		
		
	}
	public int getHours()
	{
		return hour;
	}
	
	
}
