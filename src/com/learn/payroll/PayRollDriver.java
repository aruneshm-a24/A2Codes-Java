package com.learn.payroll;

public class PayRollDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payroll pay1 = new Payroll("Arun", 101);
		pay1.setPayRate(2.5);
		pay1.setHoursWorked(157);
		
		System.out.println("Name of employee: "+ pay1.getName() + "\n" +
							"Id number: " + pay1.getIdNumber() + "\n" +
							"PayRate is: " + pay1.getPayRate() + "\n" +
							"Hours worked is: " + pay1.getHoursWorked() + "\n" +
							"Gross Pay is: " + pay1.getGrossPay());
		

		System.out.println("username updated");
	}

}
