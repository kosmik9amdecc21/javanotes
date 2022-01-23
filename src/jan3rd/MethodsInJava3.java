package jan3rd;

public class MethodsInJava3 {

	public static void main(String[] args) {

		MethodsInJava3 obj=new MethodsInJava3();
		int res=obj.natSumOfFirstN(100);
		System.out.println(res);
		
		System.out.println(obj.natSumOfFirstN(10));
           
          
	}

	public  int natSumOfFirstN(int i) {
		return i*(i+1)/2;
		
		
	}

	

}
