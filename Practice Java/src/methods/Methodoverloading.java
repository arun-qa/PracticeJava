package methods;

public class Methodoverloading {
	
	static int method(int a,int b) 
	{
		return a+b;
	}
	static int method(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Methodoverloading obj = new Methodoverloading();
		
		System.out.println(Methodoverloading.method(11,12));
		System.out.println(Methodoverloading.method(11,12,13));
		//System.out.println(obj.method(11, 12));

	}

}
