package org.company;
//Count of arguments
public class CompanyInfo {
	public void CompanyName() {
		System.out.println("The count of arguments");
	}
	public void companyName(String a) {
		System.out.println("The string name is "+a);
	}
	public void CompanyName(String b , int c) {
		System.out.println("The string name and int value is "+"\n"+b+"\n"+c);
	}
	public void CompanyName(long d , char e , boolean f) {
		System.out.println("The long , character, boolean value is "+"\n"+d+"\n"+e+"\n"+f);
	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.CompanyName();
		c.companyName("ABC Technology");
		c.CompanyName("DFL TEchnology", 45654);
		c.CompanyName(7502285165l, 'A', true);
	}
	

}
