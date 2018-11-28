package com.oopsconcepts;

class Employee{
	private int empId ;
	private String empName;
	private int salary;
	private Address address;
	
	Employee(){
		address = new Address();
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ "]";
	}
}

class  Address{
	private String street ;
	private String landMark;
	private String city;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", landMark=" + landMark + ", city=" + city + "]";
	}
	
	
}
public class AggregationDemo {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setEmpId(101);
		emp.setEmpName("Rajendra");
		emp.setSalary(1000);
		emp.getAddress().setCity("Hyd");
		emp.getAddress().setStreet("ABCD");
		emp.getAddress().setLandMark("frtg");
		
		System.err.println("<----Before Destruction------>");
		System.err.println(emp);
		
		System.err.println("<----After Destruction------>");
		emp = null;
		
		
		
	}

}
