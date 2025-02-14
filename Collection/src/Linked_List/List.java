package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {

		LinkedList LL1 = new LinkedList();
		LinkedList LL2 = new LinkedList();
		
		LL1.add('A');
		LL1.add(10);
		LL1.add("Java");
		LL1.add(true);
		LL1.add(null);
		LL1.add("Automation");
		LL1.add(44.5);
		
		System.out.println(LL1);//[A, 10, Java, true, null, Automation, 44.5]
		
		//Size
		int len = LL1.size();
		System.out.println(len); //7
		//OR
		System.out.println(LL1.size()); //7
		
		//Remove
		System.out.println(LL1.remove(1));
		System.out.println(LL1);//[A, Java, true, null, Automation, 44.5]
		
		//Get
		System.out.println(LL1.get(3));//null
		
		//Add
		LL1.add(3,"Test");
		System.out.println(LL1);//[A, Java, true, Test, null, Automation, 44.5]
		
		//addFirst
		LL1.addFirst("Selenium");
		System.out.println(LL1);//[Selenium, A, Java, true, Test, null, Automation, 44.5]
		
		//addLast
		LL1.addLast("Java");
		System.out.println(LL1);//[Selenium, A, Java, true, Test, null, Automation, 44.5, Java]

		//IsEmpty
		System.out.println(LL2.isEmpty()); //True
		LL2.add(0,"Test");
		System.out.println(LL2);
		System.out.println(LL2.isEmpty());//False
		
		//Simple forlopp
		for(int i= 0;i<LL1.size();i++) {
			System.out.println(LL1.get(i));
		}
//		//2.For Each/Advance For Loop
//		for(Object obj :LL1) {
//		System.out.println(obj);
//		
//		//Iterator
//		System.out.println();
//		Iterator str = LL1.iterator();
//		while(str.hasNext()) {
//			System.out.println(str.next());
//		}
		

	}

}
