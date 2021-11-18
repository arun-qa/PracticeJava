
public class Testthread extends Thread {
	
	public void run()
	{
		System.out.println("Thread started");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testthread t1 = new Testthread();
		t1.start();
		t1.start();

	}

}
