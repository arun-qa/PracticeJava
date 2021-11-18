
public class Array4Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,10,25,20};
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) 
				{
			 if(arr[i] > max)  
	               max = arr[i];  
				}
		System.out.println("Largest element present in given array: " + max);  
			}
			
		
		

	}


