package jan22nd;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numbers obj=new Sum();
		
		obj.compute(200, 300);
		
		obj.greet();
		
		Sub  obj1=new Sub();
		
		obj1.compute(10, 20);
		
		obj1.greet();

	}

}
