package com.cervantes.andres.other;

public class TestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [][] a = {{1,2},{3,4}};
		int [] b = (int[]) a[1];
		Object o1 = a;
		int[][] a2 = (int[][]) o1;
		
		String[] horses = new String[5];
		horses[4] = null;
		for( int i=0; i<horses.length; i++ ) {
			if ( i < args.length ) {
				horses[i] = args[i];
			}
			System.out.println(horses[i].toUpperCase());
		}
		
	}

}
