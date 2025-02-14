package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList A1 = new ArrayList();  //dyanamic + Hetrogenious type
		A1.add(400);      //0
		A1.add("Java");   //1
		
		ArrayList<Integer>  A2 = new ArrayList<Integer>();//Static +Homo
		
		A2.add(33);
		//A2.add("Test");
		
		for(int i=1;i<A1.size();i++) {
			System.out.println(A1.get(i));
		}
		
		for(Object It :A1) {
			System.out.println(It);
		}
		
		ArrayList A3 = new ArrayList();
		
		A3.add("A");
		A3.add("B");
		A3.add("C");
		A3.add("D");
		A3.add("E");
		A3.add("F");
		
		System.out.println(A3);
		System.out.println(A3.size());
		
		System.out.println();
		
		//Add List
		
		ArrayList A4 = new ArrayList();
		A4.add(A3);
		System.out.println(A4);
		
		//Remove Al
		
		A4.remove(A3);
		System.out.println(A4);
		
		//Ascending Sort
		Collections.sort(A3);
		System.out.println(A3);
		
		//Descending Sort
		Collections.sort(A3,Collections.reverseOrder());
		System.out.println(A3);
	}

}
