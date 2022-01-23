package jan21st;

public class Add extends Number{
	
	int a;
	
	public void putA(int k)
	{
		a=k;
	}
	
	public void showAll()
	{
		System.out.println(super.a);
		System.out.println(this.a);
	}

}
