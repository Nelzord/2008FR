
public class APFR20081AirlineTrip
{

	public static void main(String[] args) 
	{
		Trip t = new Trip();
		Flight f1 = new Flight(new Time(11,30), new Time(12,15));
		t.addNextLeg(f1);
		f1 = new Flight(new Time(12,35), new Time(15,45));
		t.addNextLeg(f1);
		f1 = new Flight(new Time(16,30), new Time(18,45));
		t.addNextLeg(f1);
		f1 = new Flight(new Time(22,15), new Time(23,00));
		t.addNextLeg(f1);
	
		// call getDuration from Trip class
        
        // print the duration amount in hours and minutes
        
        // call getShortestLayover from Trip class
        
        // print the shortest layover amount in hours and minutes
        
		
		int time = t.getDuration();
		
		System.out.println("Total minutes is " + time );
		System.out.println("Hours and minutes is " + (time/60) + " hours and " + (time%60) + " minutes");
		
		int l = t.getShortestLayover();
		System.out.println("Total minutes during layover is " + l);
		
		System.out.println("Hours and minutes for shortest layover is " + (l/60) + " hours and " + (l%60) + " minutes" );
		}
	}



