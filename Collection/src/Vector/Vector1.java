package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		Vector V1 = new Vector(); //Default size = 10
		//CC *3/2+1
		//CC*2
		V1.add('A');
		V1.add('r');
		V1.add('r');
		V1.add('r');
		V1.add('r');
		V1.add('r');
		V1.add('r');
		V1.add('r');
		V1.add('r');
		V1.add('r');
		
		int test = V1.capacity();
		System.out.println(test);//10
		
		V1.add('f');
		int test1 = V1.capacity();
		System.out.println(test1);//20
		
		V1.add(1,55);
		System.out.println(V1);//[A, 55, r, r, r, r, r, r, r, r, r, f]
			
		for(int i=0 ;i<V1.size();i++) {
		System.out.println(V1.get(i));
		}
		
		for(Object obj :V1) {
		System.out.println(obj);

		}
		
		System.out.println();
		Iterator it = V1.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}

}
