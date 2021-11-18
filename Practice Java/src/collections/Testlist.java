package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Testlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> al=new ArrayList<String>();
   
   al.add("arun");
   al.add("rithvin");
   al.add("ramya");
   al.add("rithvin");
   al.add(null);
   //al.add(0, "IndexZero");
   //al.add(1, "IndexOne");
   //System.out.println();
   System.out.println(al);
   System.out.println(al.get(2));
   Collections.sort(al);
   System.out.println(al);
	}

}
