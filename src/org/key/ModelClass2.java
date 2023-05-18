package org.key;

public class ModelClass2  implements Inter03 {

	public void emploname1(String name) {
System.out.println(name);
	}

	public void emploId1(int Id) {
		System.out.println(Id);
	}

	public void emplonumber1(long Number) {
	System.out.println(Number);

	}

	@Override
	public void saving1() {
System.out.println("saving1:"+1234);

	}

	@Override
	public void Fd1() {
		System.out.println("Fd1:"+4000000);
	}
		
		@Override
	public void Intrest1() {
System.out.println("Intrest1:"+"4%");		
	}

	@Override
	public void saving2() {
		System.out.println("saving2:"+3234);

	}

	@Override
	public void Fd2() {
		System.out.println("Fd2:"+330000);
		
	}

	@Override
	public void intrest2() {
		System.out.println("Intrest2:"+"6.5%");		
		
	}

	@Override
	public void saving3() {
		System.out.println("saving3:"+6034);
		
	}

	@Override
	public void Fd3() {
		System.out.println("Fd3:"+670000);
		
	}

	@Override
	public void Intrest3() {
		System.out.println("Intrest3:"+"5.5%");		
		
	}



}
