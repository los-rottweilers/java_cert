package com.cervantes.andres.other;

public class SwitchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int a = 1;
		final int b;
		b = 2;
		
		int x = 0;
		
		// this will not compile
		
		/*switch (x) {
			case a:
			case b:
		}*/

		String s = "green";
		switch (s) {
			case "red" : System.out.print("red ");
			case "green" : System.out.print("green ");
			case "blue" : System.out.print("blue ");
			default: System.out.println("done");
		}
		
		String o = "-";
		System.out.println("FRED".toLowerCase().substring(1,3));
		switch ("FRED".toLowerCase().substring(1,3)) {
			case "yellow" : o += "y";
			case "red" : o += "r";
			case "green" : o += "g";
		}
		System.out.println(o);
	}
}
