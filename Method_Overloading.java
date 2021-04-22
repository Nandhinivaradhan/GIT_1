package com.java.concepts;

public class Method_Overloading {
	
	private void parent_Details() {
		System.out.println("Daddy");
	}
	private void daddy_Name(String name, char initial) {
		
		System.out.println("My father name:" +name);
		System.out.println("Initial Is:" +initial);
		
		}
	private void daddy_Age(int age) {
		
		System.out.println("My father Age:" +age);
			
		}	
public static void main(String[] args) {
	Method_Overloading dad=new Method_Overloading();

	dad.parent_Details();
	dad.daddy_Name("VARADHAN", 'A');
	dad.daddy_Age(60);

	
}
}
