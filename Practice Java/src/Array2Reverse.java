
public class Array2Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {10,20,30,40,50};
		System.out.print("original array :");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.print("Reversed array :");
		for(int i=arr1.length-1; i>=0; i--)
		{
			System.out.print(arr1[i] + " ");
		}

	}

}
