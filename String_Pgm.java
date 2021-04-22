package com.java.concepts;

public class String_Pgm {
	
	public static void main(String[] args) {
		
		String demo="Hi daddy How are you! Miss you daddy!";
		
		
		//Length
		int length=demo.length();
		System.out.println("Length Is:" +length);
		
		
		//equals
		boolean eql=demo.equals("Miss you daddy!");
		System.out.println("Equal Status:" +eql);
		
		//Upper & lower
		String up=demo.toUpperCase();
		String dwn=demo.toLowerCase();
		System.out.println("Uppercase :" +up);
		System.out.println("Lowercase :" +dwn);
		
		//Start With
		boolean strt=demo.startsWith("Hi");
		System.out.println("Start with:" +strt);
		
		//End with
		boolean end=demo.endsWith("daddy");
		System.out.println("End With:" +end);
		
		//Contains
		boolean con=demo.contains("d");
		System.out.println("Contains:" +con);
		
		//Index Of
		int indx=demo.indexOf("H");
		System.out.println("Index Of:" +indx);
		
		//Last Index
		int lindx=demo.lastIndexOf("d");
		System.out.println("LAST Index Of:" +lindx);		
		
		//Character
		char chr=demo.charAt(36);
		System.out.println("Character:" +chr);
		
		//Replace
		String rep=demo.replace("a", "@");
		System.out.println("Replace:" +rep);
		
		//Substring try
		
		String sub=demo.substring(2);
		System.out.println("Substring Trt:" +sub);
		
		String substring2=demo.substring(4, 5);
		System.out.println("Two Substring:" +substring2);
		
		
		//Split Function
		
		String [] split=demo.split(" ");
		for (String value:split){
			System.out.println(value);
		}
		
		
		String name="            VARADHAN AK       ";
		String trm=name.trim();
		System.out.println("TRIM FUNCTION:" +trm);
		
		
		
		
	}

}
