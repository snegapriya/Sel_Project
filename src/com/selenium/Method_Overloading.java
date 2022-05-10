package com.selenium;

public class Method_Overloading {
       
	
	public void studentDetails(int a) {
    System.out.println(a);           //datatype
	}
	public void studentDetails(String name,String course,int register) {
    System.out.println(name+" "+course+" "+register);
    }                                  //datatype order
	
	public void studentDetails(int a,int b,int c) {
    System.out.println(a+" "+b+" "+c);    //datatype count
	}
	
	public static void main(String[] args) {
		  
		Method_Overloading s = new Method_Overloading();
		
		s.studentDetails(5);
		s.studentDetails("arun","java",7890);
		s.studentDetails(90, 80, 70);
		}
	}
