package methods;

public class Staticclass1 {
	
	 static int a=10;
	 static void display() {
		int d=45;
		
		System.out.println("I am under display method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=25;
		
		System.out.println(a);
		display();
		//System.out.println(Staticclass2.b);
		//System.out.println(d);
	}
	static {
		System.out.println("I am under static block");
	}


}
