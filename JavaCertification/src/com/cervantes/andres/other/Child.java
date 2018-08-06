package com.cervantes.andres.other;

import com.cervantes.andres.certification.Parent;

public class Child extends Parent {
	public void testIt() {
		System.out.println("x is " + x);
		
		Parent p = new Parent();
		System.out.println( "X in parent is " + p.x);
	}
}
