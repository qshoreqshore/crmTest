package com.crm.qa.testbase;

public class MethodHidingChildClass extends MethodHidingSuperClass{
	
	public void show() {
		System.out.println("This is Child class");
		super.show();
	}
	
	public static void main(String[] args) {
		//MethodHidingSuperClass superClass = new MethodHidingSuperClass();
		MethodHidingSuperClass childClass = new MethodHidingChildClass();
		
		childClass.show();
		//superClass.show();
	}

}
