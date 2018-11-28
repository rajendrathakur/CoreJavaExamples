package com.collection.examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		HashSet<String> hashset = new HashSet<String>();
		hashset.add("One");
		hashset.add("Four");
		hashset.add("Seven");
		hashset.add("Ten");
		System.out.println("<----iterating hashset elements----->");
		hashset.forEach(name -> System.out.println(name));
		
		HashSet<String> linkedhashset = new LinkedHashSet<String>(hashset);
		System.out.println("<----iterating Linkedhashset elements----->");
		linkedhashset.forEach(name -> System.out.println(name));

		TreeSet<String> treeset = new TreeSet<String>(linkedhashset);
		System.out.println("<----iterating treeset elements----->");
		treeset.forEach(name -> System.out.println(name));
		
		System.out.println("<----iterating treeset headset elements----->");
		treeset.headSet("Seven").forEach(name -> System.out.println(name));
		
		System.out.println("<----iterating treeset subset elements----->");
		treeset.subSet("Four","Seven").forEach(name -> System.out.println(name));
		
		System.out.println("<----iterating treeset tailset elements----->");
		treeset.tailSet("Seven").forEach(name -> System.out.println(name));
		
		Set<String> treesetcomp = new TreeSet<String>((String o1, String o2) -> (o2.compareTo(o1)));
		treesetcomp.addAll(linkedhashset);
		System.out.println("<----Java8 iterating treeset elements----->");
		treesetcomp.forEach(name -> System.out.println(name));
		
		Set<Employee> employeeTreeComp = new TreeSet<Employee>((Employee e1, Employee e2) -> e2.getId() - e1.getId());
		employeeTreeComp.add(new Employee(101, "John", 12000));
		employeeTreeComp.add(new Employee(102, "Venkat", 42000));
		employeeTreeComp.add(new Employee(103, "Akbar", 2000));
		
		System.out.println("<----Java8 iterating treeset Employee  elements----->");
		employeeTreeComp.forEach(name -> System.out.println(name));
		
	}
	
}

class Employee{
	private int id ;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
