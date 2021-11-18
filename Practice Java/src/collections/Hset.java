package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Arun");
		hs.add("Arun");
		hs.add("Bharu");
		hs.add("Lakshmi");
		hs.add("Govindarajan");
		hs.add("Anuja");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		List<String> ls=new ArrayList<String>(hs) ;//get method is not available for set. so we covert set to list.
		System.out.println(ls);
		System.out.println(ls.get(0));
 		
/*for (String names : hs) {
	System.out.println(names);
	
}*/
	}

}
