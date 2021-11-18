package collections;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(5);
		ll.add(8);
		ll.add(10);
		ll.add(5);
		//ll.add(4, 4);
		//ll.add(null);
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		
		System.out.println(ll.get(2));
		//System.out.println(ll.get(2));
		//System.out.println(ll.set(1, 1));
		//System.out.println(ll);
		//Collections.sort(ll);
		//System.out.println(ll);
		

	}

}
