package org.key;

public class ManagerClass {

	

	private ModelClass1 a;
	
	private ModelClass2 b;
	
	private ModelClass3 c;

	public ModelClass1 getA() {
		return (a==null)? a = new ModelClass1():a;
		
	}

	public ModelClass2 getB() {
		return (b==null)? b = new ModelClass2(): b;
	}

	public ModelClass3 getC() {
		return (c==null)? c = new ModelClass3(): c;
	}
	
	
	
	
	
}
