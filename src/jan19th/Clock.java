package jan19th;

public class Clock {
	
	private int hr,min,sec;
	
	public Clock()
	{
		System.out.println("You have entered into  Constructor");
	}
	
	public void setClock(int hr) {
		
		this.hr=hr;
	}

	public void setClock(int hr,int min) {
		
		this.hr=hr;
		this.min=min;
	}
	public void setClock(int hr,int min,int sec) {
		
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	public void getClock()
	{
		System.out.format("%02d:%02d:%02d",hr,min,sec);
	}
}
