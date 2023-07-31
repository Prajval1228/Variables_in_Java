package com.create;

public class MyFirstClass {
	
	//Global Variable Declaration And Initialization
	
	int number;     //Declaration
	int sNumber=7; //Declaration And Initialization
	
	void print_Variable(){	
	//Variable Declaration And Initialization	
	System.out.println("Inside Variable Method");	
	int local_First = 12;
	System.out.println(local_First);
	}
	
	void print_Local(){
	//Local Declaration And Initialization		
	
	System.out.println("Inside Local Method");	
	int local_Second=77;
	System.out.println(local_Second);
	
	System.out.println(sNumber);          //Declaration Of Global Variable In Local 
	
	}
	
	public static void main(String args[]) {
		
		MyFirstClass myClass= new MyFirstClass();
		myClass.print_Variable();
		myClass.print_Local();	
		
	}

}
