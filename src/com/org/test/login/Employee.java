/**
 * 
 */
package com.org.test.login;

/**
 * @author Piyu
 *
 */
public class Employee {

	/**
	 * 
	 */
	int empNo;
	String empName;
	
	
	public Employee() {
		
		System.out.println("default constructor");
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param empNo
	 * @param empName
	 */
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		System.out.println("employee name is " +empName );
		System.out.println("default constructor");
		
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1 = new Employee(2, "jaweriya");
		System.gc();
		
		System.out.println(e1.empName);
	}

}

