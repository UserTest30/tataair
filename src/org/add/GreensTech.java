package org.add;

public class GreensTech {

	public void greensOmr(String order) {
 System.out.println("The Order is : "+order);
	}
	public void greensOmr(int type) {
System.out.println("The type is : "+type);
	}
	public void greensOmr(long number) {
		System.out.println("The number is : "+number);
	}
	public static void main(String[] args) {
		GreensTech n =new GreensTech();
		n.greensOmr("Java");
		n.greensOmr(658971);
		n.greensOmr(9874561230l);
	}
	
}
