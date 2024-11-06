package com.demo;

public class Employee {

	private void emp(String name) {
		System.out.println("Employee Name:"+name);
	}
	
    private void emp(String address,long mobileNo) {
    	System.out.println("Employee address:"+address);
    	System.out.println("Employee mobileNo:"+mobileNo);
	}

    private void emp(int age) {
    	System.out.println("Employee age:"+age);
    }

    private void emp(long aadharNo,String id) {
    	System.out.println("Emp aadharNo"+aadharNo+"id:"+id);
    	
    }

    private void emp() {
    	System.out.println("Employee Details");
    	System.out.println("==================");
    }

	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.emp();
		e.emp("Jer");
		e.emp("Nagercoil",7530010525l);
		e.emp(21);
		e.emp(3425675432l,"435");
	}
	
}
