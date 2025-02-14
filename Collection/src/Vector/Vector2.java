package Vector;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {

		Vector<String> colors = new Vector<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		
		colors.addElement("Java");
		System.out.println(colors); //[Red, Blue, Green, Java]
		
		System.out.println(colors.get(0)); //Red
		colors.set(1, "yellow");
		System.out.println(colors);//[Red, yellow, Green, Java]

		}
	

}
