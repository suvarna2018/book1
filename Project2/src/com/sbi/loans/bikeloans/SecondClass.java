package com.sbi.loans.bikeloans;

public class SecondClass implements Withdrawl {
	int a=5,b=5, result=0;
	public void addtion()
	{
	result=a+b;
	System.out.println("addition of a&b are:"+result);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondClass obj=new SecondClass();
		obj.addtion();
		obj.division();
		
	}


	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("divion override method Withdrawl");
	}

}
