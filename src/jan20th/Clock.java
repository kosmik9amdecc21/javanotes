package jan20th;

public class Clock {
	
	int hr,min,sec;
	
	//default constructor

	public Clock()
	{
		hr=10;
		min=10;
		sec=10;
	}

	//parametized constructor
	
	public Clock(int hr)
	{
		this.hr=hr;
	}
	
	
	public Clock(int hr,int min)
	{
		this.hr=hr;
		this.min=min;
	}
	
	
	public Clock(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	public void getClock()
	{
		System.out.format("%02d:%02d:%02d",hr,min,sec);
		System.out.println();
	}
	
	
	
	
	
	
	
	
}
