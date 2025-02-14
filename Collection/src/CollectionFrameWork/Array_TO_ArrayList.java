package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_TO_ArrayList {

	public static void main(String[] args) {

		String arr[]= {"Test","Phyton","Java","Selenium"};
		System.out.println(arr);
		
		for(String Str:arr) {
			System.out.println(Str);
		}
		
		//To convert array into ArrayList
		
		ArrayList AL = new ArrayList(Arrays.asList(arr));
		System.out.println(AL);
	}

}
