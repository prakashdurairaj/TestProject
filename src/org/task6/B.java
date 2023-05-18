package org.task6;

public class B extends A {
	 @Override
		public void clientInfo(String Name) {
	System.out.println( "clientInfo:"+Name);
	}
	 
	 public void officeId(int Id) {
		 System.out.println("officeId:"+Id);
		 
	}
	 public void officeNumber(long Number) {
System.out.println("officeNumber:"+Number);

	}
	 public static void main(String[] args) {
		
		 B obj2 = new B();
		 obj2.clientInfo("122");
		 obj2.clientInfo("prakash");
		 obj2.officeId(234);
		 obj2.officeNumber(712471246l);
		 obj2.compdetails("zoho", 6565);
		 
		 
	}
	 
	 
	 
	 
	 
	 
}
