package jan7th;

public class Bank {
	
	
	private double balance=10000;
	
	void setBalance(double deposit)
	{
		balance=balance+deposit;
	}
	
	void getBalance(int pin)
	{
		if(pin == 8945)
		{
		System.out.println("Balance is "+balance);
		}
		else
		{
			System.out.println("Invalid Pin ..");
		}
	}

}
