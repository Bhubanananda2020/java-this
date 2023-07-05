package com.bhubanananda;

/**
 * The Class ReferCurrentClassMethod.
 *
 * @author Bhubanananda
 */
public class ReferCurrentClassMethod {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		User s1 = new User(111, "Bhuban", 5000f);
		User s2 = new User(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}

}

class User {
	int id;
	String name;
	float fee;

	User(int id, String name, float fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	void studentDetails() {
		System.out.println("looking for user details");
	}

	void display() {
		this.studentDetails();
		System.out.println(id + " " + name + " " + fee);
	}
}