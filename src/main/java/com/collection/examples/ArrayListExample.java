package com.collection.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

	List<String> list = new ArrayList<String>();
	list.add("Rajendra");
	list.add("Manohar");
	list.add("Ramesh");
	list.add("Suresh");
	list.add(1,"Koushal");
	list.set(0, "Chiru") ;
//	list.add(null);
	
	System.out.println("<-----Iterating through Iterator ---->");
	Iterator<String> it = list.iterator();
	while(it.hasNext()){
	  String str = it.next();
	  System.out.println(str);
	  if(str.equals("Suresh")){
		  it.remove();
	  }
	  
	}
	
	System.out.println("<-----Iterating through for loop ---->");
	for(String str : list){
		System.out.println(str);
	}
	

	
	System.out.println("<----Better way of creating list----->");
	List<String> alist = new ArrayList<>(Arrays.asList("Three","Four","One"));
	alist.set(0, "Seven");
	alist.add("Super");
	
	for(String str : alist){
		System.out.println(str);
	}
	
	System.out.println("<----Java8 way of iterating list----->");
	alist.forEach(abc -> System.out.println(abc));
	
	System.out.println("<----Sorting elements of list----->");
	Collections.sort(alist);
	alist.forEach(name -> System.out.println(name));
	
	System.out.println("<----Sorting elements of list in descending order----->");
	Collections.sort(alist, Collections.reverseOrder());
	alist.forEach(name -> System.out.println(name));
	
	Student s1 = new Student(105, "Rajendra", 25000);
	Student s2 = new Student(102, "Ajay", 15000);
	Student s3 = new Student(103, "Sudha", 45000);
	
	List<Student> studentList = Arrays.asList(s1,s2,s3);
	
	System.out.println("<----Sorting students of list----->");
	Collections.sort(studentList);
	studentList.forEach(name -> System.out.println(name));
	
	System.out.println("<----Sorting students of list using Comparator bases on Id----->");	
	Comparator<Student> idcomparator = new Comparator<Student>(){

		@Override
		public int compare(Student arg0, Student arg1) {
			return arg0.getId() - arg1.getId();
		}
		
	};
	Collections.sort(studentList,idcomparator );
	studentList.forEach(name -> System.out.println(name));
	
	System.out.println("<----Java8 style of Sorting students of list using Comparator----->");	
	studentList.sort((Student student1, Student student2)->student1.getStipend()-student2.getStipend()); 
	studentList.forEach(name -> System.out.println(name));
	
}
	}
	
	
class Student implements Comparable<Student> {
	
	private int id ;
	private String name ;
	private int Stipend ;
	
	public Student(int id, String name, int stipend) {
		super();
		this.id = id;
		this.name = name;
		Stipend = stipend;
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
	public int getStipend() {
		return Stipend;
	}
	public void setStipend(int stipend) {
		Stipend = stipend;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Stipend=" + Stipend + "]";
	}

	@Override
	public int compareTo(Student obj) {
		return this.name.compareTo(obj.name);
	}
	
	}


