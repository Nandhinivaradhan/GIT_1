package com.java.concepts;

public class Method_Overridding_Child extends Method_Overriding{
	
	public void employee_Id(int id) {
		System.out.println(10);

	}

	public void employee_Salary(int money) {
		System.out.println(3000001);

	}	
	public static void main(String[] args) {
		
		Method_Overridding_Child sdet1=new Method_Overridding_Child();
		sdet1.employee_Id(1);
		sdet1.employee_Salary(300000);
		sdet1.employee_Details("SIVA SUBRAMANI");
		
	}
	
}
