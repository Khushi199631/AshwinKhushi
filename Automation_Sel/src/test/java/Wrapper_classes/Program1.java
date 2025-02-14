package Wrapper_classes;

public class Program1 {

	public static void main(String[] args) {

		//Primitive data to object
		// Object to primitve data
		// int -- > Integer
		// char -- > character
		// float --> Float
		// double -- > Double
		// boolean --> Boolean
		// byte -->Byte
		// short --Short
		// long --Long
		String S1 = "10";
		String S2 = "20";
		System.out.println(S1 + S2); // 1020


		// data convwrsion b/w string to int
		int i = Integer.parseInt(S1);
		int j = Integer.parseInt(S2);
		System.out.println(i + j);//30
		String Str1 = "1000";
		String Str2 = "2050";
		int I2 = Integer.parseInt(Str1);
		int I3 = Integer.parseInt(Str2);
		System.out.println(I2 + I3);//3050
		int add = I2 + I3;
		if (add == 3050) {
		System.out.println("Correct addition");//correct
		} else {
		System.out.println("Incorrect additon");
		}
		String S3 = "44.22";
		String S4 = "44.44";
		// int tt=Integer.parseInt(S3); //44
		double D1 = Double.parseDouble(S3);
		double D2 = Double.parseDouble(S4);
		System.out.println(D1 + D2);//88.66
	}

}
