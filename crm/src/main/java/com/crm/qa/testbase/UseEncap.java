package com.crm.qa.testbase;

public class UseEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapClass encap = new EncapClass();
		encap.setEmpId(1001);
		encap.setName("user");
		System.out.println(encap.getEmpID());
		System.out.println(encap.getName());

	}

}
