package com.bhubanananda;

/**
 * The Class PassArgumentOfMethod.
 *
 * @author Bhubanananda
 */
public class PassArgumentOfMethod {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
//
//		new Teacher(111, "Bhuban", 5000f).display();
//		new Teacher(112, "sumit", 6000f).display();
		new Teacher().result();
	}

}

class Teacher {
	int id;
	String name;
	float salary;

	Teacher() {
		System.out.println("Employee default constructor");
	}

	Teacher(int id, String name, float salary) {
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	private void teacherDetails() {
		System.out.println("looking for user details");
	}

	void display() {
		this.teacherDetails();
		System.out.println(id + " " + name + " " + salary);
	}

	void parameterMethod(Teacher teacher) {
		System.out.println("method is invoked");
	}

	void result() {
		parameterMethod(this);
	}
}