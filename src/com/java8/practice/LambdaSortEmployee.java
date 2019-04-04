package com.java8.practice;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	public int eno;
	public String ename;

	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}
	
	public String toString(){
		return ename+" "+eno;
		
	}
}

public class LambdaSortEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(120, "madhu"));
		al.add(new Employee(110, "uday"));
		al.add(new Employee(111, "Rami"));
		//Collections.sort(al, (e1, e2) -> e1.ename.compareTo(e2.ename));
		Collections.sort(al, (e1, e2) -> (e1.eno>e2.eno)? 1 :(e1.eno < e2.eno)?-1:0);
		System.out.println(al);
	}

}
