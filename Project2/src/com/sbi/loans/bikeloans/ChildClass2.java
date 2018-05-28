package com.sbi.loans.bikeloans;

public class ChildClass2 extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass2 obj=new ChildClass2();
		obj.m1();
		obj.m2();
	
				
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 overriding in AbstractClass");
	}

}
