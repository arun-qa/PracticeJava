package collections;

import java.util.LinkedHashSet;

public class Lhset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Arun");
		lhs.add("Arun");
		lhs.add("Bharu");
		lhs.add("Lakshmi");
		lhs.add("Govindarajan");
		lhs.add("Anuja");
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);

	}

}
