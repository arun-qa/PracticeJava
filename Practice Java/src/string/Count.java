package string;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		
		String s="Hello Java HOW are you";
		for(int i=0; i<s.length()-1; i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
		}
		

	}
		System.out.println(count);

	}
}
