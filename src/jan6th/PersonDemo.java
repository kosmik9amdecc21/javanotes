package jan6th;

public class PersonDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Person p1=new Person();
		
		System.out.println(p1.name);
		
		System.out.println(p1.age);
		
		System.out.println(p1.ph);
		
		p1.name="John";
		
		p1.age=30;
		
		p1.ph=9848022338L;
		
		System.out.println(p1.name);
		
		System.out.println(p1.age);
		
		System.out.println(p1.ph);
		

		new Person().greet();
		
		Person.bye();
		
	}

}
