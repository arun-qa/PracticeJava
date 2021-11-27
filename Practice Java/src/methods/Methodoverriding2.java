package methods;

public class Methodoverriding2 extends Methodoverriding1{
	
	//static, final and private methods cannot be overriden to the subclass
	
	void method() 
	{
		System.out.println("I am inside child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverriding2 obj = new Methodoverriding2();
		Methodoverriding1 obj1 = new Methodoverriding1();
		
		obj.method();
		obj1.method();

	}

}
