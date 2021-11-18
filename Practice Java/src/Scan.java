import java.util.Scanner;

public class Scan {
	


		public static void main(String[] args) {

		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Enter an integer: ");
		    int N = scanner.nextInt();
		    //System.out.println("You entered " + N);
		    if(N%2==1)
		    {
		        System.out.println("Weird");
		    }
		    else if(N%2==0 && N<5)
		    {
		        System.out.println("Not weird");
		    }
		    else if(N%2==0 && N<20)
		    {
		        System.out.println("Weird");
		    }
		    else if(N%2==0 && N>20)
		    {
		        System.out.println("Not Weird");
		    }
		    scanner.close();
		    }
		}



