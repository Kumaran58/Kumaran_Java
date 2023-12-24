package question1;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = -2257112528260414140L;
	
	String EmployeeId;
	String  EmployeeName;
	String EmployeePhone;
	String EmployeeAddress;
	int EmployeeSalary;
	
	public Employee(String EmployeeId,String  EmployeeName,String EmployeePhone,String EmployeeAddress,int EmployeeSalary) {
		this.EmployeeId=EmployeeId;
		this.EmployeeName=EmployeeName;
		this.EmployeePhone=EmployeePhone;
		this.EmployeeAddress=EmployeeAddress;
		this.EmployeeSalary=EmployeeSalary;
	}
	

	@Override
	public String toString() {
		return "Employee[employeeId=" + EmployeeId + ",employeeName=" + EmployeeName + ",employeePhone="
				+ EmployeePhone + ",employeeAddress=" + EmployeeAddress + ",employeeSalary=" + EmployeeSalary + "]";
	}


}
