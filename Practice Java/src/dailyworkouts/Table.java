package dailyworkouts;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the table you want to print");
		
		Scanner obj = new Scanner(System.in);
		      int x = obj.nextInt();
		      
		      for(int i=1; i<=10; i++)
		      {
		    	  System.out.println(i+"*"+x +"="+ i*x);
		      }

	}

}
