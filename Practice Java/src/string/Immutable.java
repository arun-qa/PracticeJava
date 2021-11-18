package string;

public class Immutable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Immutable";
		String s1="Arunaa";
		String s2=" aruna";
		String s3=new String("Immutable");
		System.out.println(s1==s2);
		System.out.println(s==s3);
		System.out.println(s.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s.length());
		s1=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.trim());
	}

}
