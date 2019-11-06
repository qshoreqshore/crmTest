package com.crm.qa.testbase;

public class ImplementInterface implements ExOfInterface, ExOfInterface2{

	public int show() {
		System.out.println("Interface method");
		return 0;
		
	}
	
	public static void main(String[] args) {
		 final int  a = 20;
		
		  
		  ImplementInterface b = new ImplementInterface();
		  System.out.println(b.a);
		  
		  b.show();
		  
		  
	}

	public void show2() {
		// TODO Auto-generated method stub
		
	}

	public void show3() {
		// TODO Auto-generated method stub
		
	}

}
