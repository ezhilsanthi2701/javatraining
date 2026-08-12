package objectoriented;

public class EmployeeSalary {
	private int employeeId;
	private  String employeeName;
	private  double hra;
	private double basicPay;
	private double da;
	private double totalDeduction;
	private double grossSalary;
	private double netSalary;
	public double getNetSalary() {
		return netSalary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getTotalDeduction() {
		return totalDeduction;
	}
	public void setTotalDeduction(double totalDeduction) {
		this.totalDeduction = totalDeduction;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	void grossCalculation()
	{
		grossSalary=hra+da+basicPay;
		System.out.println("the gross salary of " +employeeId  +" "+grossSalary);
	}
	void totalcaculation()
	{
		netSalary=grossSalary-totalDeduction;
		System.out.println("the net salary of " +employeeId  +" "+netSalary);
	}
	
	
}
