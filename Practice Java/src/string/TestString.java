package string;

public class TestString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s1="Arun";
		String s2="Bharu";
		String s3=new String("Ramya");
		System.out.println(s3);
		char ch=s2.charAt(1);//charAt() method
		System.out.println(ch);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s3));


	}

}
