
package com.capgemini.functionoverriding;

/**
 * @author Pooja Karnik Program to demonstrate function overriding
 *
 */
//demonstrating function overriding
class Test {

	// creating parent and child class instances to override the method disp
	public static void main(String[] args) {

		Parent parent = new Parent();
		Child child = new Child();

		parent.disp();
		child.disp();
	}
}
