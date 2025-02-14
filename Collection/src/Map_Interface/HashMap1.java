package Map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMap1 {

	public static void main(String[] args) {

		// ArrayList <String, >AL = new ArrayList<E>();
		//
		HashMap<Integer, String> HM1 = new HashMap<Integer, String>();
		HashMap<Integer, String> HM2 = new HashMap<Integer, String>();
		//Addign key - value paris
		//Put method
		HM1.put(1034, "Rohit"); //Pair
		HM1.put(1003, "Rahul");
		HM1.put(1035, "Test"); //Duplciate key
		HM1.put(null, "Vishal");
		HM1.put(999, "Automation");
		System.out.println(HM1);  //{null=Vishal, 999=Automation, 1034=Rohit, 1003=Rahul, 1035=Test}
		//Get
		System.out.println(HM1.get(999)); //Automation
		System.out.println(HM1.get(1034)); //Rohit

		System.out.println(HM1.containsKey(1003)); //True
		System.out.println(HM1.containsKey(1005));//False
		System.out.println(HM1.containsValue("Rohit"));//TRue
		System.out.println(HM1.containsValue("Rohit1"));//F
		System.out.println(HM1.isEmpty());//f
		System.out.println(HM2.isEmpty());//T
		System.out.println(HM1.keySet());//[null, 999, 1034, 1003, 1035]
		System.out.println(HM1.values());//[Vishal, Automation, Rohit, Rahul, Test]
		for(Object obj :HM1.values()) {
		System.out.println(obj);
		}
		//Key value
		// 1003 Rahul
		// 999 Automation
		for(Object Obj1 :HM1.keySet()) {
		System.out.println(Obj1 + " "+ HM1.get(Obj1));
		}
		System.out.println();
		//Entry method
		for(Map.Entry entry : HM1.entrySet()) {
		System.out.println(entry.getKey() +" "+entry.getValue());
		}
		System.out.println();
		Set SS = HM1.entrySet();
		Iterator it = SS.iterator();

		while(it.hasNext()) {
        Map.Entry entry =(Entry) it.next();   
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
	}

}
