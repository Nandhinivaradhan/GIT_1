package com.java.concepts;

import com.java.concepts.Interface_Pgm.employee_Data;

public class Interface_Implement implements employee_Data{
	
public static void main(String[] args) {
	
Interface_Implement data=new Interface_Implement();
	
	data.employee_Name();
	data.employee_Id();
	data.employee_Lp();
}
	@Override
	public void employee_Name() {
		System.out.println("NANDHINI VARADHA");
		
	}
	
	@Override
	public void employee_Id() {
		System.out.println(123);
		
	}
	
	public void employee_Lp() {
		System.out.println(1230000000);
		
	}
}


