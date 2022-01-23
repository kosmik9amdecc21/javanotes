package jan22nd;

import jan20th.Student;

public class Marks extends Student{
	
	int m1,m2,m3;
	
	public void m1()
	{
		System.out.println(sNa);
	}
	
	public void setMarks(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	public void getResults()
	{
		
		System.out.println("Total is :"+(m1+m2+m3));
	}

}
