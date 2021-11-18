package collections;

import java.util.LinkedHashMap;

public class Lhmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, String> lhm=new LinkedHashMap<>();
		lhm.put("arun","rams");
		lhm.put("rithu","ramya");
		lhm.put("run","rams");
		lhm.put("arun","rams");
		lhm.put(null, "test");
		lhm.put(null, "test");
		
		
		System.out.println(lhm);


	}

}
