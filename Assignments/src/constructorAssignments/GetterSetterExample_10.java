package constructorAssignments;

import java.util.Scanner;

public class GetterSetterExample_10 {
	// Create one class Employee (emp_id, name, sal) with private access specifier
	// and create getter and setter.

	private int id;
	private String name;
	private double salary;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		GetterSetterExample_10 g = new GetterSetterExample_10();
		g.setId(101);
		g.setName("Prtiksha");
		g.setSalary(45202);
		
		System.out.println(g.getId()+" "+g.getName()+" "+g.getSalary());

	}

}
