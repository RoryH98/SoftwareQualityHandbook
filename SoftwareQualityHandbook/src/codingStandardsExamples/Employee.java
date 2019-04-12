package codingStandardsExamples;


/*                                                               
* This is an employee object class
* this class was made to demonstrate
* how to create a class
* also with hints variables names
* commenting indentation etc.
*
*/

//Class name must be UpperCamelCase
public class Employee {

	//variable names must be lowerCamelCase
	//all variables should be private at end with starting character of its type
	private int employeeId_G;
	private String employeeName_G;
	private int employeeSalary_G;
	private String employeeJobTitle_G;
	
	//an object should have a constructor with fields and a blank contructor
	public Employee() {
		
	}

	public Employee(int employeeId_G, String employeeName_G, int employeeSalary_G, String employeeJobTitle_G) {
		super();
		this.employeeId_G = employeeId_G;
		this.employeeName_G = employeeName_G;
		this.employeeSalary_G = employeeSalary_G;
		this.employeeJobTitle_G = employeeJobTitle_G;
	}
	
	//all variables should have a getter and a setter
	public int getEmployeeId_G() {
		return employeeId_G;
	}
	public void setEmployeeId_G(int employeeId_G) {
		this.employeeId_G = employeeId_G;
	}
	public String getEmployeeName_G() {
		return employeeName_G;
	}
	public void setEmployeeName_G(String employeeName_G) {
		this.employeeName_G = employeeName_G;
	}
	public int getEmployeeSalary_G() {
		return employeeSalary_G;
	}
	public void setEmployeeSalary_G(int employeeSalary_G) {
		this.employeeSalary_G = employeeSalary_G;
	}
	public String getEmployeeJobTitle_G() {
		return employeeJobTitle_G;
	}
	public void setEmployeeJobTitle_G(String employeeJobTitle_G) {
		this.employeeJobTitle_G = employeeJobTitle_G;
	}
	
	

	
}
