package com.bhubanananda;

/**
 * The Class ReferCurrentClassConstructor.
 *
 * @author Bhubanananda
 */
public class ReferCurrentClassConstructor {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Employee s1 = new Employee(111, "Bhuban", 5000f);
		Employee s2 = new Employee(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}

}

class Employee {
	int id;
	String name;
	float salary;

	Employee() {
		System.out.println("Employee default constructor");
	}

	Employee(int id, String name, float salary) {
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	private void employeeDetails() {
		System.out.println("looking for user details");
	}

	void display() {
		this.employeeDetails();
		System.out.println(id + " " + name + " " + salary);
	}
}