package methods;


public class StaticClass {
	
	static {
		System.out.println("I am inside static 1 block");
	}
	
	

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I am inside main method");

	}
	
	static {
		System.out.println("I am inside static block");
	}
	

}

