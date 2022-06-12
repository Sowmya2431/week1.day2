package week1.day2;

public class EmployeeDetails {
	public static void main(String[] args)
	{
		EmployeeDetails obj = new EmployeeDetails ();
		obj.printEmployeeName("Sowmya", 24);
		obj.getEmployeeAddress("Cuddalore");
		obj.printEmployeeSalary(125000);
		obj.printEmployeeMobileNumber(9865342589L);
	}
public void printEmployeeName (String empName,int empID) {
	System.out.println(empName);
	System.out.println(empID);

}
private void getEmployeeAddress(String empAddress) {
	System.out.println(empAddress);
	
}
private double printEmployeeSalary(double empSalary) {
	System.out.println(empSalary);
	return empSalary;
	
}
private long printEmployeeMobileNumber(long mobNum) {
	System.out.println(mobNum);
	return mobNum;
}
}