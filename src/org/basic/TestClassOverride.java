package org.basic;

public class TestClassOverride extends TestClass {


	@Override
	public void empInfo( String name) {
		System.out.println(name);


	}	
	@Override
	public void empInfo(String email , int Id) {
		System.out.println(email + " "+ Id );

	}	
	@Override
	public void empInfo(long phoneNumber) {
		System.out.println(phoneNumber);

	}
	@Override
	public void empInfo(String Address , String details ) {
		System.out.println(Address + " " + details);



	}
	public static void main(String[] args) {
		TestClassOverride e = new TestClassOverride();

		e.empInfo("prakash");
		e.empInfo("prakasj@123", 123);
		e.empInfo(123456788765l);
		e.empInfo("chennai", "tamilnadu");

	}
}