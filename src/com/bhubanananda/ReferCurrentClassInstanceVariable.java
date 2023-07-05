package com.bhubanananda;

/**
 * The Class ReferCurrentClassInstanceVariable.
 *
 * @author Bhubanananda
 */
public class ReferCurrentClassInstanceVariable {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Student s1 = new Student(111, "Bhuban", 5000f);
		Student s2 = new Student(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}

class Student {
	int rollno;
	String name;
	float fee;

	Student(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}