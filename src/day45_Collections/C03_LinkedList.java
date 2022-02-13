package day45_Collections;

import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		
		System.out.println(ll); //[]
		
		ll.add(5);
		ll.add(7);
		
		System.out.println(ll); //[5, 7]
		
		
		
		System.out.println(ll.peek()); //silmeden ilk elemani bana getirir
		System.out.println(ll.peekFirst()); //silmeden ilk elemani bana getirir
											//liste null oldugunda 
	
		LinkedList<Integer> ll2=new LinkedList<>();
		
		System.out.println(ll2.peekFirst()); //null deque
		System.out.println(ll2.peek()); // null 
		
		System.out.println(ll.element()); //5
		// System.out.println(ll2.element()); // java.util.NoSuchElementException
		
		System.out.println(ll.poll()); //5
		System.out.println(ll); // [7]
		
		System.out.println(ll.poll()); //7
		System.out.println(ll); // []
		
		System.out.println(ll.poll()); //null
		
		System.out.println(ll.hashCode()); //1 javanin verdigi hash code'u doner
		System.out.println(ll2.hashCode()); //1
		
		ll2.add(7);
		System.out.println(ll2.hashCode()); //38
		
		
	}

}
