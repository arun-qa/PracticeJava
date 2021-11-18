package string;

public class StrBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		String s2="dude";
		StringBuffer s3=new StringBuffer("boss");
		System.out.println(s3.append(s1));
		s3.insert(1, "oob");
		System.out.println(s3);
		s3.reverse();
		System.out.println(s3);

	}

}
