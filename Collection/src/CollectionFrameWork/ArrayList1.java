package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		//Array
				int arr[] = new int [10] ; //Static + similar data type
				arr[0] = 50;
				arr[9] = 80;
				System.out.println(arr);  //[I@27f674d
				//System.out.println(arr.length);
				//Array List
				ArrayList AL = new ArrayList(); //DS - 10 //Dynamic array +non similar type data

				ArrayList<Integer> AL1 = new ArrayList<Integer>(); //Static type +simailar type data

				//1.Add -- > to add or insert the element in arrayList
				AL.add(20); //0
				AL.add(50); //1
				AL.add("Java"); //2
				AL.add(true);
				AL.add(49.4f);
				AL.add('R');
				AL.add(null);
				AL.add("Python");
				AL.add(20);
				AL.add(44.5);
				AL.add(50); //10
				
				System.out.println(AL);  //[20, 50, Java, true, 49.4, R, null, Python, 20, 44.5, 50]
				
				//2.Size - return the number of element in this list
				System.out.println(AL.size());  //11
				
				//3.Remove
				System.out.println(AL.remove(2)); //Java
				
				AL.add("Automation");//[20, 50, true, 49.4, R, null, Python, 20, 44.5, 50, Automation]
				System.out.println(AL);
				System.out.println(AL.get(9)); //50

				//4.Contains - Returns true if the list conatins the specifiedelement

				System.out.println(AL.contains(20)); //True
				System.out.println(AL.contains(2000)); //false
				System.out.println(AL.contains("Python")); //true
				
				//5. Get EMthod Retrieve the element - charAt()
				System.out.println(AL.get(7));  //Python
				System.out.println(AL.get(2));  //Java
				
				//6.Set - Replace or change the valaue
				AL.set(2, "Ruby");//[20, 50, Ruby, true, 49.4, R, null, Python, 20, 44.5, 50]
				System.out.println(AL);
				AL.set(3, 2000);
				System.out.println(AL);//[20, 50, Ruby, 2000, 49.4, R, null, Python, 20, 44.5, 50]
				
				//7.IsEmpty
				System.out.println(AL.isEmpty());  //False
				System.out.println(AL1.isEmpty()); //True
				
				//Read/print the data from given arraylist
				//By using simple for loop
				for(int i=0 ;i < AL.size() ;i++) {
				System.out.println(AL.get(i));
				}
				System.out.println();
				
				//2.For Each/Advance For Loop
				for(Object obj :AL) {
				System.out.println(obj);
				
				//Iterator
				System.out.println();
				Iterator IT = AL.iterator();
				while(IT.hasNext()) {
					System.out.println(IT.next());
				}
				
			}

	}

}
