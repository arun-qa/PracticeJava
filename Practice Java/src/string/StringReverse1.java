package string;

public class StringReverse1 {

	
		public static void main(String[] args)
		{
			String s="Reverse";
			char [] ch=s.toCharArray();
			//int length=ch.length;
			for(int i=ch.length-1; i>=0; i--)
			{
				System.out.print(ch[i]);
			}
			
					
		}
}
