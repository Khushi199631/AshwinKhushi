package Linked_List;

import java.util.Collections;
import java.util.LinkedList;

public class List2 {

	public static void main(String[] args) {

		//Create link list
		LinkedList<String> fruits =new LinkedList<String>();
		
		//Add element
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Orange");
		System.out.println(fruits);//[Apple, Banana, Grapes, Orange]
		
		//access element
		System.out.println(fruits.getFirst()); //Apple
		System.out.println(fruits.getLast());//Orange
		
		//Remove
		fruits.removeFirst();
        System.out.println(fruits);//[Banana, Grapes, Orange]
		fruits.removeLast();
		System.out.println(fruits);//[Banana, Grapes]
		System.out.println(fruits.contains("Apple")); //false
		
		//Update element
		fruits.set(0, "Mango");
		System.out.println(fruits);//[Mango, Grapes]
		
		LinkedList LL1 = new LinkedList();
		LL1.add("A");
		LL1.add("BB");
		LL1.add("R");
		LL1.add("F");
		LL1.add("E");
		
		LinkedList LL2 = new LinkedList();
		LL2.addAll(LL1);
		System.out.println(LL2);//[A, BB, R, F, E]

		
		//Remvoe all
		LL2.removeAll(LL1);

		System.out.println(LL2);//[]

		
		//ASc
		Collections.sort(LL1);
		System.out.println(LL1);//[A, BB, E, F, R]

		
		//Dsc
		Collections.sort(LL1,Collections.reverseOrder());
		System.out.println(LL1);//[R, F, E, BB, A]
		}
	}


