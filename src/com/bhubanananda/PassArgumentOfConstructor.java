package com.bhubanananda;

/**
 * The Class PassArgumentOfConstructor.
 *
 * @author Bhubanananda
 */
public class PassArgumentOfConstructor {
	int data = 10;

	public PassArgumentOfConstructor() {

		Staff staff = new Staff(this);
		staff.display();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new PassArgumentOfConstructor();
	}

}

class Staff {
	PassArgumentOfConstructor passArgumentOfConstructor;

	Staff(PassArgumentOfConstructor passArgumentOfConstructor) {
		this.passArgumentOfConstructor = passArgumentOfConstructor;
	}

	void display() {
		System.out.println(passArgumentOfConstructor.data);
	}
}