package com.java.concepts;

import java.util.Scanner;

public class Scanner_Pgm {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("About Me:");
		String abouts=input.nextLine();
		//System.out.println(input.nextLine());	
		
		System.out.println("Enter your First name:");
		String Fname=input.next();
		
		System.out.println("Enter your Last name:");
		String Lname=input.next();	

		System.out.println("MY AGE:");
		int age=input.nextInt();
		

				
}
}
