package com.java.concepts;

public class Method_Overriding {

	public void employee_Details(String name) {
		System.out.println("SOFTWARE TESTING EMPLOYEES: " +name);
	}
	
	public static void main(String[] args) {
		Method_Overriding sdet=new Method_Overriding();
		sdet.employee_Details("NANDHINI VARADHAN");
		sdet.employee_Details("SARIKA");
		sdet.employee_Details("VASANTH");
	}

}
