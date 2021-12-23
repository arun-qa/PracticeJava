package methods;

public class Methodoverloading {
	
	void method() {
		
		System.out.println("I am inside void method");
	}
	
	static int method(int a,int b) 
	{
		return a+b;
	}
	static double method(double a,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading obj = new Methodoverloading();
		
		System.out.println(Methodoverloading.method(11,12));
		System.out.println(Methodoverloading.method(11.3,12.4));
		obj.method();
		//System.out.println(obj.method(11, 12));

	}

}
