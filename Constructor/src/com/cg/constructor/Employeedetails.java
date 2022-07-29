package com.cg.constructor;

public class Employeedetails {
	int id;

	String name;

	float salary;

	public Employeedetails(int id, String name, float salary) {
     super();
	this.id = id;
    this.name = name;
    this.salary = salary;
}

	void display() {

	System.out.println(id + " " + name + " " + salary);

	}
}
