package inheritance;

public class ClassB extends ClassA {
	

	public static void main(String[] args) {
		
	
		ClassB obj = new ClassB();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.method(10,15,20);

	}

}
