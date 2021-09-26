package com.learn.payroll;

public class Payroll {
	private String name;
	private int idNumber;
	private double payRate;
	private double hoursWorked;
	
	
	/**
	 * 
	 */
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param name
	 * @param idNumber
	 */
	public Payroll(String name, int idNumber) {
		super();
		this.name = name;
		this.idNumber = idNumber;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}
	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}
	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	/**
	 * @return the hoursWorked
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}
	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	
	
	/*// Mutators
	public void setName (String n){
		name = n;
	}
	
	public void setIdNumber (int i){
		idNumber = i;
	}
	
	public void setPayRate (double r){
		payRate = r;
	}
	public void setHoursWorked (double h){
		hoursWorked = h;
	}
	
	// Accessor Methods
	public String getName (){
		return name;
	}
	
	public int getIdNumber (){
		return idNumber;
	}
	
	public double getPayRate(){
		return payRate;
	}
	
	public double getHoursWorked(){
		return hoursWorked;
	}
	*/
	public double getGrossPay (){
		return payRate * hoursWorked;
	}
	

}
