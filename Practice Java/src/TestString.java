
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Arun";
		String s2="Arun";
		String s3=new String("Arun");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s3));


	}

}
